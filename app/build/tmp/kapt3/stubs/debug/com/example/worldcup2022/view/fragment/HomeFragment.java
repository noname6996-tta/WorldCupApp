package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.example.worldcup2022.R;
import com.example.worldcup2022.adapter.HomeMatchPagerAdapter;
import com.example.worldcup2022.adapter.InstallAppAdapter;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.Match;
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch;
import com.example.worldcup2022.databinding.FragmentHomeBinding;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.example.worldcup2022.utils.UtilsKotlin;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orhanobut.hawk.Hawk;
import com.proxglobal.worlcupapp.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;
import java.text.SimpleDateFormat;
import java.util.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0016J\u0010\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020+H\u0002J\u0016\u00101\u001a\u00020+2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u000fH\u0002J\b\u00104\u001a\u00020+H\u0002J\b\u00105\u001a\u00020\u0002H\u0016J\u0016\u00106\u001a\u00020+2\f\u00107\u001a\b\u0012\u0004\u0012\u00020/08H\u0002J\b\u00109\u001a\u00020+H\u0016J\b\u0010:\u001a\u00020+H\u0016J\u0010\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020+H\u0016J\b\u0010?\u001a\u00020+H\u0002J\b\u0010@\u001a\u00020+H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00a8\u0006A"}, d2 = {"Lcom/example/worldcup2022/view/fragment/HomeFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentHomeBinding;", "()V", "adapter", "Lcom/example/worldcup2022/adapter/InstallAppAdapter;", "countDownTimer", "Landroid/os/CountDownTimer;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "listDatesOff", "Ljava/util/ArrayList;", "", "getListDatesOff", "()Ljava/util/ArrayList;", "setListDatesOff", "(Ljava/util/ArrayList;)V", "listDatesOnl", "getListDatesOnl", "setListDatesOnl", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "timer", "Ljava/util/Timer;", "getTimer", "()Ljava/util/Timer;", "setTimer", "(Ljava/util/Timer;)V", "update", "Ljava/lang/Runnable;", "getUpdate", "()Ljava/lang/Runnable;", "setUpdate", "(Ljava/lang/Runnable;)V", "addEvent", "", "addObservers", "bindListData", "matchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "countDownTime", "createDateList", "list", "Lcom/example/worldcup2022/data/dto/worldcup/Match;", "createListDateOff", "getDataBinding", "handleMatchsList", "status", "Lcom/example/worldcup2022/data/Resource;", "initData", "initView", "onInfinitePageChangeCallback", "listSize", "", "onResume", "setBanner", "setData", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentHomeBinding> {
    private android.os.CountDownTimer countDownTimer;
    private com.example.worldcup2022.adapter.InstallAppAdapter adapter;
    private final kotlin.Lazy mainViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> listDatesOff;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> listDatesOnl;
    @org.jetbrains.annotations.Nullable()
    private android.os.Handler handler;
    @org.jetbrains.annotations.Nullable()
    private java.util.Timer timer;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Runnable update;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.worldcup2022.ui.component.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentHomeBinding getDataBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getListDatesOff() {
        return null;
    }
    
    public final void setListDatesOff(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getListDatesOnl() {
        return null;
    }
    
    public final void setListDatesOnl(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.os.Handler getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.Nullable()
    android.os.Handler p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Timer getTimer() {
        return null;
    }
    
    public final void setTimer(@org.jetbrains.annotations.Nullable()
    java.util.Timer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Runnable getUpdate() {
        return null;
    }
    
    public final void setUpdate(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable p0) {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void addEvent() {
    }
    
    @java.lang.Override()
    public void addObservers() {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    /**
     */
    private final void countDownTime() {
    }
    
    /**
     */
    private final void createListDateOff() {
    }
    
    private final void handleMatchsList(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch> status) {
    }
    
    private final void bindListData(com.example.worldcup2022.data.dto.worldcup.ResponseMatch matchs) {
    }
    
    private final void createDateList(java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Match> list) {
    }
    
    /**
     */
    private final void setData() {
    }
    
    /**
     */
    private final void setBanner() {
    }
    
    private final void onInfinitePageChangeCallback(int listSize) {
    }
}