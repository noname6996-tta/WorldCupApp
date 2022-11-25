package com.example.worldcup2022.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.Data;
import com.example.worldcup2022.data.dto.worldcup.MyHistoryMatch;
import com.example.worldcup2022.databinding.*;
import java.text.SimpleDateFormat;
import java.util.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006!\"#$%&B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0015H\u0017J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0016\u0010\u001f\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lcom/example/worldcup2022/adapter/HistoryMatchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "list", "", "Lcom/example/worldcup2022/data/dto/worldcup/MyHistoryMatch;", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "isLoadMore", "", "()Z", "setLoadMore", "(Z)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "newList", "Companion", "LoadingViewHolder", "MatchFalseViewHolder", "MatchViewHolder", "MatchWinViewHolder", "TitleViewHolder", "app_debug"})
public final class HistoryMatchAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.worldcup2022.data.dto.worldcup.MyHistoryMatch> list;
    private boolean isLoadMore = true;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.adapter.HistoryMatchAdapter.Companion Companion = null;
    public static final int MATCH = 0;
    public static final int MATCH_WIN = 1;
    public static final int MATCH_FALSE = 2;
    public static final int TITLE = 3;
    public static final int LOADING = 4;
    
    public HistoryMatchAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.dto.worldcup.MyHistoryMatch> list) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.worldcup2022.data.dto.worldcup.MyHistoryMatch> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.dto.worldcup.MyHistoryMatch> p0) {
    }
    
    public final boolean isLoadMore() {
        return false;
    }
    
    public final void setLoadMore(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.dto.worldcup.MyHistoryMatch> newList) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/worldcup2022/adapter/HistoryMatchAdapter$MatchViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/worldcup2022/databinding/ItemHistoryMatchBinding;", "(Lcom/example/worldcup2022/adapter/HistoryMatchAdapter;Lcom/example/worldcup2022/databinding/ItemHistoryMatchBinding;)V", "getBinding$app_debug", "()Lcom/example/worldcup2022/databinding/ItemHistoryMatchBinding;", "app_debug"})
    public final class MatchViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.worldcup2022.databinding.ItemHistoryMatchBinding binding = null;
        
        public MatchViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.worldcup2022.databinding.ItemHistoryMatchBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.worldcup2022.databinding.ItemHistoryMatchBinding getBinding$app_debug() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/worldcup2022/adapter/HistoryMatchAdapter$MatchWinViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/worldcup2022/databinding/ItemHistoryMatchWinBinding;", "(Lcom/example/worldcup2022/adapter/HistoryMatchAdapter;Lcom/example/worldcup2022/databinding/ItemHistoryMatchWinBinding;)V", "getBinding$app_debug", "()Lcom/example/worldcup2022/databinding/ItemHistoryMatchWinBinding;", "app_debug"})
    public final class MatchWinViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.worldcup2022.databinding.ItemHistoryMatchWinBinding binding = null;
        
        public MatchWinViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.worldcup2022.databinding.ItemHistoryMatchWinBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.worldcup2022.databinding.ItemHistoryMatchWinBinding getBinding$app_debug() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/worldcup2022/adapter/HistoryMatchAdapter$MatchFalseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/worldcup2022/databinding/ItemHistoryMatchLoseBinding;", "(Lcom/example/worldcup2022/adapter/HistoryMatchAdapter;Lcom/example/worldcup2022/databinding/ItemHistoryMatchLoseBinding;)V", "getBinding$app_debug", "()Lcom/example/worldcup2022/databinding/ItemHistoryMatchLoseBinding;", "app_debug"})
    public final class MatchFalseViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.worldcup2022.databinding.ItemHistoryMatchLoseBinding binding = null;
        
        public MatchFalseViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.worldcup2022.databinding.ItemHistoryMatchLoseBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.worldcup2022.databinding.ItemHistoryMatchLoseBinding getBinding$app_debug() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/worldcup2022/adapter/HistoryMatchAdapter$TitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/worldcup2022/databinding/ItemTitleHistoryMatchBinding;", "(Lcom/example/worldcup2022/adapter/HistoryMatchAdapter;Lcom/example/worldcup2022/databinding/ItemTitleHistoryMatchBinding;)V", "getBinding$app_debug", "()Lcom/example/worldcup2022/databinding/ItemTitleHistoryMatchBinding;", "app_debug"})
    public final class TitleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.worldcup2022.databinding.ItemTitleHistoryMatchBinding binding = null;
        
        public TitleViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.worldcup2022.databinding.ItemTitleHistoryMatchBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.worldcup2022.databinding.ItemTitleHistoryMatchBinding getBinding$app_debug() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/worldcup2022/adapter/HistoryMatchAdapter$LoadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/worldcup2022/databinding/ItemLoadingBinding;", "(Lcom/example/worldcup2022/adapter/HistoryMatchAdapter;Lcom/example/worldcup2022/databinding/ItemLoadingBinding;)V", "getBinding$app_debug", "()Lcom/example/worldcup2022/databinding/ItemLoadingBinding;", "app_debug"})
    public final class LoadingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.worldcup2022.databinding.ItemLoadingBinding binding = null;
        
        public LoadingViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.worldcup2022.databinding.ItemLoadingBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.worldcup2022.databinding.ItemLoadingBinding getBinding$app_debug() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/worldcup2022/adapter/HistoryMatchAdapter$Companion;", "", "()V", "LOADING", "", "MATCH", "MATCH_FALSE", "MATCH_WIN", "TITLE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}