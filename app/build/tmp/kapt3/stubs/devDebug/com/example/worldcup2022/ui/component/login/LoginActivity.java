package com.example.worldcup2022.ui.component.login;

import android.Manifest;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.lifecycle.LiveData;
import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;
import com.permissionx.guolindev.PermissionX;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.login.LoginResponse;
import com.example.worldcup2022.databinding.LoginActivityBinding;
import com.example.worldcup2022.ui.base.BaseActivity;
import com.example.worldcup2022.ui.component.recipes.RecipesListActivity;
import com.example.worldcup2022.utils.*;
import dagger.hilt.android.AndroidEntryPoint;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u001c\u0010\u0017\u001a\u00020\u000e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019H\u0002J\u001c\u0010\u001c\u001a\u00020\u000e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\"\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0012\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010\'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020(H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006."}, d2 = {"Lcom/example/worldcup2022/ui/component/login/LoginActivity;", "Lcom/example/worldcup2022/ui/base/BaseActivity;", "()V", "binding", "Lcom/example/worldcup2022/databinding/LoginActivityBinding;", "checkAction", "", "loginViewModel", "Lcom/example/worldcup2022/ui/component/login/LoginViewModel;", "getLoginViewModel", "()Lcom/example/worldcup2022/ui/component/login/LoginViewModel;", "loginViewModel$delegate", "Lkotlin/Lazy;", "action", "", "checkPermission", "doLogin", "handleLoginResult", "status", "Lcom/example/worldcup2022/data/Resource;", "Lcom/example/worldcup2022/data/dto/login/LoginResponse;", "initViewBinding", "navigateToMainScreen", "observeSnackBarMessages", "event", "Landroidx/lifecycle/LiveData;", "Lcom/example/worldcup2022/utils/SingleEvent;", "", "observeToast", "observeViewModel", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "pickImages", "", "showSingleImage", "uri", "Landroid/net/Uri;", "startBeautyActivity", "path", "app_devDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginActivity extends com.example.worldcup2022.ui.base.BaseActivity {
    private final kotlin.Lazy loginViewModel$delegate = null;
    private com.example.worldcup2022.databinding.LoginActivityBinding binding;
    
    /**
     */
    private boolean checkAction = true;
    
    public LoginActivity() {
        super();
    }
    
    private final com.example.worldcup2022.ui.component.login.LoginViewModel getLoginViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void initViewBinding() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    private final void doLogin() {
    }
    
    private final void showSingleImage(android.net.Uri uri) {
    }
    
    private final void handleLoginResult(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.login.LoginResponse> status) {
    }
    
    private final void navigateToMainScreen() {
    }
    
    private final void observeSnackBarMessages(androidx.lifecycle.LiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> event) {
    }
    
    private final void observeToast(androidx.lifecycle.LiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> event) {
    }
    
    /**
     * test pick image
     */
    private final void pickImages(java.lang.String action) {
    }
    
    /**
     */
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void startBeautyActivity(java.lang.String path) {
    }
    
    private final void action() {
    }
    
    /**
     */
    public final void checkPermission() {
    }
}