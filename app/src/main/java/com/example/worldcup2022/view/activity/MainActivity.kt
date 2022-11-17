package com.example.worldcup2022.view.activity

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.databinding.ActivityMainBinding
import com.example.worldcup2022.data.dto.worldcup.Stadium
import com.google.android.material.navigation.NavigationBarView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    companion object {
        lateinit var binding: ActivityMainBinding
    }

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        initUi()
        Thread {
            preloadStadiumImage()
        }.start()
        setContentView(binding.root)
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
        navController.addOnDestinationChangedListener(object : NavController.OnDestinationChangedListener{
            override fun onDestinationChanged(
                controller: NavController,
                destination: NavDestination,
                arguments: Bundle?
            ) {
                when(destination.id){
                    R.id.matchFragment, R.id.homeGroupFragment,R.id.groupInfoFragment,R.id.squadFragment,R.id.groupDetalsFragment,R.id.playSoundFragment ->{
                        binding.bottomMain.visibility = View.GONE
                    }
                    else -> {
                        binding.bottomMain.visibility = View.VISIBLE
                    }
                }
            }
        })
        val mNavigationItemSelected = object : NavigationBarView.OnItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.homeFragment -> {
                        Log.d(javaClass.name, "initView: ${navController.currentDestination?.displayName}")
//                        if (navController.currentDestination?.displayName== "fragment_allgroup" ){
//                                navController.popBackStack()
//                            }
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
}