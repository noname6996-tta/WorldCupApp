package com.example.worldcup2022.data.remote;

import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.frames.DataFrames;
import com.example.worldcup2022.data.dto.recipes.Recipes;
import com.example.worldcup2022.data.dto.recipes.RecipesItem;
import com.example.worldcup2022.data.dto.worldcup.*;
import com.example.worldcup2022.data.remote.service.*;
import com.example.worldcup2022.utils.NetworkConnectivity;
import retrofit2.Response;
import java.io.IOException;
import javax.inject.Inject;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ5\u0010\r\u001a\u0004\u0018\u00010\u000e2 \u0010\u000f\u001a\u001c\b\u0001\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/example/worldcup2022/data/remote/RemoteData;", "Lcom/example/worldcup2022/data/remote/RemoteDataSource;", "serviceGenerator", "Lcom/example/worldcup2022/data/remote/ServiceGenerator;", "networkConnectivity", "Lcom/example/worldcup2022/utils/NetworkConnectivity;", "(Lcom/example/worldcup2022/data/remote/ServiceGenerator;Lcom/example/worldcup2022/utils/NetworkConnectivity;)V", "getResultGuess", "Lcom/example/worldcup2022/data/Resource;", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseResultGuess;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processCall", "", "responseCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseUser;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFrames", "Lcom/example/worldcup2022/data/dto/frames/DataFrames;", "requestHighlight", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHighlight;", "filter", "pageSize", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestMatch", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "requestRecipes", "Lcom/example/worldcup2022/data/dto/recipes/Recipes;", "requestSound", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSound;", "requestSquad", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSquad;", "app_devDebug"})
public final class RemoteData implements com.example.worldcup2022.data.remote.RemoteDataSource {
    private final com.example.worldcup2022.data.remote.ServiceGenerator serviceGenerator = null;
    private final com.example.worldcup2022.utils.NetworkConnectivity networkConnectivity = null;
    
    @javax.inject.Inject()
    public RemoteData(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.remote.ServiceGenerator serviceGenerator, @org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.utils.NetworkConnectivity networkConnectivity) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestRecipes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.recipes.Recipes>> continuation) {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestFrames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.frames.DataFrames>> continuation) {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> continuation) {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestSound(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSound>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestSquad(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSquad>> continuation) {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestHighlight(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHighlight>> continuation) {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object registerUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseUser>> continuation) {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getResultGuess(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess>> continuation) {
        return null;
    }
    
    /**
     */
    private final java.lang.Object processCall(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<?>>, ? extends java.lang.Object> responseCall, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        return null;
    }
}