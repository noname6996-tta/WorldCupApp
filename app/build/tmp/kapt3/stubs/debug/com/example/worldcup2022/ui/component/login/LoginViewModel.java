package com.example.worldcup2022.ui.component.login;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.worldcup2022.data.DataRepository;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.login.LoginRequest;
import com.example.worldcup2022.data.dto.login.LoginResponse;
import com.example.worldcup2022.ui.base.BaseViewModel;
import com.example.worldcup2022.utils.SingleEvent;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

/**
 * Created by TruyenIT
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\f8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\f8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/example/worldcup2022/ui/component/login/LoginViewModel;", "Lcom/example/worldcup2022/ui/base/BaseViewModel;", "dataRepository", "Lcom/example/worldcup2022/data/DataRepository;", "(Lcom/example/worldcup2022/data/DataRepository;)V", "loginLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/worldcup2022/data/Resource;", "Lcom/example/worldcup2022/data/dto/login/LoginResponse;", "getLoginLiveData", "()Landroidx/lifecycle/LiveData;", "loginLiveDataPrivate", "Landroidx/lifecycle/MutableLiveData;", "getLoginLiveDataPrivate$annotations", "()V", "showSnackBar", "Lcom/example/worldcup2022/utils/SingleEvent;", "", "getShowSnackBar", "showSnackBarPrivate", "getShowSnackBarPrivate$annotations", "showToast", "getShowToast", "showToastPrivate", "getShowToastPrivate$annotations", "doLogin", "", "userName", "", "passWord", "showToastMessage", "errorCode", "", "app_debug"})
public final class LoginViewModel extends com.example.worldcup2022.ui.base.BaseViewModel {
    private final com.example.worldcup2022.data.DataRepository dataRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.login.LoginResponse>> loginLiveDataPrivate = null;
    
    /**
     * Error handling as UI
     */
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> showSnackBarPrivate = null;
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> showToastPrivate = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.DataRepository dataRepository) {
        super();
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    private static void getLoginLiveDataPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.login.LoginResponse>> getLoginLiveData() {
        return null;
    }
    
    /**
     * Error handling as UI
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    private static void getShowSnackBarPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> getShowSnackBar() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    private static void getShowToastPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> getShowToast() {
        return null;
    }
    
    public final void doLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String passWord) {
    }
    
    public final void showToastMessage(int errorCode) {
    }
}