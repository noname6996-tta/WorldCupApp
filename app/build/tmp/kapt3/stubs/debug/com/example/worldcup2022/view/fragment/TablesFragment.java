package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.worldcup2022.adapter.MatchGroupAdapter;
import com.example.worldcup2022.databinding.FragmentHomeBinding;
import com.example.worldcup2022.databinding.FragmentTablesBinding;
import com.example.worldcup2022.model.Country;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.proxglobal.worlcupapp.base.BaseFragment;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020+H\u0016R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR*\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR*\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/example/worldcup2022/view/fragment/TablesFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentTablesBinding;", "()V", "arrCountrysA", "Ljava/util/ArrayList;", "Lcom/example/worldcup2022/model/Country;", "Lkotlin/collections/ArrayList;", "getArrCountrysA", "()Ljava/util/ArrayList;", "setArrCountrysA", "(Ljava/util/ArrayList;)V", "arrCountrysB", "getArrCountrysB", "setArrCountrysB", "arrCountrysC", "getArrCountrysC", "setArrCountrysC", "arrCountrysD", "getArrCountrysD", "setArrCountrysD", "arrCountrysE", "getArrCountrysE", "setArrCountrysE", "arrCountrysF", "getArrCountrysF", "setArrCountrysF", "arrCountrysG", "getArrCountrysG", "setArrCountrysG", "arrCountrysH", "getArrCountrysH", "setArrCountrysH", "matchGroupAdapterA", "Lcom/example/worldcup2022/adapter/MatchGroupAdapter;", "matchGroupAdapterB", "matchGroupAdapterC", "matchGroupAdapterD", "matchGroupAdapterE", "matchGroupAdapterF", "matchGroupAdapterG", "matchGroupAdapterH", "addEvent", "", "getDataBinding", "initData", "initView", "app_debug"})
public final class TablesFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentTablesBinding> {
    public java.util.ArrayList<com.example.worldcup2022.model.Country> arrCountrysA;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterA = null;
    public java.util.ArrayList<com.example.worldcup2022.model.Country> arrCountrysB;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterB = null;
    public java.util.ArrayList<com.example.worldcup2022.model.Country> arrCountrysC;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterC = null;
    public java.util.ArrayList<com.example.worldcup2022.model.Country> arrCountrysD;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterD = null;
    public java.util.ArrayList<com.example.worldcup2022.model.Country> arrCountrysE;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterE = null;
    public java.util.ArrayList<com.example.worldcup2022.model.Country> arrCountrysF;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterF = null;
    public java.util.ArrayList<com.example.worldcup2022.model.Country> arrCountrysG;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterG = null;
    public java.util.ArrayList<com.example.worldcup2022.model.Country> arrCountrysH;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapterH = null;
    
    public TablesFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.model.Country> getArrCountrysA() {
        return null;
    }
    
    public final void setArrCountrysA(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.model.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.model.Country> getArrCountrysB() {
        return null;
    }
    
    public final void setArrCountrysB(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.model.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.model.Country> getArrCountrysC() {
        return null;
    }
    
    public final void setArrCountrysC(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.model.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.model.Country> getArrCountrysD() {
        return null;
    }
    
    public final void setArrCountrysD(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.model.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.model.Country> getArrCountrysE() {
        return null;
    }
    
    public final void setArrCountrysE(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.model.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.model.Country> getArrCountrysF() {
        return null;
    }
    
    public final void setArrCountrysF(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.model.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.model.Country> getArrCountrysG() {
        return null;
    }
    
    public final void setArrCountrysG(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.model.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.model.Country> getArrCountrysH() {
        return null;
    }
    
    public final void setArrCountrysH(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.model.Country> p0) {
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
}