package com.example.worldcup2022.view.fragment;

import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.worldcup2022.adapter.MatchGroupAdapter;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.Country;
import com.example.worldcup2022.data.dto.worldcup.ResponseCountry;
import com.example.worldcup2022.databinding.FragmentTablesBinding;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.proxglobal.worlcupapp.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000201H\u0016J\u0010\u00103\u001a\u0002012\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\u0002H\u0016J\u0016\u00107\u001a\u0002012\f\u00108\u001a\b\u0012\u0004\u0012\u00020509H\u0002J\b\u0010:\u001a\u000201H\u0016J\b\u0010;\u001a\u000201H\u0016J\b\u0010<\u001a\u000201H\u0016R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR*\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR*\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/example/worldcup2022/view/fragment/TablesFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentTablesBinding;", "()V", "arrCountrysA", "Ljava/util/ArrayList;", "Lcom/example/worldcup2022/data/dto/worldcup/Country;", "Lkotlin/collections/ArrayList;", "getArrCountrysA", "()Ljava/util/ArrayList;", "setArrCountrysA", "(Ljava/util/ArrayList;)V", "arrCountrysB", "getArrCountrysB", "setArrCountrysB", "arrCountrysC", "getArrCountrysC", "setArrCountrysC", "arrCountrysD", "getArrCountrysD", "setArrCountrysD", "arrCountrysE", "getArrCountrysE", "setArrCountrysE", "arrCountrysF", "getArrCountrysF", "setArrCountrysF", "arrCountrysG", "getArrCountrysG", "setArrCountrysG", "arrCountrysH", "getArrCountrysH", "setArrCountrysH", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "matchGroupAdapterA", "Lcom/example/worldcup2022/adapter/MatchGroupAdapter;", "matchGroupAdapterB", "matchGroupAdapterC", "matchGroupAdapterD", "matchGroupAdapterE", "matchGroupAdapterF", "matchGroupAdapterG", "matchGroupAdapterH", "addEvent", "", "addObservers", "bindListData", "matchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseCountry;", "getDataBinding", "handleSoundsList", "status", "Lcom/example/worldcup2022/data/Resource;", "initData", "initView", "initViewModel", "app_devDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TablesFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentTablesBinding> {
    private final kotlin.Lazy mainViewModel$delegate = null;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> arrCountrysA;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterA = null;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> arrCountrysB;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterB = null;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> arrCountrysC;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterC = null;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> arrCountrysD;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterD = null;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> arrCountrysE;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterE = null;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> arrCountrysF;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterF = null;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> arrCountrysG;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterG = null;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> arrCountrysH;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterH = null;
    
    public TablesFragment() {
        super();
    }
    
    private final com.example.worldcup2022.ui.component.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> getArrCountrysA() {
        return null;
    }
    
    public final void setArrCountrysA(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> getArrCountrysB() {
        return null;
    }
    
    public final void setArrCountrysB(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> getArrCountrysC() {
        return null;
    }
    
    public final void setArrCountrysC(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> getArrCountrysD() {
        return null;
    }
    
    public final void setArrCountrysD(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> getArrCountrysE() {
        return null;
    }
    
    public final void setArrCountrysE(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> getArrCountrysF() {
        return null;
    }
    
    public final void setArrCountrysF(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> getArrCountrysG() {
        return null;
    }
    
    public final void setArrCountrysG(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> getArrCountrysH() {
        return null;
    }
    
    public final void setArrCountrysH(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentTablesBinding getDataBinding() {
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
}