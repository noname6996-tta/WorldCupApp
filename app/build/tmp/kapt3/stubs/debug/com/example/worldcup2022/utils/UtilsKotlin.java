package com.example.worldcup2022.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.*;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by TruyenDev on 30/10/2022.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\tJ \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u0018\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f\u00a8\u0006 "}, d2 = {"Lcom/example/worldcup2022/utils/UtilsKotlin;", "", "()V", "darkenText", "Landroid/graphics/Bitmap;", "bmp", "contrast", "", "formatDate", "", "time", "", "getResizedBitmap", "bm", "newHeight", "", "openApp", "", "activity", "Landroid/app/Activity;", "packageName", "parseTime", "timeInString", "parseTimeEEEddMMM", "replaceColor", "src", "fromColor", "targetColor", "saveToInternalStorageCrop", "croppedBitmap", "context", "Landroid/content/Context;", "app_debug"})
public final class UtilsKotlin {
    
    public UtilsKotlin() {
        super();
    }
    
    /**
     */
    private final android.graphics.Bitmap getResizedBitmap(android.graphics.Bitmap bm, int newHeight) {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.NotNull()
    public android.graphics.Bitmap replaceColor(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap src, int fromColor, int targetColor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap darkenText(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bmp, float contrast) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String saveToInternalStorageCrop(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap croppedBitmap, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final long parseTime(@org.jetbrains.annotations.NotNull()
    java.lang.String timeInString) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDate(long time) {
        return null;
    }
    
    public final long parseTimeEEEddMMM(@org.jetbrains.annotations.NotNull()
    java.lang.String timeInString) {
        return 0L;
    }
    
    public final void openApp(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName) {
    }
}