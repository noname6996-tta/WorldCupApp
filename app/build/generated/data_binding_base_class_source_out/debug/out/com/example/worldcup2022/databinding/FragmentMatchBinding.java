// Generated by view binder compiler. Do not edit!
package com.example.worldcup2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.worldcup2022.R;
import com.google.android.material.tabs.TabLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMatchBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FrameLayout adContainer;

  @NonNull
  public final ImageView imgHeader;

  @NonNull
  public final CircleImageView imgTeam2;

  @NonNull
  public final ImageView imgbackGroup;

  @NonNull
  public final CircleImageView imgteam1;

  @NonNull
  public final View rulerMatch;

  @NonNull
  public final TabLayout tabLayoutMatch;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView tvDateMatchGroup;

  @NonNull
  public final TextView tvGoal;

  @NonNull
  public final TextView tvGroupName;

  @NonNull
  public final TextView tvGroupname;

  @NonNull
  public final TextView tvStadiumMatch;

  @NonNull
  public final TextView tvTeam1;

  @NonNull
  public final TextView tvTeam2;

  @NonNull
  public final TextView tvTimeMatch;

  @NonNull
  public final View view2;

  @NonNull
  public final View viewBack;

  @NonNull
  public final ViewPager2 viewPagerMatch;

  private FragmentMatchBinding(@NonNull ConstraintLayout rootView, @NonNull FrameLayout adContainer,
      @NonNull ImageView imgHeader, @NonNull CircleImageView imgTeam2,
      @NonNull ImageView imgbackGroup, @NonNull CircleImageView imgteam1, @NonNull View rulerMatch,
      @NonNull TabLayout tabLayoutMatch, @NonNull TextView textView,
      @NonNull TextView tvDateMatchGroup, @NonNull TextView tvGoal, @NonNull TextView tvGroupName,
      @NonNull TextView tvGroupname, @NonNull TextView tvStadiumMatch, @NonNull TextView tvTeam1,
      @NonNull TextView tvTeam2, @NonNull TextView tvTimeMatch, @NonNull View view2,
      @NonNull View viewBack, @NonNull ViewPager2 viewPagerMatch) {
    this.rootView = rootView;
    this.adContainer = adContainer;
    this.imgHeader = imgHeader;
    this.imgTeam2 = imgTeam2;
    this.imgbackGroup = imgbackGroup;
    this.imgteam1 = imgteam1;
    this.rulerMatch = rulerMatch;
    this.tabLayoutMatch = tabLayoutMatch;
    this.textView = textView;
    this.tvDateMatchGroup = tvDateMatchGroup;
    this.tvGoal = tvGoal;
    this.tvGroupName = tvGroupName;
    this.tvGroupname = tvGroupname;
    this.tvStadiumMatch = tvStadiumMatch;
    this.tvTeam1 = tvTeam1;
    this.tvTeam2 = tvTeam2;
    this.tvTimeMatch = tvTimeMatch;
    this.view2 = view2;
    this.viewBack = viewBack;
    this.viewPagerMatch = viewPagerMatch;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMatchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMatchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_match, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMatchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ad_container;
      FrameLayout adContainer = ViewBindings.findChildViewById(rootView, id);
      if (adContainer == null) {
        break missingId;
      }

      id = R.id.imgHeader;
      ImageView imgHeader = ViewBindings.findChildViewById(rootView, id);
      if (imgHeader == null) {
        break missingId;
      }

      id = R.id.imgTeam2;
      CircleImageView imgTeam2 = ViewBindings.findChildViewById(rootView, id);
      if (imgTeam2 == null) {
        break missingId;
      }

      id = R.id.imgbackGroup;
      ImageView imgbackGroup = ViewBindings.findChildViewById(rootView, id);
      if (imgbackGroup == null) {
        break missingId;
      }

      id = R.id.imgteam1;
      CircleImageView imgteam1 = ViewBindings.findChildViewById(rootView, id);
      if (imgteam1 == null) {
        break missingId;
      }

      id = R.id.rulerMatch;
      View rulerMatch = ViewBindings.findChildViewById(rootView, id);
      if (rulerMatch == null) {
        break missingId;
      }

      id = R.id.tabLayoutMatch;
      TabLayout tabLayoutMatch = ViewBindings.findChildViewById(rootView, id);
      if (tabLayoutMatch == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.tvDateMatchGroup;
      TextView tvDateMatchGroup = ViewBindings.findChildViewById(rootView, id);
      if (tvDateMatchGroup == null) {
        break missingId;
      }

      id = R.id.tvGoal;
      TextView tvGoal = ViewBindings.findChildViewById(rootView, id);
      if (tvGoal == null) {
        break missingId;
      }

      id = R.id.tvGroupName;
      TextView tvGroupName = ViewBindings.findChildViewById(rootView, id);
      if (tvGroupName == null) {
        break missingId;
      }

      id = R.id.tvGroupname;
      TextView tvGroupname = ViewBindings.findChildViewById(rootView, id);
      if (tvGroupname == null) {
        break missingId;
      }

      id = R.id.tvStadiumMatch;
      TextView tvStadiumMatch = ViewBindings.findChildViewById(rootView, id);
      if (tvStadiumMatch == null) {
        break missingId;
      }

      id = R.id.tvTeam1;
      TextView tvTeam1 = ViewBindings.findChildViewById(rootView, id);
      if (tvTeam1 == null) {
        break missingId;
      }

      id = R.id.tvTeam2;
      TextView tvTeam2 = ViewBindings.findChildViewById(rootView, id);
      if (tvTeam2 == null) {
        break missingId;
      }

      id = R.id.tvTimeMatch;
      TextView tvTimeMatch = ViewBindings.findChildViewById(rootView, id);
      if (tvTimeMatch == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      id = R.id.viewBack;
      View viewBack = ViewBindings.findChildViewById(rootView, id);
      if (viewBack == null) {
        break missingId;
      }

      id = R.id.viewPagerMatch;
      ViewPager2 viewPagerMatch = ViewBindings.findChildViewById(rootView, id);
      if (viewPagerMatch == null) {
        break missingId;
      }

      return new FragmentMatchBinding((ConstraintLayout) rootView, adContainer, imgHeader, imgTeam2,
          imgbackGroup, imgteam1, rulerMatch, tabLayoutMatch, textView, tvDateMatchGroup, tvGoal,
          tvGroupName, tvGroupname, tvStadiumMatch, tvTeam1, tvTeam2, tvTimeMatch, view2, viewBack,
          viewPagerMatch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
