package com.example.worldcup2022.view.fragment;

import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.Match;
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch;
import com.example.worldcup2022.databinding.FragmentKnockoutStageBinding;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.example.worldcup2022.utils.UtilsKotlin;
import com.orhanobut.hawk.Hawk;
import com.proxglobal.worlcupapp.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0002H\u0016J\u0016\u0010#\u001a\u00020\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0%H\u0002J\b\u0010&\u001a\u00020\u001eH\u0016J\b\u0010\'\u001a\u00020\u001eH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J8\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u00060"}, d2 = {"Lcom/example/worldcup2022/view/fragment/HomeKnockoutFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentKnockoutStageBinding;", "()V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "imgTeam1", "getImgTeam1", "setImgTeam1", "imgTeam2", "getImgTeam2", "setImgTeam2", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "matchsOnl", "", "Lcom/example/worldcup2022/data/dto/worldcup/Match;", "getMatchsOnl", "()Ljava/util/List;", "setMatchsOnl", "(Ljava/util/List;)V", "addObservers", "", "bindListData", "matchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "getDataBinding", "handleMatchsList", "status", "Lcom/example/worldcup2022/data/Resource;", "initData", "initView", "initViewModel", "setData", "time", "textView", "Landroid/widget/TextView;", "imageViewTeam1", "Landroid/widget/ImageView;", "imageViewTeam2", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeKnockoutFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentKnockoutStageBinding> {
    private final kotlin.Lazy mainViewModel$delegate = null;
    public java.util.List<com.example.worldcup2022.data.dto.worldcup.Match> matchsOnl;
    public java.lang.String date;
    public java.lang.String imgTeam1;
    public java.lang.String imgTeam2;
    
    public HomeKnockoutFragment() {
        super();
    }
    
    private final com.example.worldcup2022.ui.component.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.worldcup2022.data.dto.worldcup.Match> getMatchsOnl() {
        return null;
    }
    
    public final void setMatchsOnl(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.dto.worldcup.Match> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImgTeam1() {
        return null;
    }
    
    public final void setImgTeam1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImgTeam2() {
        return null;
    }
    
    public final void setImgTeam2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentKnockoutStageBinding getDataBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void initViewModel() {
    }
    
    @java.lang.Override()
    public void addObservers() {
    }
    
    private final void handleMatchsList(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch> status) {
    }
    
    private final void bindListData(com.example.worldcup2022.data.dto.worldcup.ResponseMatch matchs) {
    }
    
    private final void setData(java.lang.String time, java.lang.String imgTeam1, java.lang.String imgTeam2, android.widget.TextView textView, android.widget.ImageView imageViewTeam1, android.widget.ImageView imageViewTeam2) {
    }
}