package com.example.worldcup2022.view.fragment;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.worldcup2022.R;
import com.example.worldcup2022.adapter.HistoryMatchAdapter;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.*;
import com.example.worldcup2022.databinding.FragmentHistoryBinding;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.example.worldcup2022.utils.UtilsKotlin;
import com.orhanobut.hawk.Hawk;
import com.proxglobal.proxads.adsv2.callback.AdsCallback;
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig;
import com.proxglobal.worlcupapp.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.Dispatchers;
import java.util.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\tH\u0002J\b\u0010\'\u001a\u00020\u0002H\u0016J\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002J\u0016\u0010*\u001a\u00020\u001a2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0,H\u0002J\u0016\u0010-\u001a\u00020\u001a2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020 0,H\u0002J\b\u0010.\u001a\u00020\u001aH\u0016J\b\u0010/\u001a\u00020\u001aH\u0016J\b\u00100\u001a\u00020\u001aH\u0016J\b\u00101\u001a\u00020\u001aH\u0016J\b\u00102\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00064"}, d2 = {"Lcom/example/worldcup2022/view/fragment/HistoryFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentHistoryBinding;", "()V", "adapter", "Lcom/example/worldcup2022/adapter/HistoryMatchAdapter;", "handleUpdateData", "Landroid/os/Handler;", "listDatesOnl", "Ljava/util/ArrayList;", "", "getListDatesOnl", "()Ljava/util/ArrayList;", "setListDatesOnl", "(Ljava/util/ArrayList;)V", "listMatchgOnl", "Lcom/example/worldcup2022/data/dto/worldcup/Match;", "getListMatchgOnl", "setListMatchgOnl", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "addObservers", "", "bindListData", "historyMatchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHistoryMatch;", "bindResultGuess", "result", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseResultGuess;", "checkDate", "", "historyMatch", "Lcom/example/worldcup2022/data/dto/worldcup/HistoryMatch;", "listFolderDate", "Lcom/example/worldcup2022/view/fragment/HistoryFragment$MyFolderDate;", "getDataBinding", "getNameDate", "time", "handleHistoryMatchList", "status", "Lcom/example/worldcup2022/data/Resource;", "handleResultGuess", "initData", "initView", "onDestroyView", "onResume", "showLoadingView", "MyFolderDate", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HistoryFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentHistoryBinding> {
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.example.worldcup2022.adapter.HistoryMatchAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> listDatesOnl;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Match> listMatchgOnl;
    private android.os.Handler handleUpdateData;
    
    public HistoryFragment() {
        super();
    }
    
    private final com.example.worldcup2022.ui.component.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getListDatesOnl() {
        return null;
    }
    
    public final void setListDatesOnl(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Match> getListMatchgOnl() {
        return null;
    }
    
    public final void setListMatchgOnl(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Match> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentHistoryBinding getDataBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void addObservers() {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    private final void handleHistoryMatchList(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch> status) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    /**
     */
    private final void handleResultGuess(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess> status) {
    }
    
    private final void showLoadingView() {
    }
    
    private final void bindListData(com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch historyMatchs) {
    }
    
    private final int checkDate(com.example.worldcup2022.data.dto.worldcup.HistoryMatch historyMatch, java.util.ArrayList<com.example.worldcup2022.view.fragment.HistoryFragment.MyFolderDate> listFolderDate) {
        return 0;
    }
    
    private final java.lang.String getNameDate(java.lang.String time) {
        return null;
    }
    
    private final void bindResultGuess(com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess result) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/example/worldcup2022/view/fragment/HistoryFragment$MyFolderDate;", "", "title", "", "list", "Ljava/util/ArrayList;", "Lcom/example/worldcup2022/data/dto/worldcup/HistoryMatch;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class MyFolderDate {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String title;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.HistoryMatch> list;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.worldcup2022.view.fragment.HistoryFragment.MyFolderDate copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.HistoryMatch> list) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public MyFolderDate(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.HistoryMatch> list) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.HistoryMatch> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.HistoryMatch> getList() {
            return null;
        }
        
        public final void setList(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.HistoryMatch> p0) {
        }
    }
}