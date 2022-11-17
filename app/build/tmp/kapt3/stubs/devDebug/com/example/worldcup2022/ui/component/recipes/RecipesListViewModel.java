package com.example.worldcup2022.ui.component.recipes;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.worldcup2022.data.DataRepositorySource;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.recipes.Recipes;
import com.example.worldcup2022.data.dto.recipes.RecipesItem;
import com.example.worldcup2022.ui.base.BaseViewModel;
import com.example.worldcup2022.utils.SingleEvent;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

/**
 * Created by TruyenIT
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020.J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0012J\u000e\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u000202R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000b8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\rR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\tR(\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b \u0010\r\u001a\u0004\b!\u0010\u000fR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00110\u00068F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\tR\"\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00110\u000b8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b&\u0010\rR\u001d\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00110\u00068F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\tR\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00110\u000b8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b*\u0010\r\u00a8\u00063"}, d2 = {"Lcom/example/worldcup2022/ui/component/recipes/RecipesListViewModel;", "Lcom/example/worldcup2022/ui/base/BaseViewModel;", "dataRepositoryRepository", "Lcom/example/worldcup2022/data/DataRepositorySource;", "(Lcom/example/worldcup2022/data/DataRepositorySource;)V", "noSearchFound", "Landroidx/lifecycle/LiveData;", "", "getNoSearchFound", "()Landroidx/lifecycle/LiveData;", "noSearchFoundPrivate", "Landroidx/lifecycle/MutableLiveData;", "getNoSearchFoundPrivate$annotations", "()V", "getNoSearchFoundPrivate", "()Landroidx/lifecycle/MutableLiveData;", "openRecipeDetails", "Lcom/example/worldcup2022/utils/SingleEvent;", "Lcom/example/worldcup2022/data/dto/recipes/RecipesItem;", "getOpenRecipeDetails", "openRecipeDetailsPrivate", "getOpenRecipeDetailsPrivate$annotations", "recipeSearchFound", "getRecipeSearchFound", "recipeSearchFoundPrivate", "getRecipeSearchFoundPrivate$annotations", "getRecipeSearchFoundPrivate", "recipesLiveData", "Lcom/example/worldcup2022/data/Resource;", "Lcom/example/worldcup2022/data/dto/recipes/Recipes;", "getRecipesLiveData", "recipesLiveDataPrivate", "getRecipesLiveDataPrivate$annotations", "getRecipesLiveDataPrivate", "showSnackBar", "", "getShowSnackBar", "showSnackBarPrivate", "getShowSnackBarPrivate$annotations", "showToast", "getShowToast", "showToastPrivate", "getShowToastPrivate$annotations", "getRecipes", "onSearchClick", "recipeName", "", "recipe", "showToastMessage", "errorCode", "", "app_devDebug"})
public final class RecipesListViewModel extends com.example.worldcup2022.ui.base.BaseViewModel {
    private final com.example.worldcup2022.data.DataRepositorySource dataRepositoryRepository = null;
    
    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.recipes.Recipes>> recipesLiveDataPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.dto.recipes.RecipesItem> recipeSearchFoundPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> noSearchFoundPrivate = null;
    
    /**
     * UI actions as event, user action is single one time event, Shouldn't be multiple time consumption
     */
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.utils.SingleEvent<com.example.worldcup2022.data.dto.recipes.RecipesItem>> openRecipeDetailsPrivate = null;
    
    /**
     * Error handling as UI
     */
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> showSnackBarPrivate = null;
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> showToastPrivate = null;
    
    @javax.inject.Inject()
    public RecipesListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.DataRepositorySource dataRepositoryRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.recipes.Recipes>> getRecipesLiveDataPrivate() {
        return null;
    }
    
    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void getRecipesLiveDataPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.recipes.Recipes>> getRecipesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.dto.recipes.RecipesItem> getRecipeSearchFoundPrivate() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void getRecipeSearchFoundPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.dto.recipes.RecipesItem> getRecipeSearchFound() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getNoSearchFoundPrivate() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void getNoSearchFoundPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Unit> getNoSearchFound() {
        return null;
    }
    
    /**
     * UI actions as event, user action is single one time event, Shouldn't be multiple time consumption
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    private static void getOpenRecipeDetailsPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.utils.SingleEvent<com.example.worldcup2022.data.dto.recipes.RecipesItem>> getOpenRecipeDetails() {
        return null;
    }
    
    /**
     * Error handling as UI
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    private static void getShowSnackBarPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> getShowSnackBar() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    private static void getShowToastPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> getShowToast() {
        return null;
    }
    
    public final void getRecipes() {
    }
    
    public final void openRecipeDetails(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.dto.recipes.RecipesItem recipe) {
    }
    
    public final void showToastMessage(int errorCode) {
    }
    
    public final void onSearchClick(@org.jetbrains.annotations.NotNull()
    java.lang.String recipeName) {
    }
}