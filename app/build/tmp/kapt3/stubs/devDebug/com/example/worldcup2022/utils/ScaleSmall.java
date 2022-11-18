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

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"}, d2 = {"Lcom/example/worldcup2022/utils/ScaleSmall;", "Lcom/daimajia/androidanimations/library/BaseViewAnimator;", "()V", "prepare", "", "target", "Landroid/view/View;", "app_devDebug"})
public final class ScaleSmall extends com.daimajia.androidanimations.library.BaseViewAnimator {
    
    public ScaleSmall() {
        super();
    }
    
    @java.lang.Override()
    protected void prepare(@org.jetbrains.annotations.Nullable()
    android.view.View target) {
    }
}