package com.example.worldcup2022.data.remote;

import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.frames.DataFrames;
import com.example.worldcup2022.data.dto.recipes.Recipes;
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch;
import com.example.worldcup2022.data.dto.worldcup.ResponseSelfieFrame;
import com.example.worldcup2022.data.dto.worldcup.SelfieFrame;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/worldcup2022/data/remote/RemoteDataSource;", "", "requestFrames", "Lcom/example/worldcup2022/data/Resource;", "Lcom/example/worldcup2022/data/dto/frames/DataFrames;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestMatch", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "filter", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestRecipes", "Lcom/example/worldcup2022/data/dto/recipes/Recipes;", "requestSelfieFrame", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSelfieFrame;", "app_devDebug"})
public abstract interface RemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestRecipes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.recipes.Recipes>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestFrames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.frames.DataFrames>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestSelfieFrame(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSelfieFrame>> continuation);
}