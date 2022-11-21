package com.example.worldcup2022.data.remote.service;

import com.example.worldcup2022.data.dto.worldcup.ResponseCountry;
import com.example.worldcup2022.data.dto.worldcup.ResponseSound;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/worldcup2022/data/remote/service/CountryService;", "", "fetchCountry", "Lretrofit2/Response;", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseCountry;", "filter", "", "pageIndex", "", "pageSize", "sort", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CountryService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "country/search")
    public abstract java.lang.Object fetchCountry(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "filter")
    java.lang.String filter, @retrofit2.http.Query(value = "pageIndex")
    int pageIndex, @retrofit2.http.Query(value = "pageSize")
    int pageSize, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sort")
    java.lang.String sort, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.worldcup2022.data.dto.worldcup.ResponseCountry>> continuation);
}