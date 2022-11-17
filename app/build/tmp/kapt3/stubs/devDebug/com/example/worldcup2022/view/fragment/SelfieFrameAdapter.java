package com.example.worldcup2022.view.fragment;

import android.Manifest;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.permissionx.guolindev.PermissionX;
import com.proxglobal.worlcupapp.base.BaseFragment;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/worldcup2022/view/fragment/SelfieFrameAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/worldcup2022/data/dto/worldcup/SelfieFrame;", "Lcom/example/worldcup2022/view/fragment/SelfieFrameViewHolder;", "onItemClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_devDebug"})
public final class SelfieFrameAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.worldcup2022.data.dto.worldcup.SelfieFrame, com.example.worldcup2022.view.fragment.SelfieFrameViewHolder> {
    private final kotlin.jvm.functions.Function1<com.example.worldcup2022.data.dto.worldcup.SelfieFrame, kotlin.Unit> onItemClick = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.view.fragment.SelfieFrameAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.worldcup2022.data.dto.worldcup.SelfieFrame> DIFF_CALLBACK = null;
    
    public SelfieFrameAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.worldcup2022.data.dto.worldcup.SelfieFrame, kotlin.Unit> onItemClick) {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/worldcup2022/view/fragment/SelfieFrameAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/worldcup2022/data/dto/worldcup/SelfieFrame;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_devDebug"})
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