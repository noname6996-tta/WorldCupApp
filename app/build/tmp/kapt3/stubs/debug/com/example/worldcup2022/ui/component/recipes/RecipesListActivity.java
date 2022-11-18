package com.example.worldcup2022.ui.component.recipes;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.snackbar.Snackbar;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.recipes.Recipes;
import com.example.worldcup2022.data.dto.recipes.RecipesItem;
import com.example.worldcup2022.databinding.HomeActivityBinding;
import com.example.worldcup2022.ui.base.BaseActivity;
import com.example.worldcup2022.ui.component.recipes.adapter.RecipesAdapter;
import com.example.worldcup2022.utils.*;
import dagger.hilt.android.AndroidEntryPoint;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0014J\u0016\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002\u00a2\u0006\u0002\u0010\u001eJ\u001c\u0010\u001f\u001a\u00020\u000e2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0!H\u0002J\u001c\u0010#\u001a\u00020\u000e2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0!H\u0002J\b\u0010$\u001a\u00020\u000eH\u0016J\u0012\u0010%\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020)H\u0002J\b\u0010.\u001a\u00020\u000eH\u0002J\b\u0010/\u001a\u00020\u000eH\u0002J\u0010\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u00062"}, d2 = {"Lcom/example/worldcup2022/ui/component/recipes/RecipesListActivity;", "Lcom/example/worldcup2022/ui/base/BaseActivity;", "()V", "binding", "Lcom/example/worldcup2022/databinding/HomeActivityBinding;", "recipesAdapter", "Lcom/example/worldcup2022/ui/component/recipes/adapter/RecipesAdapter;", "recipesListViewModel", "Lcom/example/worldcup2022/ui/component/recipes/RecipesListViewModel;", "getRecipesListViewModel", "()Lcom/example/worldcup2022/ui/component/recipes/RecipesListViewModel;", "recipesListViewModel$delegate", "Lkotlin/Lazy;", "bindListData", "", "recipes", "Lcom/example/worldcup2022/data/dto/recipes/Recipes;", "handleRecipesList", "status", "Lcom/example/worldcup2022/data/Resource;", "handleSearch", "query", "", "initViewBinding", "navigateToDetailsScreen", "navigateEvent", "Lcom/example/worldcup2022/utils/SingleEvent;", "Lcom/example/worldcup2022/data/dto/recipes/RecipesItem;", "noSearchResult", "unit", "(Lkotlin/Unit;)V", "observeSnackBarMessages", "event", "Landroidx/lifecycle/LiveData;", "", "observeToast", "observeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "showDataView", "show", "showLoadingView", "showSearchError", "showSearchResult", "recipesItem", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RecipesListActivity extends com.example.worldcup2022.ui.base.BaseActivity {
    private com.example.worldcup2022.databinding.HomeActivityBinding binding;
    private final kotlin.Lazy recipesListViewModel$delegate = null;
    private com.example.worldcup2022.ui.component.recipes.adapter.RecipesAdapter recipesAdapter;
    
    public RecipesListActivity() {
        super();
    }
    
    private final com.example.worldcup2022.ui.component.recipes.RecipesListViewModel getRecipesListViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void initViewBinding() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void handleSearch(java.lang.String query) {
    }
    
    private final void bindListData(com.example.worldcup2022.data.dto.recipes.Recipes recipes) {
    }
    
    private final void navigateToDetailsScreen(com.example.worldcup2022.utils.SingleEvent<com.example.worldcup2022.data.dto.recipes.RecipesItem> navigateEvent) {
    }
    
    private final void observeSnackBarMessages(androidx.lifecycle.LiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> event) {
    }
    
    private final void observeToast(androidx.lifecycle.LiveData<com.example.worldcup2022.utils.SingleEvent<java.lang.Object>> event) {
    }
    
    private final void showSearchError() {
    }
    
    private final void showDataView(boolean show) {
    }
    
    private final void showLoadingView() {
    }
    
    private final void showSearchResult(com.example.worldcup2022.data.dto.recipes.RecipesItem recipesItem) {
    }
    
    private final void noSearchResult(kotlin.Unit unit) {
    }
    
    private final void handleRecipesList(com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.recipes.Recipes> status) {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
}