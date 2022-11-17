package com.example.worldcup2022.data.remote;

import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.frames.DataFrames;
import com.example.worldcup2022.data.dto.recipes.Recipes;
import com.example.worldcup2022.data.dto.worldcup.ResponseHighlight;
import com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch;
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch;
import com.example.worldcup2022.data.dto.worldcup.ResponseSelfieFrame;
import com.example.worldcup2022.data.dto.worldcup.SelfieFrame;
import com.example.worldcup2022.data.dto.worldcup.ResponseSound;
import com.example.worldcup2022.data.dto.worldcup.ResponseSquad;
import com.example.worldcup2022.data.dto.worldcup.*;
import okhttp3.RequestBody;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/example/worldcup2022/data/remote/RemoteDataSource;", "", "getResultGuess", "Lcom/example/worldcup2022/data/Resource;", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseResultGuess;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postGuess", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseGuess;", "requestBody", "Lokhttp3/RequestBody;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseUser;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFrames", "Lcom/example/worldcup2022/data/dto/frames/DataFrames;", "requestHighlight", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHighlight;", "filter", "pageSize", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestHistoryMatch", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHistoryMatch;", "requestMatch", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "requestRecipes", "Lcom/example/worldcup2022/data/dto/recipes/Recipes;", "requestSelfieFrame", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSelfieFrame;", "requestSound", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSound;", "requestSquad", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSquad;", "app_devDebug"})
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
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestSound(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSound>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestSquad(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSquad>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestHighlight(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHighlight>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestHistoryMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object registerUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseUser>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getResultGuess(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postGuess(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseGuess>> continuation);
}