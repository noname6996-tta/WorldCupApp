package com.example.worldcup2022.view.fragment;

import android.annotation.SuppressLint;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.dto.worldcup.Country;
import com.example.worldcup2022.data.dto.worldcup.Match;
import com.example.worldcup2022.data.dto.worldcup.Stadium;
import com.example.worldcup2022.databinding.FragmentMatchInfoBinding;
import com.example.worldcup2022.ui.component.vote.DiaLogVote;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.proxglobal.worlcupapp.base.BaseFragment;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/example/worldcup2022/view/fragment/MatchInFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentMatchInfoBinding;", "()V", "dialogVote", "Lcom/example/worldcup2022/ui/component/vote/DiaLogVote;", "getDialogVote", "()Lcom/example/worldcup2022/ui/component/vote/DiaLogVote;", "setDialogVote", "(Lcom/example/worldcup2022/ui/component/vote/DiaLogVote;)V", "match", "Lcom/example/worldcup2022/data/dto/worldcup/Match;", "getMatch", "()Lcom/example/worldcup2022/data/dto/worldcup/Match;", "setMatch", "(Lcom/example/worldcup2022/data/dto/worldcup/Match;)V", "addEvent", "", "getDataBinding", "initData", "initView", "app_devDebug"})
public final class MatchInFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentMatchInfoBinding> {
    public com.example.worldcup2022.data.dto.worldcup.Match match;
    public com.example.worldcup2022.ui.component.vote.DiaLogVote dialogVote;
    
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
}