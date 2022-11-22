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

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/worldcup2022/view/fragment/SelfieFrameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/worldcup2022/databinding/ItemSelfieFrameBinding;", "onItemClick", "Lkotlin/Function2;", "Lcom/example/worldcup2022/data/dto/worldcup/SelfieFrame;", "", "", "(Lcom/example/worldcup2022/databinding/ItemSelfieFrameBinding;Lkotlin/jvm/functions/Function2;)V", "bindData", "item", "position", "", "app_debug"})
public final class SelfieFrameViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.example.worldcup2022.databinding.ItemSelfieFrameBinding binding = null;
    private final kotlin.jvm.functions.Function2<com.example.worldcup2022.data.dto.worldcup.SelfieFrame, java.lang.Boolean, kotlin.Unit> onItemClick = null;
    
    public SelfieFrameViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.databinding.ItemSelfieFrameBinding binding, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.worldcup2022.data.dto.worldcup.SelfieFrame, ? super java.lang.Boolean, kotlin.Unit> onItemClick) {
        super(null);
    }
    
    public final void bindData(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.dto.worldcup.SelfieFrame item, int position) {
    }
}