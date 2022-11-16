package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.worldcup2022.adapter.HomeMathAdapter;
import com.example.worldcup2022.databinding.FragmentHomematchBinding;
import com.example.worldcup2022.model.Match;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.proxglobal.worlcupapp.base.BaseFragment;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fJ\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0002R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/example/worldcup2022/view/fragment/HomeMatchFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentHomematchBinding;", "()V", "arrMatchs", "Ljava/util/ArrayList;", "Lcom/example/worldcup2022/model/Match;", "getArrMatchs", "()Ljava/util/ArrayList;", "setArrMatchs", "(Ljava/util/ArrayList;)V", "daymatch", "", "homeMatchAdapter", "Lcom/example/worldcup2022/adapter/HomeMathAdapter;", "matchs", "", "getMatchs", "()Ljava/util/List;", "setMatchs", "(Ljava/util/List;)V", "addEvent", "", "getDataBinding", "initData", "initView", "newInstance", "date", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setTime", "Companion", "app_devDebug"})
public final class HomeMatchFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentHomematchBinding> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.view.fragment.HomeMatchFragment.Companion Companion = null;
    private static final java.lang.String ARG_DATE = "ARG_DATE";
    private final com.example.worldcup2022.adapter.HomeMathAdapter homeMatchAdapter = null;
    public java.util.List<com.example.worldcup2022.model.Match> matchs;
    public java.util.ArrayList<com.example.worldcup2022.model.Match> arrMatchs;
    private java.lang.String daymatch = "";
    
    public HomeMatchFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.worldcup2022.model.Match> getMatchs() {
        return null;
    }
    
    public final void setMatchs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.model.Match> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.model.Match> getArrMatchs() {
        return null;
    }
    
    public final void setArrMatchs(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.model.Match> p0) {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/worldcup2022/view/fragment/HomeMatchFragment$Companion;", "", "()V", "ARG_DATE", "", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}