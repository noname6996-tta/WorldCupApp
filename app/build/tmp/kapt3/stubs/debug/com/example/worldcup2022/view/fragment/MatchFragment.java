package com.example.worldcup2022.view.fragment;

import android.util.Log;
import android.view.View;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.adapter.MatchPagerAdapter;
import com.example.worldcup2022.data.Data;
import com.example.worldcup2022.databinding.FragmentMatchBinding;
import com.example.worldcup2022.model.Country;
import com.example.worldcup2022.model.Match;
import com.example.worldcup2022.model.Stadium;
import com.example.worldcup2022.view.activity.MainActivity;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.proxglobal.worlcupapp.base.BaseFragment;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\r\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/example/worldcup2022/view/fragment/MatchFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentMatchBinding;", "()V", "args", "Lcom/example/worldcup2022/view/fragment/MatchFragmentArgs;", "getArgs", "()Lcom/example/worldcup2022/view/fragment/MatchFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "isBell", "", "()Z", "setBell", "(Z)V", "addEvent", "", "getDataBinding", "initData", "initView", "Companion", "app_debug"})
public final class MatchFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentMatchBinding> {
    private boolean isBell = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.view.fragment.MatchFragment.Companion Companion = null;
    public static com.example.worldcup2022.model.Match matchFragment;
    
    public MatchFragment() {
        super();
    }
    
    public final boolean isBell() {
        return false;
    }
    
    public final void setBell(boolean p0) {
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
    public void initData() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void addEvent() {
    }
    
    private final void setBell() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/worldcup2022/view/fragment/MatchFragment$Companion;", "", "()V", "matchFragment", "Lcom/example/worldcup2022/model/Match;", "getMatchFragment", "()Lcom/example/worldcup2022/model/Match;", "setMatchFragment", "(Lcom/example/worldcup2022/model/Match;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.worldcup2022.model.Match getMatchFragment() {
            return null;
        }
        
        public final void setMatchFragment(@org.jetbrains.annotations.NotNull()
        com.example.worldcup2022.model.Match p0) {
        }
    }
}