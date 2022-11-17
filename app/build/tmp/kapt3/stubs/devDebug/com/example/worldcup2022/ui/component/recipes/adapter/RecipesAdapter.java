package com.example.worldcup2022.ui.component.recipes.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.worldcup2022.data.dto.recipes.Recipes;
import com.example.worldcup2022.data.dto.recipes.RecipesItem;
import com.example.worldcup2022.databinding.RecipeItemBinding;
import com.example.worldcup2022.ui.base.listeners.RecyclerItemListener;
import com.example.worldcup2022.ui.component.recipes.RecipesListViewModel;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/worldcup2022/ui/component/recipes/adapter/RecipesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/worldcup2022/ui/component/recipes/adapter/RecipeViewHolder;", "recipesListViewModel", "Lcom/example/worldcup2022/ui/component/recipes/RecipesListViewModel;", "recipes", "", "Lcom/example/worldcup2022/data/dto/recipes/RecipesItem;", "(Lcom/example/worldcup2022/ui/component/recipes/RecipesListViewModel;Ljava/util/List;)V", "onItemClickListener", "Lcom/example/worldcup2022/ui/base/listeners/RecyclerItemListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_devDebug"})
public final class RecipesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.worldcup2022.ui.component.recipes.adapter.RecipeViewHolder> {
    private final com.example.worldcup2022.ui.component.recipes.RecipesListViewModel recipesListViewModel = null;
    private final java.util.List<com.example.worldcup2022.data.dto.recipes.RecipesItem> recipes = null;
    private final com.example.worldcup2022.ui.base.listeners.RecyclerItemListener onItemClickListener = null;
    
    public RecipesAdapter(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.ui.component.recipes.RecipesListViewModel recipesListViewModel, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.dto.recipes.RecipesItem> recipes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.ui.component.recipes.adapter.RecipeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.ui.component.recipes.adapter.RecipeViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
}