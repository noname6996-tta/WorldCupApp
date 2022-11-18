package com.example.worldcup2022.view.fragment;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.adapter.StadiumAdapter;
import com.example.worldcup2022.databinding.FragmentStadiumBinding;
import com.example.worldcup2022.data.dto.worldcup.Match;
import com.example.worldcup2022.data.dto.worldcup.Stadium;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.proxglobal.worlcupapp.base.BaseFragment;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/worldcup2022/view/fragment/StadiumFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentStadiumBinding;", "()V", "args", "Lcom/example/worldcup2022/view/fragment/StadiumFragmentArgs;", "getArgs", "()Lcom/example/worldcup2022/view/fragment/StadiumFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "arrStadium", "Ljava/util/ArrayList;", "Lcom/example/worldcup2022/data/dto/worldcup/Stadium;", "Lkotlin/collections/ArrayList;", "getArrStadium", "()Ljava/util/ArrayList;", "setArrStadium", "(Ljava/util/ArrayList;)V", "stadium", "", "getStadium", "()Ljava/util/List;", "setStadium", "(Ljava/util/List;)V", "stadiumAdapter", "Lcom/example/worldcup2022/adapter/StadiumAdapter;", "addEvent", "", "getDataBinding", "initData", "initView", "app_devDebug"})
public final class StadiumFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentStadiumBinding> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final com.example.worldcup2022.adapter.StadiumAdapter stadiumAdapter = null;
    public java.util.List<com.example.worldcup2022.data.dto.worldcup.Stadium> stadium;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Stadium> arrStadium;
    
    public StadiumFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.view.fragment.StadiumFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.worldcup2022.data.dto.worldcup.Stadium> getStadium() {
        return null;
    }
    
    public final void setStadium(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.dto.worldcup.Stadium> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Stadium> getArrStadium() {
        return null;
    }
    
    public final void setArrStadium(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Stadium> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentStadiumBinding getDataBinding() {
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
}