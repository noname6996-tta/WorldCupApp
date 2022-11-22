package com.example.worldcup2022.ui.component.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.example.worldcup2022.BuildConfig
import com.example.worldcup2022.R
import com.example.worldcup2022.USER_ID
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.ResponseUser
import com.example.worldcup2022.data.dto.worldcup.Stadium
import com.example.worldcup2022.databinding.ActivityMainBinding
import com.example.worldcup2022.ui.base.BaseActivity
import com.example.worldcup2022.utils.observe
import com.google.android.material.navigation.NavigationBarView
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.orhanobut.hawk.Hawk
import com.proxglobal.proxads.ProxUtils
import com.proxglobal.rate.ProxRateConfig
import com.proxglobal.rate.ProxRateDialog
import com.proxglobal.rate.RatingDialogListener
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject

/**
 * Created by TruyenDev on 14/11/2022.
 */
@AndroidEntryPoint
class MainNewActivity : BaseActivity() {
    lateinit var navController: NavController
    lateinit var navHostFragment: NavHostFragment
    private lateinit var appBarConfiguration: AppBarConfiguration
    private val mainViewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun initViewBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Hawk.init(this).build()
        initUi()
        Thread {
            preloadStadiumImage()
        }.start()

        val userId = Hawk.get<String>(USER_ID, "")
        if (userId.isEmpty()) {
            mainViewModel.getRegisterUser()
        }

        //Push Update
        ProxUtils.INSTANCE.initFirebaseRemoteConfig(
            activity = this,
            appVersionCode = BuildConfig.VERSION_CODE,
            isDebug = BuildConfig.DEBUG,
            iconAppId = R.drawable.logo,
            appName = getString(R.string.app_name)
        )

        registerNoti()
    }

    override fun observeViewModel() {
        observe(mainViewModel.userLiveData, ::handleUserData)
    }


    private fun preloadStadiumImage() {
        val fileInString: String =
            assets.open("Stadium.json").bufferedReader().use { it.readText() }
        var stadiums: List<Stadium> =
            Gson().fromJson(fileInString, object : TypeToken<List<Stadium>>() {}.type)
        stadiums.forEach {
            Glide.with(this)
                .load(it.image)
                .preload()
        }
    }

    private fun initUi() {
        navHostFragment = supportFragmentManager.findFragmentById(R.id.navMain) as NavHostFragment
        navController = navHostFragment.findNavController()
        binding.bottomMain.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { _: NavController?, navDestination: NavDestination, _: Bundle? ->
            when (navDestination.id) {
                R.id.homeFragment, R.id.tablesFragment, R.id.videoWcFragment, R.id.wcFunFragment, R.id.historyFragment -> {
                    binding.bottomMain.visibility = View.VISIBLE
                }
                else -> {
                    binding.bottomMain.visibility = View.GONE
                }
            }
        }
        val mNavigationItemSelected = object : NavigationBarView.OnItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.homeFragment -> {
                        FirebaseAnalytics.getInstance(this@MainNewActivity)
                            .logEvent("Layout_click_IconHome", Bundle())

                        NavigationUI.onNavDestinationSelected(
                            item,
                            navController
                        )
                        return true
                    }
                    R.id.tablesFragment -> {
                        FirebaseAnalytics.getInstance(this@MainNewActivity)
                            .logEvent("Layout_click_IconTables", Bundle())

                        NavigationUI.onNavDestinationSelected(
                            item,
                            navController
                        )
                        return true
                    }
                    R.id.videoWcFragment -> {
                        FirebaseAnalytics.getInstance(this@MainNewActivity)
                            .logEvent("Layout_click_IconVideoWc", Bundle())

                        NavigationUI.onNavDestinationSelected(
                            item,
                            navController
                        )
                        return true
                    }
                    R.id.wcFunFragment -> {
                        FirebaseAnalytics.getInstance(this@MainNewActivity)
                            .logEvent("Layout_click_IconWcfun", Bundle())

                        NavigationUI.onNavDestinationSelected(
                            item,
                            navController
                        )
                        return true
                    }
                    R.id.historyFragment -> {
                        FirebaseAnalytics.getInstance(this@MainNewActivity)
                            .logEvent("Layout_click_IconStatistics", Bundle())

                        NavigationUI.onNavDestinationSelected(
                            item,
                            navController
                        )
                        return true
                    }
                    else -> {
                        return false
                    }
                }
            }
        }
        binding.bottomMain.setOnItemSelectedListener(mNavigationItemSelected)

        initDialogRate()

        val sp = getSharedPreferences("prox", Context.MODE_PRIVATE)
        var count_start = sp.getInt("key_count_start", 1)
        if (count_start > 1) {
            try {
                ProxRateDialog.showIfNeed(this, supportFragmentManager)
            } catch (e: Exception) {
            }
        }
        count_start++
        sp.edit().putInt("key_count_start", count_start).apply()
    }

    private fun initDialogRate() {
        val config = ProxRateConfig()
        config.listener = object : RatingDialogListener() {
            override fun onSubmitButtonClicked(rate: Int, comment: String) {
                val bundle = Bundle()
                bundle.putString("event_type", "rated")
                bundle.putString("comment", comment)
                bundle.putString("star", "$rate star")
                FirebaseAnalytics.getInstance(this@MainNewActivity)
                    .logEvent("prox_rating_layout", bundle)
            }

            override fun onLaterButtonClicked() {
                val bundle = Bundle()
                bundle.putString("event_type", "cancel")
                FirebaseAnalytics.getInstance(this@MainNewActivity)
                    .logEvent("prox_rating_layout", bundle)

                if (isExit) {
                    finish()
                }
            }

            override fun onChangeStar(rate: Int) {
                if (rate >= 4) {
                    val bundle = Bundle()
                    bundle.putString("event_type", "rated")
                    bundle.putString("star", "$rate star")
                    FirebaseAnalytics.getInstance(this@MainNewActivity)
                        .logEvent("prox_rating_layout", bundle)

                    if (isExit) {
                        finish()
                    }
                }
            }

            override fun onDone() {
                if (isExit) {
                    finish()
                }
            }
        }
        ProxRateDialog.init()
        ProxRateDialog.setConfig(config)
    }

    private var isExit = false
    override fun onBackPressed() {
        val backStackEntryCount = navHostFragment.childFragmentManager.backStackEntryCount
        if (backStackEntryCount > 0) {
            if (!navController.popBackStack()) {
                finish()
            }
            return
        } else {
            if (!ProxRateDialog.isRated(this)) {
                isExit = true
                try {
                    ProxRateDialog.showAlways(supportFragmentManager)
                } catch (e: Exception) {
                    finish()
                }
            } else {
                finish()
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun handleUserData(status: Resource<ResponseUser>) {
        when (status) {
            is Resource.Loading -> {
                Log.e("Home", "handleUserData: Loading ")
            }
            is Resource.Success -> status.data?.let { bindUserData(user = it) }
            is Resource.DataError -> {
                status.errorCode?.let { Log.e("Home", "handleUserData: Error " + it) }
            }
        }
    }

    private fun bindUserData(user: ResponseUser) {
        Hawk.put(USER_ID, user.data)
        Log.e("TAG", "bindUserData: " + user.data)
    }


    private fun registerNoti() {
        val fcm = Hawk.get<String>("FCM", "")
        val jsonObject = JSONObject()
        jsonObject.put("deviceId", fcm)
        val jsonObjectString = jsonObject.toString()
        val requestBody = jsonObjectString.toRequestBody("application/json".toMediaTypeOrNull())
        mainViewModel.registerNoti(requestBody)
    }
}