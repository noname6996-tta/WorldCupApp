package com.example.worldcup2022.view.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.worldcup2022.R;
import com.example.worldcup2022.adapter.HighlightAdapter;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.Highlight;
import com.example.worldcup2022.data.dto.worldcup.ResponseHighlight;
import com.example.worldcup2022.databinding.FragmentVideowcBinding;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ntduc.videoplayer.video.player.VideoPlayerActivity;
import com.proxglobal.proxads.adsv2.callback.AdsCallback;
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig;
import com.proxglobal.worlcupapp.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0016\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006!"}, d2 = {"Lcom/example/worldcup2022/view/fragment/VideoWcFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentVideowcBinding;", "()V", "adapter", "Lcom/example/worldcup2022/adapter/HighlightAdapter;", "handleUpdateData", "Landroid/os/Handler;", "isFocusedSearch", "", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "addEvent", "", "addObservers", "bindListData", "highlights", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHighlight;", "getDataBinding", "handleHighlightsList", "status", "Lcom/example/worldcup2022/data/Resource;", "initData", "initView", "onDestroyView", "showLoadingView", "startPlayVideo", "video", "Lcom/example/worldcup2022/data/dto/worldcup/Highlight;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class VideoWcFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentVideowcBinding> {
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.example.worldcup2022.adapter.HighlightAdapter adapter;
    private boolean isFocusedSearch = false;
    private android.os.Handler handleUpdateData;
    
    public VideoWcFragment() {
        super();
    }
    
    private final com.example.worldcup2022.ui.component.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentVideowcBinding getDataBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void addEvent() {
    }
    
    private final void startPlayVideo(com.example.worldcup2022.data.dto.worldcup.Highlight video) {
    }
    
    @java.lang.Override()
    public void addObservers() {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    private final void handleHighlightsList(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHighlight> status) {
    }
    
    private final void showLoadingView() {
    }
    
    private final void bindListData(com.example.worldcup2022.data.dto.worldcup.ResponseHighlight highlights) {
    }
}