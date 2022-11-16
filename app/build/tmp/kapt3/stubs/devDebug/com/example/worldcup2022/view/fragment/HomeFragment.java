package com.example.worldcup2022.view.fragment;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import com.example.worldcup2022.adapter.HomeMatchPagerAdapter;
import com.example.worldcup2022.data.Data;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.Match;
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch;
import com.example.worldcup2022.databinding.FragmentHomeBinding;
import com.example.worldcup2022.ui.component.main.MainNewActivity;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.example.worldcup2022.utils.UtilsKotlin;
import com.google.android.material.tabs.TabLayoutMediator;
import com.orhanobut.hawk.Hawk;
import com.proxglobal.worlcupapp.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;
import java.text.SimpleDateFormat;
import java.util.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0016\u0010\u001d\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0002H\u0016J\u0016\u0010\"\u001a\u00020\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0$H\u0002J\b\u0010%\u001a\u00020\u0017H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\b\u0010\'\u001a\u00020\u0017H\u0016J\b\u0010(\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006)"}, d2 = {"Lcom/example/worldcup2022/view/fragment/HomeFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentHomeBinding;", "()V", "countDownTimer", "Landroid/os/CountDownTimer;", "listDatesOff", "Ljava/util/ArrayList;", "", "getListDatesOff", "()Ljava/util/ArrayList;", "setListDatesOff", "(Ljava/util/ArrayList;)V", "listDatesOnl", "getListDatesOnl", "setListDatesOnl", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "addEvent", "", "addObservers", "bindListData", "matchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "countDownTime", "createDateList", "list", "Lcom/example/worldcup2022/data/dto/worldcup/Match;", "createListDateOff", "getDataBinding", "handleMatchsList", "status", "Lcom/example/worldcup2022/data/Resource;", "initData", "initView", "onResume", "setData", "app_devDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentHomeBinding> {
    private android.os.CountDownTimer countDownTimer;
    private final kotlin.Lazy mainViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> listDatesOff;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> listDatesOnl;
    
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
}