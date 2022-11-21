package com.example.worldcup2022.utils;

import android.animation.ObjectAnimator;
import android.app.Service;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;
import com.example.worldcup2022.App;
import com.example.worldcup2022.R;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u001aP\u0010\u0010\u001a\u00020\u0001*\u00020\u00062!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u0003\u001a\u0012\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004\u001a\u0012\u0010\u0016\u001a\u00020\u0001*\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0004\u001a.\u0010\u001a\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010!\u001a\u00020\t\u001a\n\u0010\"\u001a\u00020\u0001*\u00020\u0006\u001a\u001a\u0010#\u001a\u00020\u0001*\u00020\u00062\u0006\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\t\u001a.\u0010%\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010!\u001a\u00020\t\u001a\n\u0010\'\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010(\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010)\u001a\u00020\u0001*\u00020\u0006\u00a8\u0006*"}, d2 = {"afterTextChanged", "", "Landroid/widget/EditText;", "Lkotlin/Function1;", "", "hideKeyboard", "Landroid/view/View;", "increaseClickArea", "size", "", "loadImage", "Landroid/widget/ImageView;", "resId", "url", "setOnClickListenerWithScaleAnimation", "onClick", "setOnPressListener", "onPress", "Lkotlin/ParameterName;", "name", "view", "onRelease", "setTextFutureExt", "Landroidx/appcompat/widget/AppCompatEditText;", "text", "Landroidx/appcompat/widget/AppCompatTextView;", "setupSnackbar", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "snackbarEvent", "Landroidx/lifecycle/LiveData;", "Lcom/example/worldcup2022/utils/SingleEvent;", "", "timeLength", "showKeyboard", "showSnackbar", "snackbarText", "showToast", "ToastEvent", "toGone", "toInvisible", "toVisible", "app_debug"})
public final class ViewExtKt {
    
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showKeyboard) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideKeyboard) {
    }
    
    public static final void toVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$toVisible) {
    }
    
    public static final void toGone(@org.jetbrains.annotations.NotNull()
    android.view.View $this$toGone) {
    }
    
    public static final void toInvisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$toInvisible) {
    }
    
    /**
     * Transforms static java function Snackbar.make() to an extension function on View.
     */
    public static final void showSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showSnackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String snackbarText, int timeLength) {
    }
    
    /**
     * Triggers a snackbar message when the value contained by snackbarTaskMessageLiveEvent is modified.
     */
    public static final void setupSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setupSnackbar, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> snackbarEvent, int timeLength) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showToast, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> ToastEvent, int timeLength) {
    }
    
    /**
     * Extension function to simplify setting an afterTextChanged action to EditText components.
     */
    public static final void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$afterTextChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> afterTextChanged) {
    }
    
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImage, @androidx.annotation.DrawableRes()
    int resId) {
    }
    
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImage, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public static final void setTextFutureExt(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView $this$setTextFutureExt, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public static final void setTextFutureExt(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatEditText $this$setTextFutureExt, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public static final void setOnPressListener(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setOnPressListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onPress, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onRelease) {
    }
    
    public static final void setOnClickListenerWithScaleAnimation(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setOnClickListenerWithScaleAnimation, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onClick) {
    }
    
    public static final void increaseClickArea(@org.jetbrains.annotations.NotNull()
    android.view.View $this$increaseClickArea, int size) {
    }
}