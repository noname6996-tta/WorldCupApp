// Generated by view binder compiler. Do not edit!
package com.example.worldcup2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.worldcup2022.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragemntHomegroupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FrameLayout adContainer;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imgHeader;

  @NonNull
  public final TabLayout tabLayoutHomeGroup;

  @NonNull
  public final View viewBack;

  @NonNull
  public final ViewPager2 viewPagerHomeGroup;

  @NonNull
  public final View viewRuler;

  private FragemntHomegroupBinding(@NonNull ConstraintLayout rootView,
      @NonNull FrameLayout adContainer, @NonNull ImageView imageView3, @NonNull ImageView imgHeader,
      @NonNull TabLayout tabLayoutHomeGroup, @NonNull View viewBack,
      @NonNull ViewPager2 viewPagerHomeGroup, @NonNull View viewRuler) {
    this.rootView = rootView;
    this.adContainer = adContainer;
    this.imageView3 = imageView3;
    this.imgHeader = imgHeader;
    this.tabLayoutHomeGroup = tabLayoutHomeGroup;
    this.viewBack = viewBack;
    this.viewPagerHomeGroup = viewPagerHomeGroup;
    this.viewRuler = viewRuler;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragemntHomegroupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragemntHomegroupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragemnt_homegroup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragemntHomegroupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ad_container;
      FrameLayout adContainer = ViewBindings.findChildViewById(rootView, id);
      if (adContainer == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imgHeader;
      ImageView imgHeader = ViewBindings.findChildViewById(rootView, id);
      if (imgHeader == null) {
        break missingId;
      }

      id = R.id.tabLayoutHomeGroup;
      TabLayout tabLayoutHomeGroup = ViewBindings.findChildViewById(rootView, id);
      if (tabLayoutHomeGroup == null) {
        break missingId;
      }

      id = R.id.viewBack;
      View viewBack = ViewBindings.findChildViewById(rootView, id);
      if (viewBack == null) {
        break missingId;
      }

      id = R.id.viewPagerHomeGroup;
      ViewPager2 viewPagerHomeGroup = ViewBindings.findChildViewById(rootView, id);
      if (viewPagerHomeGroup == null) {
        break missingId;
      }

      id = R.id.viewRuler;
      View viewRuler = ViewBindings.findChildViewById(rootView, id);
      if (viewRuler == null) {
        break missingId;
      }

      return new FragemntHomegroupBinding((ConstraintLayout) rootView, adContainer, imageView3,
          imgHeader, tabLayoutHomeGroup, viewBack, viewPagerHomeGroup, viewRuler);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}