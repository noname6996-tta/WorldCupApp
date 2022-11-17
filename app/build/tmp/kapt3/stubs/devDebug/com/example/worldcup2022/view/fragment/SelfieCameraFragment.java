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

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/example/worldcup2022/view/fragment/SelfieCameraFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentSelfieCameraBinding;", "()V", "adapter", "Lcom/example/worldcup2022/view/fragment/SelfieFrameAdapter;", "getAdapter", "()Lcom/example/worldcup2022/view/fragment/SelfieFrameAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "addObservers", "", "getDataBinding", "goToCameraFragment", "item", "Lcom/example/worldcup2022/data/dto/worldcup/SelfieFrame;", "initData", "initView", "onResume", "app_devDebug"})
public final class SelfieCameraFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentSelfieCameraBinding> {
    private final kotlin.Lazy adapter$delegate = null;
    private final kotlin.Lazy mainViewModel$delegate = null;
    
    public SelfieCameraFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentSelfieCameraBinding getDataBinding() {
        return null;
    }
    
    private final com.example.worldcup2022.view.fragment.SelfieFrameAdapter getAdapter() {
        return null;
    }
    
    private final com.example.worldcup2022.ui.component.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void addObservers() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    private final void goToCameraFragment(com.example.worldcup2022.data.dto.worldcup.SelfieFrame item) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
}