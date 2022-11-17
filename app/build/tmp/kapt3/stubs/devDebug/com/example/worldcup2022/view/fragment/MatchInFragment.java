package com.example.worldcup2022.view.fragment;

import android.annotation.SuppressLint;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.Country;
import com.example.worldcup2022.data.dto.worldcup.Match;
import com.example.worldcup2022.data.dto.worldcup.ResponseGuess;
import com.example.worldcup2022.data.dto.worldcup.Stadium;
import com.example.worldcup2022.databinding.FragmentMatchInfoBinding;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.example.worldcup2022.ui.component.vote.DiaLogVote;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orhanobut.hawk.Hawk;
import com.proxglobal.worlcupapp.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;
import org.json.JSONObject;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0016\u0010 \u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\"H\u0002J\b\u0010#\u001a\u00020\u0017H\u0016J\b\u0010$\u001a\u00020\u0017H\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006%"}, d2 = {"Lcom/example/worldcup2022/view/fragment/MatchInFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentMatchInfoBinding;", "()V", "dialogVote", "Lcom/example/worldcup2022/ui/component/vote/DiaLogVote;", "getDialogVote", "()Lcom/example/worldcup2022/ui/component/vote/DiaLogVote;", "setDialogVote", "(Lcom/example/worldcup2022/ui/component/vote/DiaLogVote;)V", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "match", "Lcom/example/worldcup2022/data/dto/worldcup/Match;", "getMatch", "()Lcom/example/worldcup2022/data/dto/worldcup/Match;", "setMatch", "(Lcom/example/worldcup2022/data/dto/worldcup/Match;)V", "addEvent", "", "addObservers", "bindListData", "guess", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseGuess;", "getDataBinding", "score1", "", "score2", "guessData", "status", "Lcom/example/worldcup2022/data/Resource;", "initData", "initView", "app_devDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MatchInFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentMatchInfoBinding> {
    public com.example.worldcup2022.data.dto.worldcup.Match match;
    public com.example.worldcup2022.ui.component.vote.DiaLogVote dialogVote;
    private final kotlin.Lazy mainViewModel$delegate = null;
    
    public MatchInFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.dto.worldcup.Match getMatch() {
        return null;
    }
    
    public final void setMatch(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.dto.worldcup.Match p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.ui.component.vote.DiaLogVote getDialogVote() {
        return null;
    }
    
    public final void setDialogVote(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.ui.component.vote.DiaLogVote p0) {
    }
    
    private final com.example.worldcup2022.ui.component.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentMatchInfoBinding getDataBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void addEvent() {
    }
    
    @java.lang.Override()
    public void addObservers() {
    }
    
    /**
     */
    private final void guess(java.lang.String score1, java.lang.String score2) {
    }
    
    private final void guessData(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseGuess> status) {
    }
    
    private final void bindListData(com.example.worldcup2022.data.dto.worldcup.ResponseGuess guess) {
    }
}