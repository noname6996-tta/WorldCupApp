package com.example.worldcup2022.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import javax.inject.Inject;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/worldcup2022/utils/Network;", "Lcom/example/worldcup2022/utils/NetworkConnectivity;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getNetworkInfo", "Landroid/net/NetworkInfo;", "isConnected", "", "app_devDebug"})
public final class Network implements com.example.worldcup2022.utils.NetworkConnectivity {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public Network(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.net.NetworkInfo getNetworkInfo() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isConnected() {
        return false;
    }
}