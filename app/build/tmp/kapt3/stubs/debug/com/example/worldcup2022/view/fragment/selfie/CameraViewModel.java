package com.example.worldcup2022.view.fragment.selfie;

import android.app.Application;
import android.graphics.*;
import android.util.Log;
import androidx.camera.core.ImageProxy;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.utils.SingleEvent;
import com.google.gson.Gson;
import kotlinx.coroutines.Dispatchers;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bJ\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u000bJ\u0019\u0010(\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u001dH\u0002J$\u0010+\u001a\u00020\u001d*\u00020\u000b2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0012H\u0002J\u001c\u0010-\u001a\u00020.*\u00020\u000b2\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0014H\u0002R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lcom/example/worldcup2022/view/fragment/selfie/CameraViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;)V", "captureEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/worldcup2022/utils/SingleEvent;", "Lcom/example/worldcup2022/data/Resource;", "Landroid/graphics/Bitmap;", "getCaptureEvent", "()Landroidx/lifecycle/MutableLiveData;", "cutBitmap", "cutBitmapLiveData", "getCutBitmapLiveData", "cutRect", "Landroid/graphics/Rect;", "imageCaptureHeight", "", "imageCaptureWidth", "link", "", "maskBitmap", "maskHeight", "maskWidth", "span", "capture", "", "image", "convertImageToFile", "bitmap", "file", "Ljava/io/File;", "getCutBitmapFromCache", "getImageNameOfLink", "getTransparentFrame", "w", "h", "getTransparentRect", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCutBitmapToCache", "crop", "frame", "isTransparencyPixel", "", "x", "y", "app_debug"})
public final class CameraViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private int maskWidth = 0;
    private int maskHeight = 0;
    private int imageCaptureWidth = 0;
    private int imageCaptureHeight = 0;
    private android.graphics.Rect cutRect;
    private int span = 0;
    private android.graphics.Bitmap maskBitmap;
    private android.graphics.Bitmap cutBitmap;
    private java.lang.String link;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<android.graphics.Bitmap>> cutBitmapLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.utils.SingleEvent<com.example.worldcup2022.data.Resource<android.graphics.Bitmap>>> captureEvent = null;
    
    public CameraViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<android.graphics.Bitmap>> getCutBitmapLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.utils.SingleEvent<com.example.worldcup2022.data.Resource<android.graphics.Bitmap>>> getCaptureEvent() {
        return null;
    }
    
    private final java.lang.Object getTransparentRect(android.graphics.Bitmap image, kotlin.coroutines.Continuation<? super android.graphics.Rect> continuation) {
        return null;
    }
    
    private final void crop(android.graphics.Bitmap $this$crop, int w, int h, android.graphics.Rect frame) {
    }
    
    public final void capture(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap image) {
    }
    
    public final void getTransparentFrame(int w, int h, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
    }
    
    private final java.lang.String getImageNameOfLink(java.lang.String link) {
        return null;
    }
    
    private final void saveCutBitmapToCache() {
    }
    
    private final android.graphics.Bitmap getCutBitmapFromCache(java.lang.String link) {
        return null;
    }
    
    private final void convertImageToFile(android.graphics.Bitmap bitmap, java.io.File file) {
    }
    
    private final boolean isTransparencyPixel(android.graphics.Bitmap $this$isTransparencyPixel, int x, int y) {
        return false;
    }
}