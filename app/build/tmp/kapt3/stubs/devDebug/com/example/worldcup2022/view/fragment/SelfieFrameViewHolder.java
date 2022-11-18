package com.example.worldcup2022.view.fragment;

import android.Manifest;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.SelfieFrame;
import com.example.worldcup2022.databinding.FragmentSelfieCameraBinding;
import com.example.worldcup2022.databinding.ItemSelfieFrameBinding;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.permissionx.guolindev.PermissionX;
import com.proxglobal.worlcupapp.base.BaseFragment;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/worldcup2022/view/fragment/SelfieFrameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/worldcup2022/databinding/ItemSelfieFrameBinding;", "onItemClick", "Lkotlin/Function1;", "Lcom/example/worldcup2022/data/dto/worldcup/SelfieFrame;", "", "(Lcom/example/worldcup2022/databinding/ItemSelfieFrameBinding;Lkotlin/jvm/functions/Function1;)V", "bindData", "item", "app_devDebug"})
public final class SelfieFrameViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.example.worldcup2022.databinding.ItemSelfieFrameBinding binding = null;
    private final kotlin.jvm.functions.Function1<com.example.worldcup2022.data.dto.worldcup.SelfieFrame, kotlin.Unit> onItemClick = null;
    
    public SelfieFrameViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.databinding.ItemSelfieFrameBinding binding, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.worldcup2022.data.dto.worldcup.SelfieFrame, kotlin.Unit> onItemClick) {
        super(null);
    }
    
    public final void bindData(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.dto.worldcup.SelfieFrame item) {
    }
}