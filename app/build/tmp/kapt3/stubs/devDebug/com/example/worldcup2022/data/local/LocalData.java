package com.example.worldcup2022.data.local;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.login.LoginRequest;
import com.example.worldcup2022.data.dto.login.LoginResponse;
import javax.inject.Inject;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\fJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/example/worldcup2022/data/local/LocalData;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "cacheFavourites", "Lcom/example/worldcup2022/data/Resource;", "", "ids", "", "", "doLogin", "Lcom/example/worldcup2022/data/dto/login/LoginResponse;", "loginRequest", "Lcom/example/worldcup2022/data/dto/login/LoginRequest;", "getCachedFavourites", "isFavourite", "id", "removeFromFavourites", "app_devDebug"})
public final class LocalData {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public LocalData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.login.LoginResponse> doLogin(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.dto.login.LoginRequest loginRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.Resource<java.util.Set<java.lang.String>> getCachedFavourites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.Resource<java.lang.Boolean> isFavourite(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.Resource<java.lang.Boolean> cacheFavourites(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> ids) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.Resource<java.lang.Boolean> removeFromFavourites(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
}