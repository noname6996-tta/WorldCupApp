package com.example.worldcup2022.view.fragment;

import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.worldcup2022.adapter.MatchGroupAdapter;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.Country;
import com.example.worldcup2022.data.dto.worldcup.ResponseCountry;
import com.example.worldcup2022.databinding.FragmentMatchGroupBinding;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.proxglobal.worlcupapp.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0016\u0010\u001b\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u0015H\u0016R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/worldcup2022/view/fragment/MatchGroupFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentMatchGroupBinding;", "()V", "arrCountrys", "Ljava/util/ArrayList;", "Lcom/example/worldcup2022/data/dto/worldcup/Country;", "Lkotlin/collections/ArrayList;", "getArrCountrys", "()Ljava/util/ArrayList;", "setArrCountrys", "(Ljava/util/ArrayList;)V", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "matchGroupAdapter", "Lcom/example/worldcup2022/adapter/MatchGroupAdapter;", "addEvent", "", "addObservers", "bindListData", "matchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseCountry;", "getDataBinding", "handleSoundsList", "status", "Lcom/example/worldcup2022/data/Resource;", "initData", "initView", "initViewModel", "Companion", "app_devDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MatchGroupFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentMatchGroupBinding> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.view.fragment.MatchGroupFragment.Companion Companion = null;
    public static java.lang.String group;
    private final kotlin.Lazy mainViewModel$delegate = null;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> arrCountrys;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapter = null;
    
    public MatchGroupFragment() {
        super();
    }
    
    private final com.example.worldcup2022.ui.component.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> getArrCountrys() {
        return null;
    }
    
    public final void setArrCountrys(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentMatchGroupBinding getDataBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void addEvent() {
    }
    
    @java.lang.Override()
    public void initViewModel() {
    }
    
    @java.lang.Override()
    public void addObservers() {
    }
    
    private final void handleSoundsList(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseCountry> status) {
    }
    
    private final void bindListData(com.example.worldcup2022.data.dto.worldcup.ResponseCountry matchs) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/worldcup2022/view/fragment/MatchGroupFragment$Companion;", "", "()V", "group", "", "getGroup", "()Ljava/lang/String;", "setGroup", "(Ljava/lang/String;)V", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGroup() {
            return null;
        }
        
        public final void setGroup(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}