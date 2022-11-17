// Generated by view binder compiler. Do not edit!
package com.example.worldcup2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.worldcup2022.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecipeItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView ivRecipeItemImage;

  @NonNull
  public final CardView rlRecipeItem;

  @NonNull
  public final TextView tvCaption;

  @NonNull
  public final TextView tvName;

  private RecipeItemBinding(@NonNull CardView rootView, @NonNull ImageView ivRecipeItemImage,
      @NonNull CardView rlRecipeItem, @NonNull TextView tvCaption, @NonNull TextView tvName) {
    this.rootView = rootView;
    this.ivRecipeItemImage = ivRecipeItemImage;
    this.rlRecipeItem = rlRecipeItem;
    this.tvCaption = tvCaption;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RecipeItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecipeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recipe_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecipeItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_recipe_item_image;
      ImageView ivRecipeItemImage = ViewBindings.findChildViewById(rootView, id);
      if (ivRecipeItemImage == null) {
        break missingId;
      }

      CardView rlRecipeItem = (CardView) rootView;

      id = R.id.tv_caption;
      TextView tvCaption = ViewBindings.findChildViewById(rootView, id);
      if (tvCaption == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      return new RecipeItemBinding((CardView) rootView, ivRecipeItemImage, rlRecipeItem, tvCaption,
          tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
