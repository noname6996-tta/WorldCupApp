// Generated by view binder compiler. Do not edit!
package com.example.worldcup2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public final class FragmentVideowcBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View bgSearch;

  @NonNull
  public final ImageView btnDeleteSearch;

  @NonNull
  public final EditText edtSearch;

  @NonNull
  public final ImageView icSearch;

  @NonNull
  public final ImageView imgHeader;

  @NonNull
  public final LayoutLoadingBinding layoutLoading;

  @NonNull
  public final TextView noItem;

  @NonNull
  public final RecyclerView rcvList;

  private FragmentVideowcBinding(@NonNull ConstraintLayout rootView, @NonNull View bgSearch,
      @NonNull ImageView btnDeleteSearch, @NonNull EditText edtSearch, @NonNull ImageView icSearch,
      @NonNull ImageView imgHeader, @NonNull LayoutLoadingBinding layoutLoading,
      @NonNull TextView noItem, @NonNull RecyclerView rcvList) {
    this.rootView = rootView;
    this.bgSearch = bgSearch;
    this.btnDeleteSearch = btnDeleteSearch;
    this.edtSearch = edtSearch;
    this.icSearch = icSearch;
    this.imgHeader = imgHeader;
    this.layoutLoading = layoutLoading;
    this.noItem = noItem;
    this.rcvList = rcvList;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentVideowcBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentVideowcBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_videowc, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentVideowcBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bg_search;
      View bgSearch = ViewBindings.findChildViewById(rootView, id);
      if (bgSearch == null) {
        break missingId;
      }

      id = R.id.btn_delete_search;
      ImageView btnDeleteSearch = ViewBindings.findChildViewById(rootView, id);
      if (btnDeleteSearch == null) {
        break missingId;
      }

      id = R.id.edt_search;
      EditText edtSearch = ViewBindings.findChildViewById(rootView, id);
      if (edtSearch == null) {
        break missingId;
      }

      id = R.id.ic_search;
      ImageView icSearch = ViewBindings.findChildViewById(rootView, id);
      if (icSearch == null) {
        break missingId;
      }

      id = R.id.img_header;
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

      return new FragmentVideowcBinding((ConstraintLayout) rootView, bgSearch, btnDeleteSearch,
          edtSearch, icSearch, imgHeader, binding_layoutLoading, noItem, rcvList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
