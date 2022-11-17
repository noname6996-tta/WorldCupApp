package com.example.worldcup2022.di;

import android.content.Context;
import com.example.worldcup2022.App;
import com.example.worldcup2022.data.local.LocalData;
import com.example.worldcup2022.utils.Network;
import com.example.worldcup2022.utils.NetworkConnectivity;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Singleton;
import kotlin.coroutines.CoroutineContext;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/worldcup2022/di/AppModule;", "", "()V", "provideCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "provideLocalRepository", "Lcom/example/worldcup2022/data/local/LocalData;", "context", "Landroid/content/Context;", "provideNetworkConnectivity", "Lcom/example/worldcup2022/utils/NetworkConnectivity;", "app_devDebug"})
@dagger.Module()
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.worldcup2022.data.local.LocalData provideLocalRepository(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlin.coroutines.CoroutineContext provideCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.worldcup2022.utils.NetworkConnectivity provideNetworkConnectivity(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
}