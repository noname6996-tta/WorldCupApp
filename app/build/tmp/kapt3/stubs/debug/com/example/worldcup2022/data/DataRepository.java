package com.example.worldcup2022.data;

import com.example.worldcup2022.data.dto.frames.DataFrames;
import com.example.worldcup2022.data.dto.login.LoginRequest;
import com.example.worldcup2022.data.dto.login.LoginResponse;
import com.example.worldcup2022.data.dto.recipes.Recipes;
import com.example.worldcup2022.data.dto.worldcup.*;
import com.example.worldcup2022.data.local.LocalData;
import com.example.worldcup2022.data.remote.RemoteData;
import kotlinx.coroutines.flow.Flow;
import okhttp3.RequestBody;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\n2\u0006\u0010\u0017\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000b0\n2\u0006\u0010&\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J-\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u000b0\n2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J-\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u000b0\n2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J%\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u000b0\n2\u0006\u0010&\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001d\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u000b0\n2\u0006\u0010&\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u000b0\n2\u0006\u0010&\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006:"}, d2 = {"Lcom/example/worldcup2022/data/DataRepository;", "Lcom/example/worldcup2022/data/DataRepositorySource;", "remoteRepository", "Lcom/example/worldcup2022/data/remote/RemoteData;", "localRepository", "Lcom/example/worldcup2022/data/local/LocalData;", "ioDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/example/worldcup2022/data/remote/RemoteData;Lcom/example/worldcup2022/data/local/LocalData;Lkotlin/coroutines/CoroutineContext;)V", "addToFavourite", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/worldcup2022/data/Resource;", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doLogin", "Lcom/example/worldcup2022/data/dto/login/LoginResponse;", "loginRequest", "Lcom/example/worldcup2022/data/dto/login/LoginRequest;", "(Lcom/example/worldcup2022/data/dto/login/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResultGuess", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseResultGuess;", "userId", "isFavourite", "postGuess", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseGuess;", "requestBody", "Lokhttp3/RequestBody;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerNoti", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseNoti;", "registerUser", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseUser;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFromFavourite", "requestCountry", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseCountry;", "filter", "requestFrames", "Lcom/example/worldcup2022/data/dto/frames/DataFrames;", "requestHighlights", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHighlight;", "pageSize", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestHistoryMatchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHistoryMatch;", "requestMatchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "requestRecipes", "Lcom/example/worldcup2022/data/dto/recipes/Recipes;", "requestSelfieFrame", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSelfieFrame;", "requestSounds", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSound;", "requestSquads", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSquad;", "app_debug"})
public final class DataRepository implements com.example.worldcup2022.data.DataRepositorySource {
    private final com.example.worldcup2022.data.remote.RemoteData remoteRepository = null;
    private final com.example.worldcup2022.data.local.LocalData localRepository = null;
    private final kotlin.coroutines.CoroutineContext ioDispatcher = null;
    
    @javax.inject.Inject()
    public DataRepository(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.remote.RemoteData remoteRepository, @org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.local.LocalData localRepository, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext ioDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestRecipes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.recipes.Recipes>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object doLogin(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.dto.login.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.login.LoginResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addToFavourite(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<java.lang.Boolean>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeFromFavourite(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<java.lang.Boolean>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isFavourite(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<java.lang.Boolean>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestFrames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.frames.DataFrames>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestMatchs(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestSelfieFrame(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSelfieFrame>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestSounds(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSound>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestSquads(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSquad>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestCountry(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseCountry>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestHighlights(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHighlight>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestHistoryMatchs(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object registerUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseUser>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getResultGuess(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object postGuess(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseGuess>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object registerNoti(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseNoti>>> continuation) {
        return null;
    }
}