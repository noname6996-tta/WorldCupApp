package com.example.worldcup2022.ui.component.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.example.worldcup2022.R;
import com.example.worldcup2022.databinding.SplashLayoutBinding;
import com.example.worldcup2022.ui.base.BaseActivity;
import com.example.worldcup2022.ui.component.login.LoginActivity;
import com.example.worldcup2022.ui.component.main.MainNewActivity;
import com.example.worldcup2022.ui.component.recipes.RecipesListActivity;
import com.proxglobal.proxads.adsv2.ads.NativeStyle;
import com.proxglobal.proxads.adsv2.ads.ProxAds;
import com.proxglobal.proxads.adsv2.callback.AdsCallback;
import com.proxglobal.proxads.adsv2.callback.LoadCallback;
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig;
import dagger.hilt.android.AndroidEntryPoint;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0014J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/worldcup2022/ui/component/splash/SplashActivity;", "Lcom/example/worldcup2022/ui/base/BaseActivity;", "()V", "binding", "Lcom/example/worldcup2022/databinding/SplashLayoutBinding;", "initAds", "", "initRemoteConfigAds", "initViewBinding", "navigateToMainScreen", "observeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SplashActivity extends com.example.worldcup2022.ui.base.BaseActivity {
    private com.example.worldcup2022.databinding.SplashLayoutBinding binding;
    
    public SplashActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void initViewBinding() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRemoteConfigAds() {
    }
    
    private final void initAds() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    private final void navigateToMainScreen() {
    }
}