package com.example.worldcup2022.ui.component.main;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.ResponseUser;
import com.example.worldcup2022.data.dto.worldcup.Stadium;
import com.example.worldcup2022.databinding.ActivityMainBinding;
import com.example.worldcup2022.ui.base.BaseActivity;
import com.google.android.material.navigation.NavigationBarView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orhanobut.hawk.Hawk;
import dagger.hilt.android.AndroidEntryPoint;

/**
 * Created by TruyenDev on 14/11/2022.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\""}, d2 = {"Lcom/example/worldcup2022/ui/component/main/MainNewActivity;", "Lcom/example/worldcup2022/ui/base/BaseActivity;", "()V", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "mainViewModel", "Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "getMainViewModel", "()Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "bindUserData", "", "user", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseUser;", "handleUserData", "status", "Lcom/example/worldcup2022/data/Resource;", "initUi", "initViewBinding", "observeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "preloadStadiumImage", "Companion", "app_devDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainNewActivity extends com.example.worldcup2022.ui.base.BaseActivity {
    public androidx.navigation.NavController navController;
    private androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    private final kotlin.Lazy mainViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.ui.component.main.MainNewActivity.Companion Companion = null;
    public static com.example.worldcup2022.databinding.ActivityMainBinding binding;
    
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
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void handleUserData(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseUser> status) {
    }
    
    private final void bindUserData(com.example.worldcup2022.data.dto.worldcup.ResponseUser user) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/worldcup2022/ui/component/main/MainNewActivity$Companion;", "", "()V", "binding", "Lcom/example/worldcup2022/databinding/ActivityMainBinding;", "getBinding", "()Lcom/example/worldcup2022/databinding/ActivityMainBinding;", "setBinding", "(Lcom/example/worldcup2022/databinding/ActivityMainBinding;)V", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.worldcup2022.databinding.ActivityMainBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.example.worldcup2022.databinding.ActivityMainBinding p0) {
        }
    }
}