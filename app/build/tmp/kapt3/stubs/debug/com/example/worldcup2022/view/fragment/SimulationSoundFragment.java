package com.example.worldcup2022.view.fragment;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.worldcup2022.R;
import com.example.worldcup2022.adapter.SimulationSoundAdapter;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.ResponseSound;
import com.example.worldcup2022.data.dto.worldcup.Sound;
import com.example.worldcup2022.databinding.FragmentSimulationSoundBinding;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.proxglobal.proxads.adsv2.callback.AdsCallback;
import com.proxglobal.proxads.adsv2.callback.RewardCallback;
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig;
import com.proxglobal.worlcupapp.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0016\u0010\u001b\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\b\u0010 \u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006!"}, d2 = {"Lcom/example/worldcup2022/view/fragment/SimulationSoundFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentSimulationSoundBinding;", "()V", "adpter", "Lcom/example/worldcup2022/adapter/SimulationSoundAdapter;", "arrSounds", "Ljava/util/ArrayList;", "Lcom/example/worldcup2022/data/dto/worldcup/Sound;", "Lkotlin/collections/ArrayList;", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "addEvent", "", "addObservers", "bindListData", "matchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSound;", "checkForInternet", "", "context", "Landroid/content/Context;", "getDataBinding", "handleSoundsList", "status", "Lcom/example/worldcup2022/data/Resource;", "initData", "initView", "initViewModel", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SimulationSoundFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentSimulationSoundBinding> {
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.example.worldcup2022.adapter.SimulationSoundAdapter adpter;
    private java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Sound> arrSounds;
    
    public SimulationSoundFragment() {
        super();
    }
    
    private final com.example.worldcup2022.ui.component.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentSimulationSoundBinding getDataBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void addEvent() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void initViewModel() {
    }
    
    @java.lang.Override()
    public void addObservers() {
    }
    
    private final void handleSoundsList(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSound> status) {
    }
    
    private final void bindListData(com.example.worldcup2022.data.dto.worldcup.ResponseSound matchs) {
    }
    
    public final boolean checkForInternet(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}