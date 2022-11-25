package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.adapter.MatchPagerAdapter;
import com.example.worldcup2022.data.Data;
import com.example.worldcup2022.data.dto.worldcup.Country;
import com.example.worldcup2022.data.dto.worldcup.Match;
import com.example.worldcup2022.databinding.FragmentMatchBinding;
import com.example.worldcup2022.ui.component.main.MainNewActivity;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.proxglobal.proxads.adsv2.callback.AdsCallback;
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig;
import com.proxglobal.worlcupapp.base.BaseFragment;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u001a\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/worldcup2022/view/fragment/MatchFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentMatchBinding;", "()V", "args", "Lcom/example/worldcup2022/view/fragment/MatchFragmentArgs;", "getArgs", "()Lcom/example/worldcup2022/view/fragment/MatchFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "match", "Lcom/example/worldcup2022/data/dto/worldcup/Match;", "addEvent", "", "getDataBinding", "initData", "initView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MatchFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentMatchBinding> {
    private com.example.worldcup2022.data.dto.worldcup.Match match;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    public MatchFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.view.fragment.MatchFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentMatchBinding getDataBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void addEvent() {
    }
}