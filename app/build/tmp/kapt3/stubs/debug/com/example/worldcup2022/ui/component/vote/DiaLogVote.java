package com.example.worldcup2022.ui.component.vote;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.dto.worldcup.Match;
import com.example.worldcup2022.databinding.LayoutDialogVoteBinding;
import com.google.gson.Gson;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00126\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R>\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/worldcup2022/ui/component/vote/DiaLogVote;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "match", "Lcom/example/worldcup2022/data/dto/worldcup/Match;", "onClickSave", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "score1", "score2", "", "(Landroid/content/Context;Lcom/example/worldcup2022/data/dto/worldcup/Match;Lkotlin/jvm/functions/Function2;)V", "listener", "bind", "Lcom/example/worldcup2022/databinding/LayoutDialogVoteBinding;", "app_debug"})
public final class DiaLogVote extends android.app.Dialog {
    private final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> onClickSave = null;
    
    public DiaLogVote(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.dto.worldcup.Match match, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> onClickSave) {
        super(null);
    }
    
    private final void listener(com.example.worldcup2022.databinding.LayoutDialogVoteBinding bind, com.example.worldcup2022.data.dto.worldcup.Match match) {
    }
}