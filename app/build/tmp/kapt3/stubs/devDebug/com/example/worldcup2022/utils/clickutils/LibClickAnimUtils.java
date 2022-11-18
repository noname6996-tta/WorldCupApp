package com.example.worldcup2022.utils.clickutils;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.github.florent37.viewanimator.ViewAnimator;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/worldcup2022/utils/clickutils/LibClickAnimUtils;", "", "()V", "Companion", "app_devDebug"})
public final class LibClickAnimUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.utils.clickutils.LibClickAnimUtils.Companion Companion = null;
    
    public LibClickAnimUtils() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setScaleWhenClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setOnCustomTouchView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.example.worldcup2022.utils.clickutils.OnCustomTouchListener onCustomTouchListener) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setOnCustomTouchViewScale(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.example.worldcup2022.utils.clickutils.OnCustomClickListener customClickListener) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setOnCustomTouchViewScaleNotOther(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.example.worldcup2022.utils.clickutils.OnCustomClickListener customClickListener) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setOnCustomTouchViewScaleNotOtherWithUnit(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.example.worldcup2022.utils.clickutils.OnCustomClickListener customClickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> touchDown, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> touchUp) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setOnCustomTouchViewAlphaNotOther(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.example.worldcup2022.utils.clickutils.OnCustomClickListener customClickListener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J6\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006H\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/example/worldcup2022/utils/clickutils/LibClickAnimUtils$Companion;", "", "()V", "setOnCustomTouchView", "", "view", "Landroid/view/View;", "onCustomTouchListener", "Lcom/example/worldcup2022/utils/clickutils/OnCustomTouchListener;", "setOnCustomTouchViewAlphaNotOther", "customClickListener", "Lcom/example/worldcup2022/utils/clickutils/OnCustomClickListener;", "setOnCustomTouchViewScale", "setOnCustomTouchViewScaleNotOther", "setOnCustomTouchViewScaleNotOtherWithUnit", "touchDown", "Lkotlin/Function0;", "touchUp", "setScaleWhenClick", "v", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void setScaleWhenClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void setOnCustomTouchView(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        com.example.worldcup2022.utils.clickutils.OnCustomTouchListener onCustomTouchListener) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void setOnCustomTouchViewScale(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        com.example.worldcup2022.utils.clickutils.OnCustomClickListener customClickListener) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void setOnCustomTouchViewScaleNotOther(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        com.example.worldcup2022.utils.clickutils.OnCustomClickListener customClickListener) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void setOnCustomTouchViewScaleNotOtherWithUnit(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        com.example.worldcup2022.utils.clickutils.OnCustomClickListener customClickListener, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> touchDown, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> touchUp) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void setOnCustomTouchViewAlphaNotOther(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        com.example.worldcup2022.utils.clickutils.OnCustomClickListener customClickListener) {
        }
    }
}