package com.example.worldcup2022.view.fragment;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.SelfieFrame;
import com.example.worldcup2022.databinding.FragmentSelfieCameraBinding;
import com.example.worldcup2022.databinding.ItemSelfieFrameBinding;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.permissionx.guolindev.PermissionX;
import com.proxglobal.proxads.adsv2.callback.AdsCallback;
import com.proxglobal.proxads.adsv2.callback.RewardCallback;
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig;
import com.proxglobal.worlcupapp.base.BaseFragment;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/worldcup2022/view/fragment/SelfieFrameAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/worldcup2022/data/dto/worldcup/SelfieFrame;", "Lcom/example/worldcup2022/view/fragment/SelfieFrameViewHolder;", "onItemClick", "Lkotlin/Function2;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_debug"})
public final class SelfieFrameAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.worldcup2022.data.dto.worldcup.SelfieFrame, com.example.worldcup2022.view.fragment.SelfieFrameViewHolder> {
    private final kotlin.jvm.functions.Function2<com.example.worldcup2022.data.dto.worldcup.SelfieFrame, java.lang.Boolean, kotlin.Unit> onItemClick = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.view.fragment.SelfieFrameAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.worldcup2022.data.dto.worldcup.SelfieFrame> DIFF_CALLBACK = null;
    
    public SelfieFrameAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.worldcup2022.data.dto.worldcup.SelfieFrame, ? super java.lang.Boolean, kotlin.Unit> onItemClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.view.fragment.SelfieFrameViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.view.fragment.SelfieFrameViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/worldcup2022/view/fragment/SelfieFrameAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/worldcup2022/data/dto/worldcup/SelfieFrame;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.worldcup2022.data.dto.worldcup.SelfieFrame> getDIFF_CALLBACK() {
            return null;
        }
    }
}