// Generated by view binder compiler. Do not edit!
package com.example.worldcup2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.worldcup2022.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGroupDetalsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imgBackGroup;

  @NonNull
  public final ImageView imgHeader;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final MaterialCardView materialCardView;

  @NonNull
  public final RecyclerView recAllMatch;

  @NonNull
  public final RecyclerView recMatchGroup;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView tvLogoGroupName;

  @NonNull
  public final View vireBack;

  private FragmentGroupDetalsBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imgBackGroup, @NonNull ImageView imgHeader,
      @NonNull LinearLayout linearLayout, @NonNull MaterialCardView materialCardView,
      @NonNull RecyclerView recAllMatch, @NonNull RecyclerView recMatchGroup,
      @NonNull TextView textView5, @NonNull TextView tvLogoGroupName, @NonNull View vireBack) {
    this.rootView = rootView;
    this.imgBackGroup = imgBackGroup;
    this.imgHeader = imgHeader;
    this.linearLayout = linearLayout;
    this.materialCardView = materialCardView;
    this.recAllMatch = recAllMatch;
    this.recMatchGroup = recMatchGroup;
    this.textView5 = textView5;
    this.tvLogoGroupName = tvLogoGroupName;
    this.vireBack = vireBack;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGroupDetalsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGroupDetalsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_group_detals, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGroupDetalsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgBackGroup;
      ImageView imgBackGroup = ViewBindings.findChildViewById(rootView, id);
      if (imgBackGroup == null) {
        break missingId;
      }

      id = R.id.imgHeader;
      ImageView imgHeader = ViewBindings.findChildViewById(rootView, id);
      if (imgHeader == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.materialCardView;
      MaterialCardView materialCardView = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView == null) {
        break missingId;
      }

      id = R.id.recAllMatch;
      RecyclerView recAllMatch = ViewBindings.findChildViewById(rootView, id);
      if (recAllMatch == null) {
        break missingId;
      }

      id = R.id.recMatchGroup;
      RecyclerView recMatchGroup = ViewBindings.findChildViewById(rootView, id);
      if (recMatchGroup == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.tvLogoGroupName;
      TextView tvLogoGroupName = ViewBindings.findChildViewById(rootView, id);
      if (tvLogoGroupName == null) {
        break missingId;
      }

      id = R.id.vireBack;
      View vireBack = ViewBindings.findChildViewById(rootView, id);
      if (vireBack == null) {
        break missingId;
      }

      return new FragmentGroupDetalsBinding((ConstraintLayout) rootView, imgBackGroup, imgHeader,
          linearLayout, materialCardView, recAllMatch, recMatchGroup, textView5, tvLogoGroupName,
          vireBack);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}