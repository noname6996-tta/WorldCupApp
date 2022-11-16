package com.example.worldcup2022.ui.base.listeners;

import com.example.worldcup2022.data.dto.recipes.RecipesItem;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/worldcup2022/ui/base/listeners/RecyclerItemListener;", "", "onItemSelected", "", "recipe", "Lcom/example/worldcup2022/data/dto/recipes/RecipesItem;", "app_devDebug"})
public abstract interface RecyclerItemListener {
    
    public abstract void onItemSelected(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.dto.recipes.RecipesItem recipe);
}