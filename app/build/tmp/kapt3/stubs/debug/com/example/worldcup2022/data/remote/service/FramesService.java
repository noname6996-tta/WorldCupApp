package com.example.worldcup2022.data.remote.service;

import com.example.worldcup2022.data.dto.frames.DataFrames;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * Created by TruyenDev
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lcom/example/worldcup2022/data/remote/service/FramesService;", "", "fetchFrames", "Lretrofit2/Response;", "Lcom/example/worldcup2022/data/dto/frames/DataFrames;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface FramesService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "frames.json")
    public abstract java.lang.Object fetchFrames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.worldcup2022.data.dto.frames.DataFrames>> continuation);
}