package com.example.worldcup2022.ui.component.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.activity.viewModels
import com.example.worldcup2022.R
import com.example.worldcup2022.databinding.SplashLayoutBinding
import com.example.worldcup2022.ui.base.BaseActivity
import com.example.worldcup2022.ui.component.login.LoginActivity
import com.example.worldcup2022.SPLASH_DELAY
import com.example.worldcup2022.ui.component.main.MainNewActivity
import com.example.worldcup2022.ui.component.recipes.RecipesListActivity
import com.proxglobal.proxads.adsv2.ads.NativeStyle
import com.proxglobal.proxads.adsv2.ads.ProxAds
import com.proxglobal.proxads.adsv2.callback.AdsCallback
import com.proxglobal.proxads.adsv2.callback.LoadCallback
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by TruyenIT
 */
@AndroidEntryPoint
class SplashActivity : BaseActivity(){

    private lateinit var binding: SplashLayoutBinding

    override fun initViewBinding() {
        binding = SplashLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initAds()
        initRemoteConfigAds()
    }

    private fun initRemoteConfigAds() {
        ProxAdsConfig.instance.init(callback = object : LoadCallback {
            override fun onLoadSuccess() {
                navigateToMainScreen()
            }

            override fun onLoadFailed(message: String?) {
                Log.d("ntduc_debug", "RemoteConfigAds onError: $message")
                navigateToMainScreen()
            }
        })
    }

    private fun initAds() {
        ProxAds.instance.initInterstitialAds(
            activity = this,
            adsId = getString(R.string.id_inter_ads)
        )
        ProxAds.instance.initRewardAds(
            activity = this,
            adsId = getString(R.string.id_reward_ads)
        )
    }

    override fun observeViewModel() {
    }

    private fun navigateToMainScreen() {
        ProxAdsConfig.instance.showSplashAds(
            activity = this,
            adsId = getString(R.string.id_splash_ads),
            callback = object : AdsCallback() {
                override fun onClosed() {
                    val nextScreenIntent = Intent(this@SplashActivity, MainNewActivity::class.java)
                    startActivity(nextScreenIntent)
                    finish()
                }

                override fun onError(message: String?) {
                    Log.d("ntduc_debug", "SplashAds onError: $message")
                    val nextScreenIntent = Intent(this@SplashActivity, MainNewActivity::class.java)
                    startActivity(nextScreenIntent)
                    finish()
                }
            })
    }
}
