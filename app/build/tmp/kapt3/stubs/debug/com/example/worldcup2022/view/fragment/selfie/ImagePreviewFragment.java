package com.example.worldcup2022.view.fragment.selfie;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.databinding.FragmentImagePreviewBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.proxglobal.proxads.adsv2.callback.AdsCallback;
import com.proxglobal.proxads.adsv2.callback.RewardCallback;
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig;
import com.proxglobal.worlcupapp.base.BaseFragment;
import kotlinx.coroutines.Dispatchers;
import java.io.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/worldcup2022/view/fragment/selfie/ImagePreviewFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentImagePreviewBinding;", "()V", "bitmap", "Landroid/graphics/Bitmap;", "imageFile", "Ljava/io/File;", "isSaved", "", "()Z", "setSaved", "(Z)V", "addEvent", "", "convertImageToFile", "getDataBinding", "initView", "onDestroy", "onResume", "saveImage", "shareImage", "app_debug"})
public final class ImagePreviewFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentImagePreviewBinding> {
    private android.graphics.Bitmap bitmap;
    private boolean isSaved = false;
    private java.io.File imageFile;
    
    public ImagePreviewFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentImagePreviewBinding getDataBinding() {
        return null;
    }
    
    public final boolean isSaved() {
        return false;
    }
    
    public final void setSaved(boolean p0) {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    private final void convertImageToFile() {
    }
    
    @java.lang.Override()
    public void addEvent() {
    }
    
    private final void saveImage() {
    }
    
    private final void shareImage() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
}