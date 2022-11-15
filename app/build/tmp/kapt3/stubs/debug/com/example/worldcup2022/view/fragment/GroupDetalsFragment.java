package com.example.worldcup2022.view.fragment;

import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.worldcup2022.adapter.HomeMathAdapterBorder;
import com.example.worldcup2022.adapter.MatchGroupAdapter;
import com.example.worldcup2022.databinding.FragmentGroupDetalsBinding;
import com.example.worldcup2022.model.Country;
import com.example.worldcup2022.model.Match;
import com.example.worldcup2022.view.activity.MainActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.proxglobal.worlcupapp.base.BaseFragment;
import java.io.IOException;
import kotlin.collections.ArrayList;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u0002H\u0016J\b\u0010)\u001a\u00020\'H\u0016J\b\u0010*\u001a\u00020\'H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006+"}, d2 = {"Lcom/example/worldcup2022/view/fragment/GroupDetalsFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentGroupDetalsBinding;", "()V", "args", "Lcom/example/worldcup2022/view/fragment/GroupInfoFragmentArgs;", "getArgs", "()Lcom/example/worldcup2022/view/fragment/GroupInfoFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "arrCountrys", "Ljava/util/ArrayList;", "Lcom/example/worldcup2022/model/Country;", "Lkotlin/collections/ArrayList;", "getArrCountrys", "()Ljava/util/ArrayList;", "setArrCountrys", "(Ljava/util/ArrayList;)V", "arrMatchs", "Lcom/example/worldcup2022/model/Match;", "getArrMatchs", "setArrMatchs", "groupMatch", "", "getGroupMatch", "()Ljava/lang/String;", "setGroupMatch", "(Ljava/lang/String;)V", "homeMatchAdapter", "Lcom/example/worldcup2022/adapter/HomeMathAdapterBorder;", "matchGroupAdapter", "Lcom/example/worldcup2022/adapter/MatchGroupAdapter;", "matchs", "", "getMatchs", "()Ljava/util/List;", "setMatchs", "(Ljava/util/List;)V", "addEvent", "", "getDataBinding", "initData", "initView", "app_debug"})
public final class GroupDetalsFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentGroupDetalsBinding> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String groupMatch = "";
    public java.util.ArrayList<com.example.worldcup2022.model.Country> arrCountrys;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapter = null;
    private final com.example.worldcup2022.adapter.HomeMathAdapterBorder homeMatchAdapter = null;
    public java.util.List<com.example.worldcup2022.model.Match> matchs;
    public java.util.ArrayList<com.example.worldcup2022.model.Match> arrMatchs;
    
    public GroupDetalsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.view.fragment.GroupInfoFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGroupMatch() {
        return null;
    }
    
    public final void setGroupMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.model.Country> getArrCountrys() {
        return null;
    }
    
    public final void setArrCountrys(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.model.Country> p0) {
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
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentGroupDetalsBinding getDataBinding() {
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