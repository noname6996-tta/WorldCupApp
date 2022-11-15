package com.example.worldcup2022.data;

import com.example.worldcup2022.data.dto.frames.DataFrames;
import com.example.worldcup2022.data.dto.login.LoginRequest;
import com.example.worldcup2022.data.dto.login.LoginResponse;
import com.example.worldcup2022.data.dto.recipes.Recipes;
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch;
import com.example.worldcup2022.data.dto.worldcup.ResponseSound;
import kotlinx.coroutines.flow.Flow;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/worldcup2022/data/DataRepositorySource;", "", "addToFavourite", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/worldcup2022/data/Resource;", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doLogin", "Lcom/example/worldcup2022/data/dto/login/LoginResponse;", "loginRequest", "Lcom/example/worldcup2022/data/dto/login/LoginRequest;", "(Lcom/example/worldcup2022/data/dto/login/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavourite", "removeFromFavourite", "requestFrames", "Lcom/example/worldcup2022/data/dto/frames/DataFrames;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestMatchs", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "filter", "requestRecipes", "Lcom/example/worldcup2022/data/dto/recipes/Recipes;", "requestSounds", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSound;", "app_devDebug"})
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
    public abstract java.lang.Object requestSounds(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSound>>> continuation);
}