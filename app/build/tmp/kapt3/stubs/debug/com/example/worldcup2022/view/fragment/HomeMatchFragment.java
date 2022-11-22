package com.example.worldcup2022.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.worldcup2022.R;
import com.example.worldcup2022.adapter.HomeMathAdapter;
import com.example.worldcup2022.data.Data;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.Match;
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch;
import com.example.worldcup2022.databinding.FragmentHomematchBinding;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.example.worldcup2022.utils.UtilsKotlin;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orhanobut.hawk.Hawk;
import com.proxglobal.proxads.adsv2.callback.AdsCallback;
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig;
import com.proxglobal.worlcupapp.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import kotlin.collections.ArrayList;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0002H\u0016J\u0016\u0010%\u001a\u00020 2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\'H\u0002J\b\u0010(\u001a\u00020 H\u0016J\b\u0010)\u001a\u00020 H\u0016J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\rJ\u0012\u0010,\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020 H\u0016J\b\u00100\u001a\u00020 H\u0002R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b\u00a8\u00062"}, d2 = {"Lcom/example/worldcup2022/view/fragment/HomeMatchFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentHomematchBinding;", "()V", "arrMatchs", "Ljava/util/ArrayList;", "Lcom/example/worldcup2022/data/dto/worldcup/Match;", "Lkotlin/collections/ArrayList;", "getArrMatchs", "()Ljava/util/ArrayList;", "setArrMatchs", "(Ljava/util/ArrayList;)V", "daymatch", "", "homeMatchAdapter", "Lcom/example/worldcup2022/adapter/HomeMathAdapter;", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "matchs", "", "getMatchs", "()Ljava/util/List;", "setMatchs", "(Ljava/util/List;)V", "matchsOnl", "getMatchsOnl", "setMatchsOnl", "addEvent", "", "addObservers", "bindListData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "getDataBinding", "handleMatchsList", "status", "Lcom/example/worldcup2022/data/Resource;", "initData", "initView", "newInstance", "date", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setTime", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeMatchFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentHomematchBinding> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.view.fragment.HomeMatchFragment.Companion Companion = null;
    private static final java.lang.String ARG_DATE = "ARG_DATE";
    private final kotlin.Lazy mainViewModel$delegate = null;
    private final com.example.worldcup2022.adapter.HomeMathAdapter homeMatchAdapter = null;
    public java.util.List<com.example.worldcup2022.data.dto.worldcup.Match> matchs;
    public java.util.List<com.example.worldcup2022.data.dto.worldcup.Match> matchsOnl;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Match> arrMatchs;
    private java.lang.String daymatch = "";
    
    public HomeMatchFragment() {
        super();
    }
    
    private final com.example.worldcup2022.ui.component.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.worldcup2022.data.dto.worldcup.Match> getMatchs() {
        return null;
    }
    
    public final void setMatchs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.dto.worldcup.Match> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.worldcup2022.data.dto.worldcup.Match> getMatchsOnl() {
        return null;
    }
    
    public final void setMatchsOnl(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.dto.worldcup.Match> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Match> getArrMatchs() {
        return null;
    }
    
    public final void setArrMatchs(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Match> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.view.fragment.HomeMatchFragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void addObservers() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentHomematchBinding getDataBinding() {
        return null;
    }
    
    private final void setTime() {
    }
    
    @java.lang.Override()
    public void addEvent() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void handleMatchsList(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch> status) {
    }
    
    private final void bindListData(com.example.worldcup2022.data.dto.worldcup.ResponseMatch matchs) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/worldcup2022/view/fragment/HomeMatchFragment$Companion;", "", "()V", "ARG_DATE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}