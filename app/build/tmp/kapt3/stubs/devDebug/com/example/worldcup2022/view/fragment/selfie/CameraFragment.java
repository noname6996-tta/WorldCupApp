package com.example.worldcup2022.view.fragment.selfie;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.*;
import androidx.camera.core.ImageCapture.OnImageCapturedCallback;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.databinding.FragmentCameraBinding;
import com.proxglobal.worlcupapp.base.BaseFragment;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/worldcup2022/view/fragment/selfie/CameraFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentCameraBinding;", "()V", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "cameraViewModel", "Lcom/example/worldcup2022/view/fragment/selfie/CameraViewModel;", "getCameraViewModel", "()Lcom/example/worldcup2022/view/fragment/selfie/CameraViewModel;", "cameraViewModel$delegate", "Lkotlin/Lazy;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "addEvent", "", "addObservers", "capture", "getDataBinding", "hideLoadingArea", "initView", "onDestroyView", "setupCamera", "showLoadingArea", "app_devDebug"})
public final class CameraFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentCameraBinding> {
    private final kotlin.Lazy cameraViewModel$delegate = null;
    private java.util.concurrent.ExecutorService cameraExecutor;
    private androidx.camera.core.ImageCapture imageCapture;
    
    public CameraFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentCameraBinding getDataBinding() {
        return null;
    }
    
    private final com.example.worldcup2022.view.fragment.selfie.CameraViewModel getCameraViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void addEvent() {
    }
    
    @java.lang.Override()
    public void addObservers() {
    }
    
    private final void showLoadingArea() {
    }
    
    private final void hideLoadingArea() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    private final void capture() {
    }
    
    private final void setupCamera() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}