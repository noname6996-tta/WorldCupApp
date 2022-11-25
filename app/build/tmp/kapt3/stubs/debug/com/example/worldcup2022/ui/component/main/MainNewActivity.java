package com.example.worldcup2022.ui.component.main;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.BuildConfig;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.ResponseUser;
import com.example.worldcup2022.data.dto.worldcup.Stadium;
import com.example.worldcup2022.databinding.ActivityMainBinding;
import com.example.worldcup2022.ui.base.BaseActivity;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orhanobut.hawk.Hawk;
import com.proxglobal.proxads.ProxUtils;
import com.proxglobal.rate.ProxRateConfig;
import com.proxglobal.rate.ProxRateDialog;
import com.proxglobal.rate.RatingDialogListener;
import dagger.hilt.android.AndroidEntryPoint;
import org.json.JSONObject;

/**
 * Created by TruyenDev on 14/11/2022.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0016\u0010\u001f\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0!H\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0014J\b\u0010%\u001a\u00020\u001cH\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\u0012\u0010\'\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020\bH\u0016J\b\u0010+\u001a\u00020\u001cH\u0002J\b\u0010,\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006-"}, d2 = {"Lcom/example/worldcup2022/ui/component/main/MainNewActivity;", "Lcom/example/worldcup2022/ui/base/BaseActivity;", "()V", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "binding", "Lcom/example/worldcup2022/databinding/ActivityMainBinding;", "isExit", "", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "getNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "setNavHostFragment", "(Landroidx/navigation/fragment/NavHostFragment;)V", "bindUserData", "", "user", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseUser;", "handleUserData", "status", "Lcom/example/worldcup2022/data/Resource;", "initDialogRate", "initUi", "initViewBinding", "observeViewModel", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "preloadStadiumImage", "registerNoti", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainNewActivity extends com.example.worldcup2022.ui.base.BaseActivity {
    public androidx.navigation.NavController navController;
    public androidx.navigation.fragment.NavHostFragment navHostFragment;
    private androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.example.worldcup2022.databinding.ActivityMainBinding binding;
    private boolean isExit = false;
    
    public MainNewActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.fragment.NavHostFragment getNavHostFragment() {
        return null;
    }
    
    public final void setNavHostFragment(@org.jetbrains.annotations.NotNull()
    androidx.navigation.fragment.NavHostFragment p0) {
    }
    
    private final com.example.worldcup2022.ui.component.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void initViewBinding() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    private final void preloadStadiumImage() {
    }
    
    private final void initUi() {
    }
    
    private final void initDialogRate() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void handleUserData(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseUser> status) {
    }
    
    private final void bindUserData(com.example.worldcup2022.data.dto.worldcup.ResponseUser user) {
    }
    
    private final void registerNoti() {
    }
}