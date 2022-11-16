package com.example.worldcup2022.view.fragment;

import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.worldcup2022.adapter.GroupMatchAdapter;
import com.example.worldcup2022.databinding.FragmentGroupinfoBinding;
import com.example.worldcup2022.data.dto.worldcup.Match;
import com.example.worldcup2022.ui.component.main.MainNewActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.proxglobal.worlcupapp.base.BaseFragment;
import java.io.IOException;
import kotlin.collections.ArrayList;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/worldcup2022/view/fragment/GroupInfoFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentGroupinfoBinding;", "()V", "args", "Lcom/example/worldcup2022/view/fragment/GroupInfoFragmentArgs;", "getArgs", "()Lcom/example/worldcup2022/view/fragment/GroupInfoFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "arrMatchs", "Ljava/util/ArrayList;", "Lcom/example/worldcup2022/data/dto/worldcup/Match;", "Lkotlin/collections/ArrayList;", "getArrMatchs", "()Ljava/util/ArrayList;", "setArrMatchs", "(Ljava/util/ArrayList;)V", "groupMathAdapter", "Lcom/example/worldcup2022/adapter/GroupMatchAdapter;", "matchs", "", "getMatchs", "()Ljava/util/List;", "setMatchs", "(Ljava/util/List;)V", "addEvent", "", "getDataBinding", "initData", "initView", "app_devDebug"})
public final class GroupInfoFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentGroupinfoBinding> {
    private final com.example.worldcup2022.adapter.GroupMatchAdapter groupMathAdapter = null;
    public java.util.List<com.example.worldcup2022.data.dto.worldcup.Match> matchs;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Match> arrMatchs;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    public GroupInfoFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.worldcup2022.data.dto.worldcup.Match> getMatchs() {
        return null;
    }
    
    public final void setMatchs(@org.jetbrains.annotations.NotNull()
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
    public final com.example.worldcup2022.view.fragment.GroupInfoFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentGroupinfoBinding getDataBinding() {
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
}