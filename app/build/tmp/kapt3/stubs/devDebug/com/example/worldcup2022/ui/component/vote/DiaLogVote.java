package com.example.worldcup2022.ui.component.vote;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.dto.worldcup.Match;
import com.example.worldcup2022.databinding.LayoutDialogVoteBinding;
import com.google.gson.Gson;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u00a8\u0006\u000b"}, d2 = {"Lcom/example/worldcup2022/ui/component/vote/DiaLogVote;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "match", "Lcom/example/worldcup2022/data/dto/worldcup/Match;", "(Landroid/content/Context;Lcom/example/worldcup2022/data/dto/worldcup/Match;)V", "listener", "", "bind", "Lcom/example/worldcup2022/databinding/LayoutDialogVoteBinding;", "app_devDebug"})
public final class DiaLogVote extends android.app.Dialog {
    
    public DiaLogVote(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.dto.worldcup.Match match) {
        super(null);
    }
    
    private final void listener(com.example.worldcup2022.databinding.LayoutDialogVoteBinding bind, com.example.worldcup2022.data.dto.worldcup.Match match) {
    }
}