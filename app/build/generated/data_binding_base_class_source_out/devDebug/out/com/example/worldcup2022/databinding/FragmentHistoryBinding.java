// Generated by view binder compiler. Do not edit!
package com.example.worldcup2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.worldcup2022.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHistoryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView Numere;

  @NonNull
  public final ImageView imgHeader;

  @NonNull
  public final LayoutLoadingBinding layoutLoading;

  @NonNull
  public final TextView noItem;

  @NonNull
  public final RecyclerView rcvList;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView tv45;

  @NonNull
  public final TextView tv76;

  @NonNull
  public final View view8;

  @NonNull
  public final View view83;

  private FragmentHistoryBinding(@NonNull ConstraintLayout rootView, @NonNull TextView Numere,
      @NonNull ImageView imgHeader, @NonNull LayoutLoadingBinding layoutLoading,
      @NonNull TextView noItem, @NonNull RecyclerView rcvList, @NonNull TextView textView6,
      @NonNull TextView tv45, @NonNull TextView tv76, @NonNull View view8, @NonNull View view83) {
    this.rootView = rootView;
    this.Numere = Numere;
    this.imgHeader = imgHeader;
    this.layoutLoading = layoutLoading;
    this.noItem = noItem;
    this.rcvList = rcvList;
    this.textView6 = textView6;
    this.tv45 = tv45;
    this.tv76 = tv76;
    this.view8 = view8;
    this.view83 = view83;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Numere;
      TextView Numere = ViewBindings.findChildViewById(rootView, id);
      if (Numere == null) {
        break missingId;
      }

      id = R.id.imgHeader;
      ImageView imgHeader = ViewBindings.findChildViewById(rootView, id);
      if (imgHeader == null) {
        break missingId;
      }

      id = R.id.layout_loading;
      View layoutLoading = ViewBindings.findChildViewById(rootView, id);
      if (layoutLoading == null) {
        break missingId;
      }
      LayoutLoadingBinding binding_layoutLoading = LayoutLoadingBinding.bind(layoutLoading);

      id = R.id.no_item;
      TextView noItem = ViewBindings.findChildViewById(rootView, id);
      if (noItem == null) {
        break missingId;
      }

      id = R.id.rcv_list;
      RecyclerView rcvList = ViewBindings.findChildViewById(rootView, id);
      if (rcvList == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.tv45;
      TextView tv45 = ViewBindings.findChildViewById(rootView, id);
      if (tv45 == null) {
        break missingId;
      }

      id = R.id.tv76;
      TextView tv76 = ViewBindings.findChildViewById(rootView, id);
      if (tv76 == null) {
        break missingId;
      }

      id = R.id.view8;
      View view8 = ViewBindings.findChildViewById(rootView, id);
      if (view8 == null) {
        break missingId;
      }

      id = R.id.view83;
      View view83 = ViewBindings.findChildViewById(rootView, id);
      if (view83 == null) {
        break missingId;
      }

      return new FragmentHistoryBinding((ConstraintLayout) rootView, Numere, imgHeader,
          binding_layoutLoading, noItem, rcvList, textView6, tv45, tv76, view8, view83);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
