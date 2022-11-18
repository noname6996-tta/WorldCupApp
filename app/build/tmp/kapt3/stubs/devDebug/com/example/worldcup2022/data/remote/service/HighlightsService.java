package com.example.worldcup2022.data.remote.service;

import com.example.worldcup2022.data.dto.worldcup.ResponseHighlight;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by DucNT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/worldcup2022/data/remote/service/HighlightsService;", "", "fetchHighlights", "Lretrofit2/Response;", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHighlight;", "filter", "", "pageIndex", "", "pageSize", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_devDebug"})
public abstract interface HighlightsService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "image/search")
    public abstract java.lang.Object fetchHighlights(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "filter")
    java.lang.String filter, @retrofit2.http.Query(value = "pageIndex")
    int pageIndex, @retrofit2.http.Query(value = "pageSize")
    int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.worldcup2022.data.dto.worldcup.ResponseHighlight>> continuation);
}