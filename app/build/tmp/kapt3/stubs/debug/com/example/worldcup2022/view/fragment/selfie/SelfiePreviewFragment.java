package com.example.worldcup2022.view.fragment.selfie;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.daasuu.gpuv.camerarecorder.CameraRecordListener;
import com.daasuu.gpuv.camerarecorder.GPUCameraRecorder;
import com.daasuu.gpuv.camerarecorder.GPUCameraRecorderBuilder;
import com.daasuu.gpuv.camerarecorder.LensFacing;
import com.daasuu.gpuv.widget.SampleCameraGLView;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.example.worldcup2022.R;
import com.example.worldcup2022.databinding.FragmentSelfiePreviewBinding;
import com.example.worldcup2022.utils.*;
import com.proxglobal.worlcupapp.base.BaseFragment;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\'\u001a\u00020(H\u0016J\u001c\u0010)\u001a\u00020(2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020(0+H\u0002J\u001a\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005H\u0002J\b\u00100\u001a\u00020\u0002H\u0016J\b\u00101\u001a\u00020(H\u0016J\b\u00102\u001a\u00020(H\u0016J\b\u00103\u001a\u00020(H\u0016J\b\u00104\u001a\u00020(H\u0016J\b\u00105\u001a\u00020(H\u0002J\b\u00106\u001a\u00020(H\u0002J\b\u00107\u001a\u00020(H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR\u001a\u0010$\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\t\u00a8\u00068"}, d2 = {"Lcom/example/worldcup2022/view/fragment/selfie/SelfiePreviewFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentSelfiePreviewBinding;", "()V", "cameraHeight", "", "getCameraHeight", "()I", "setCameraHeight", "(I)V", "cameraWidth", "getCameraWidth", "setCameraWidth", "filepath", "", "gpuCameraRecorder", "Lcom/daasuu/gpuv/camerarecorder/GPUCameraRecorder;", "getGpuCameraRecorder", "()Lcom/daasuu/gpuv/camerarecorder/GPUCameraRecorder;", "setGpuCameraRecorder", "(Lcom/daasuu/gpuv/camerarecorder/GPUCameraRecorder;)V", "lensFacing", "Lcom/daasuu/gpuv/camerarecorder/LensFacing;", "getLensFacing", "()Lcom/daasuu/gpuv/camerarecorder/LensFacing;", "setLensFacing", "(Lcom/daasuu/gpuv/camerarecorder/LensFacing;)V", "recordBtn", "Landroid/widget/TextView;", "sampleGLView", "Lcom/daasuu/gpuv/widget/SampleCameraGLView;", "toggleClick", "", "videoHeight", "getVideoHeight", "setVideoHeight", "videoWidth", "getVideoWidth", "setVideoWidth", "addEvent", "", "captureBitmap", "onReady", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "createBitmapFromGLSurface", "w", "h", "getDataBinding", "initView", "onDestroy", "onResume", "onStop", "releaseCamera", "setUpCameraView", "setupCamera", "app_debug"})
public final class SelfiePreviewFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentSelfiePreviewBinding> {
    private com.daasuu.gpuv.widget.SampleCameraGLView sampleGLView;
    @org.jetbrains.annotations.Nullable()
    private com.daasuu.gpuv.camerarecorder.GPUCameraRecorder gpuCameraRecorder;
    private final java.lang.String filepath = null;
    private final android.widget.TextView recordBtn = null;
    @org.jetbrains.annotations.NotNull()
    private com.daasuu.gpuv.camerarecorder.LensFacing lensFacing = com.daasuu.gpuv.camerarecorder.LensFacing.FRONT;
    private int cameraWidth = 1280;
    private int cameraHeight = 720;
    private int videoWidth = 720;
    private int videoHeight = 720;
    private boolean toggleClick = false;
    
    public SelfiePreviewFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentSelfiePreviewBinding getDataBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.daasuu.gpuv.camerarecorder.GPUCameraRecorder getGpuCameraRecorder() {
        return null;
    }
    
    protected final void setGpuCameraRecorder(@org.jetbrains.annotations.Nullable()
    com.daasuu.gpuv.camerarecorder.GPUCameraRecorder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.daasuu.gpuv.camerarecorder.LensFacing getLensFacing() {
        return null;
    }
    
    protected final void setLensFacing(@org.jetbrains.annotations.NotNull()
    com.daasuu.gpuv.camerarecorder.LensFacing p0) {
    }
    
    protected final int getCameraWidth() {
        return 0;
    }
    
    protected final void setCameraWidth(int p0) {
    }
    
    protected final int getCameraHeight() {
        return 0;
    }
    
    protected final void setCameraHeight(int p0) {
    }
    
    protected final int getVideoWidth() {
        return 0;
    }
    
    protected final void setVideoWidth(int p0) {
    }
    
    protected final int getVideoHeight() {
        return 0;
    }
    
    protected final void setVideoHeight(int p0) {
    }
    
    private final void setUpCameraView() {
    }
    
    @java.lang.Override()
    public void addEvent() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void setupCamera() {
    }
    
    private final void releaseCamera() {
    }
    
    private final void captureBitmap(kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onReady) {
    }
    
    private final android.graphics.Bitmap createBitmapFromGLSurface(int w, int h) {
        return null;
    }
}