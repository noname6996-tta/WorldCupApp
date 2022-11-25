// Generated by view binder compiler. Do not edit!
package com.example.worldcup2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.worldcup2022.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView imgHeader;

  @NonNull
  public final RelativeLayout rlBanner;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final TextView tvDayCount;

  @NonNull
  public final TextView tvHoursCount;

  @NonNull
  public final TextView tvMinutesCount;

  @NonNull
  public final TextView tvSeconds;

  @NonNull
  public final ViewPager2 viewPagerHome;

  @NonNull
  public final View viewRulerWhite;

  @NonNull
  public final ViewPager2 vpInstallApp;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView,
      @NonNull ImageView imgHeader, @NonNull RelativeLayout rlBanner, @NonNull TabLayout tabLayout,
      @NonNull TextView tvDayCount, @NonNull TextView tvHoursCount,
      @NonNull TextView tvMinutesCount, @NonNull TextView tvSeconds,
      @NonNull ViewPager2 viewPagerHome, @NonNull View viewRulerWhite,
      @NonNull ViewPager2 vpInstallApp) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.imgHeader = imgHeader;
    this.rlBanner = rlBanner;
    this.tabLayout = tabLayout;
    this.tvDayCount = tvDayCount;
    this.tvHoursCount = tvHoursCount;
    this.tvMinutesCount = tvMinutesCount;
    this.tvSeconds = tvSeconds;
    this.viewPagerHome = viewPagerHome;
    this.viewRulerWhite = viewRulerWhite;
    this.vpInstallApp = vpInstallApp;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.imgHeader;
      ImageView imgHeader = ViewBindings.findChildViewById(rootView, id);
      if (imgHeader == null) {
        break missingId;
      }

      id = R.id.rlBanner;
      RelativeLayout rlBanner = ViewBindings.findChildViewById(rootView, id);
      if (rlBanner == null) {
        break missingId;
      }

      id = R.id.tabLayout;
      TabLayout tabLayout = ViewBindings.findChildViewById(rootView, id);
      if (tabLayout == null) {
        break missingId;
      }

      id = R.id.tvDayCount;
      TextView tvDayCount = ViewBindings.findChildViewById(rootView, id);
      if (tvDayCount == null) {
        break missingId;
      }

      id = R.id.tvHoursCount;
      TextView tvHoursCount = ViewBindings.findChildViewById(rootView, id);
      if (tvHoursCount == null) {
        break missingId;
      }

      id = R.id.tvMinutesCount;
      TextView tvMinutesCount = ViewBindings.findChildViewById(rootView, id);
      if (tvMinutesCount == null) {
        break missingId;
      }

      id = R.id.tvSeconds;
      TextView tvSeconds = ViewBindings.findChildViewById(rootView, id);
      if (tvSeconds == null) {
        break missingId;
      }

      id = R.id.viewPagerHome;
      ViewPager2 viewPagerHome = ViewBindings.findChildViewById(rootView, id);
      if (viewPagerHome == null) {
        break missingId;
      }

      id = R.id.viewRulerWhite;
      View viewRulerWhite = ViewBindings.findChildViewById(rootView, id);
      if (viewRulerWhite == null) {
        break missingId;
      }

      id = R.id.vpInstallApp;
      ViewPager2 vpInstallApp = ViewBindings.findChildViewById(rootView, id);
      if (vpInstallApp == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, cardView, imgHeader, rlBanner,
          tabLayout, tvDayCount, tvHoursCount, tvMinutesCount, tvSeconds, viewPagerHome,
          viewRulerWhite, vpInstallApp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}