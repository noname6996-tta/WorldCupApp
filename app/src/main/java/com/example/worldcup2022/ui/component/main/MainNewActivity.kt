package com.example.worldcup2022.ui.component.main

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.USER_ID
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.ResponseUser
import com.example.worldcup2022.data.dto.worldcup.Stadium
import com.example.worldcup2022.databinding.ActivityMainBinding
import com.example.worldcup2022.ui.base.BaseActivity
import com.example.worldcup2022.utils.observe
import com.google.android.material.navigation.NavigationBarView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.orhanobut.hawk.Hawk
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by TruyenDev on 14/11/2022.
 */
@AndroidEntryPoint
class MainNewActivity : BaseActivity() {
    lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private val mainViewModel: MainViewModel by viewModels()

    companion object {
        lateinit var binding: ActivityMainBinding
    }

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
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navMain) as NavHostFragment
        navController = navHostFragment.findNavController()

        val mNavigationItemSelected = object : NavigationBarView.OnItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.homeFragment -> {

                        NavigationUI.onNavDestinationSelected(
                            item,
                            navController
                        )
                        return true
                    }
                    R.id.tablesFragment -> {
                        NavigationUI.onNavDestinationSelected(
                            item,
                            navController
                        )
                        return true
                    }
                    R.id.videoWcFragment -> {
                        NavigationUI.onNavDestinationSelected(
                            item,
                            navController
                        )
                        return true
                    }
                    R.id.wcFunFragment -> {
                        NavigationUI.onNavDestinationSelected(
                            item,
                            navController
                        )
                        return true
                    }
                    R.id.historyFragment -> {
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

        binding.bottomMain.setupWithNavController(navController)
        binding.bottomMain.apply {
            setOnItemSelectedListener(mNavigationItemSelected)
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
}