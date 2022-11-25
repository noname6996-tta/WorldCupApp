package com.example.worldcup2022;

import android.app.Application;
import android.content.Context;
import com.example.worldcup2022.ui.component.splash.SplashActivity;
import com.google.firebase.FirebaseApp;
import com.proxglobal.proxads.adsv2.admax.openads.AppOpenManager;
import com.proxglobal.proxads.adsv2.admax.openads.MaxOpenAdsApplication;
import com.proxglobal.proxads.adsv2.ads.ProxAds;
import com.proxglobal.purchase.ProxPurchase;
import dagger.hilt.android.HiltAndroidApp;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/example/worldcup2022/App;", "Lcom/proxglobal/proxads/adsv2/admax/openads/MaxOpenAdsApplication;", "()V", "getOpenAdsId", "", "onCreate", "", "app_debug"})
@dagger.hilt.android.HiltAndroidApp()
public class App extends com.proxglobal.proxads.adsv2.admax.openads.MaxOpenAdsApplication {
    
    public App() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getOpenAdsId() {
        return null;
    }
}