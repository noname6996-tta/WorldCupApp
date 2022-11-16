package com.example.worldcup2022.data.remote.service;

import com.example.worldcup2022.data.dto.recipes.RecipesItem;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/worldcup2022/data/remote/service/RecipesService;", "", "fetchRecipes", "Lretrofit2/Response;", "", "Lcom/example/worldcup2022/data/dto/recipes/RecipesItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_devDebug"})
public abstract interface RecipesService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "recipes.json")
    public abstract java.lang.Object fetchRecipes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.example.worldcup2022.data.dto.recipes.RecipesItem>>> continuation);
}