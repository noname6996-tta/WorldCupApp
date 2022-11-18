package com.example.worldcup2022.data;

import com.example.worldcup2022.data.dto.frames.DataFrames;
import com.example.worldcup2022.data.dto.login.LoginRequest;
import com.example.worldcup2022.data.dto.login.LoginResponse;
import com.example.worldcup2022.data.dto.recipes.Recipes;
import com.example.worldcup2022.data.dto.worldcup.*;
import kotlinx.coroutines.flow.Flow;
import okhttp3.RequestBody;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00040\u00032\u0006\u0010\u001f\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ-\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J-\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00040\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J%\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00040\u00032\u0006\u0010\u001f\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ%\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00040\u00032\u0006\u0010\u001f\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00040\u00032\u0006\u0010\u001f\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00063"}, d2 = {"Lcom/example/worldcup2022/data/DataRepositorySource;", "", "addToFavourite", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/worldcup2022/data/Resource;", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doLogin", "Lcom/example/worldcup2022/data/dto/login/LoginResponse;", "loginRequest", "Lcom/example/worldcup2022/data/dto/login/LoginRequest;", "(Lcom/example/worldcup2022/data/dto/login/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResultGuess", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseResultGuess;", "userId", "isFavourite", "postGuess", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseGuess;", "requestBody", "Lokhttp3/RequestBody;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerNoti", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseNoti;", "registerUser", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseUser;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFromFavourite", "requestCountry", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseCountry;", "filter", "requestFrames", "Lcom/example/worldcup2022/data/dto/frames/DataFrames;", "requestHighlights", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHighlight;", "pageSize", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestHistoryMatchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHistoryMatch;", "requestMatchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "requestRecipes", "Lcom/example/worldcup2022/data/dto/recipes/Recipes;", "requestSelfieFrame", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSelfieFrame;", "requestSounds", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSound;", "requestSquads", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSquad;", "app_debug"})
public abstract interface DataRepositorySource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestRecipes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.recipes.Recipes>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object doLogin(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.dto.login.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.login.LoginResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addToFavourite(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<java.lang.Boolean>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeFromFavourite(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<java.lang.Boolean>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isFavourite(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<java.lang.Boolean>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestFrames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.frames.DataFrames>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestMatchs(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestSelfieFrame(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSelfieFrame>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestSounds(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSound>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestSquads(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSquad>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestCountry(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseCountry>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestHighlights(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHighlight>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestHistoryMatchs(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object registerUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseUser>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getResultGuess(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postGuess(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseGuess>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object registerNoti(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseNoti>>> continuation);
}