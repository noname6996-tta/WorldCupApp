package com.example.worldcup2022.view.fragment;

import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.adapter.SquadAdapter;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.Country;
import com.example.worldcup2022.data.dto.worldcup.ResponseSquad;
import com.example.worldcup2022.data.dto.worldcup.Squad;
import com.example.worldcup2022.databinding.FragmentSquadBinding;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.proxglobal.worlcupapp.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0002H\u0016J\u0016\u0010#\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0%H\u0002J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010\'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006,"}, d2 = {"Lcom/example/worldcup2022/view/fragment/SquadFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentSquadBinding;", "()V", "adapterDefenders", "Lcom/example/worldcup2022/adapter/SquadAdapter;", "adapterForwards", "adapterGoalkeeper", "adapterMidfielders", "args", "Lcom/example/worldcup2022/view/fragment/SquadFragmentArgs;", "getArgs", "()Lcom/example/worldcup2022/view/fragment/SquadFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "arrSquadsDefenders", "Ljava/util/ArrayList;", "Lcom/example/worldcup2022/data/dto/worldcup/Squad;", "Lkotlin/collections/ArrayList;", "arrSquadsForwards", "arrSquadsGoalkeeper", "arrSquadsMidfielders", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "addEvent", "", "addObservers", "bindListData", "matchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSquad;", "getDataBinding", "handleSoundsList", "status", "Lcom/example/worldcup2022/data/Resource;", "initData", "initView", "initViewModel", "setLayoutManager", "a", "Landroidx/recyclerview/widget/RecyclerView;", "app_devDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SquadFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentSquadBinding> {
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.example.worldcup2022.adapter.SquadAdapter adapterGoalkeeper;
    private com.example.worldcup2022.adapter.SquadAdapter adapterDefenders;
    private com.example.worldcup2022.adapter.SquadAdapter adapterMidfielders;
    private com.example.worldcup2022.adapter.SquadAdapter adapterForwards;
    private java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Squad> arrSquadsGoalkeeper;
    private java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Squad> arrSquadsDefenders;
    private java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Squad> arrSquadsMidfielders;
    private java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Squad> arrSquadsForwards;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    public SquadFragment() {
        super();
    }
    
    private final com.example.worldcup2022.ui.component.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentSquadBinding getDataBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.view.fragment.SquadFragmentArgs getArgs() {
        return null;
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
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    private final void setLayoutManager(androidx.recyclerview.widget.RecyclerView a) {
    }
    
    private final void handleSoundsList(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSquad> status) {
    }
    
    private final void bindListData(com.example.worldcup2022.data.dto.worldcup.ResponseSquad matchs) {
    }
}