package com.example.worldcup2022

import android.app.Application
import android.content.Context
import com.google.firebase.FirebaseApp
import com.proxglobal.proxads.adsv2.admax.openads.MaxOpenAdsApplication
import com.proxglobal.proxads.adsv2.ads.ProxAds
import com.proxglobal.purchase.ProxPurchase
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by TruyenIT
 */
@HiltAndroidApp
open class App :  MaxOpenAdsApplication(){
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(getApplicationContext());
        ProxPurchase.getInstance().initBilling(this)
        ProxAds.instance.initMax(context = this)

    }
    override fun getOpenAdsId(): String = getString(R.string.id_open_ads)

}
