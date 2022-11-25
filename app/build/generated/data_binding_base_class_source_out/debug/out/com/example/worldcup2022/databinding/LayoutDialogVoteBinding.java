// Generated by view binder compiler. Do not edit!
package com.example.worldcup2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.worldcup2022.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutDialogVoteBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView btnOctopus;

  @NonNull
  public final EditText edtScores1;

  @NonNull
  public final EditText edtScores2;

  @NonNull
  public final CircleImageView ivFlag1;

  @NonNull
  public final CircleImageView ivFlag2;

  @NonNull
  public final ImageView ivOctopus1;

  @NonNull
  public final ImageView ivOctopus2;

  @NonNull
  public final LinearLayout llScores;

  @NonNull
  public final TextView tvSave;

  private LayoutDialogVoteBinding(@NonNull RelativeLayout rootView, @NonNull ImageView btnOctopus,
      @NonNull EditText edtScores1, @NonNull EditText edtScores2, @NonNull CircleImageView ivFlag1,
      @NonNull CircleImageView ivFlag2, @NonNull ImageView ivOctopus1,
      @NonNull ImageView ivOctopus2, @NonNull LinearLayout llScores, @NonNull TextView tvSave) {
    this.rootView = rootView;
    this.btnOctopus = btnOctopus;
    this.edtScores1 = edtScores1;
    this.edtScores2 = edtScores2;
    this.ivFlag1 = ivFlag1;
    this.ivFlag2 = ivFlag2;
    this.ivOctopus1 = ivOctopus1;
    this.ivOctopus2 = ivOctopus2;
    this.llScores = llScores;
    this.tvSave = tvSave;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutDialogVoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutDialogVoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_dialog_vote, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutDialogVoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnOctopus;
      ImageView btnOctopus = ViewBindings.findChildViewById(rootView, id);
      if (btnOctopus == null) {
        break missingId;
      }

      id = R.id.edtScores1;
      EditText edtScores1 = ViewBindings.findChildViewById(rootView, id);
      if (edtScores1 == null) {
        break missingId;
      }

      id = R.id.edtScores2;
      EditText edtScores2 = ViewBindings.findChildViewById(rootView, id);
      if (edtScores2 == null) {
        break missingId;
      }

      id = R.id.ivFlag1;
      CircleImageView ivFlag1 = ViewBindings.findChildViewById(rootView, id);
      if (ivFlag1 == null) {
        break missingId;
      }

      id = R.id.ivFlag2;
      CircleImageView ivFlag2 = ViewBindings.findChildViewById(rootView, id);
      if (ivFlag2 == null) {
        break missingId;
      }

      id = R.id.ivOctopus1;
      ImageView ivOctopus1 = ViewBindings.findChildViewById(rootView, id);
      if (ivOctopus1 == null) {
        break missingId;
      }

      id = R.id.ivOctopus2;
      ImageView ivOctopus2 = ViewBindings.findChildViewById(rootView, id);
      if (ivOctopus2 == null) {
        break missingId;
      }

      id = R.id.llScores;
      LinearLayout llScores = ViewBindings.findChildViewById(rootView, id);
      if (llScores == null) {
        break missingId;
      }

      id = R.id.tvSave;
      TextView tvSave = ViewBindings.findChildViewById(rootView, id);
      if (tvSave == null) {
        break missingId;
      }

      return new LayoutDialogVoteBinding((RelativeLayout) rootView, btnOctopus, edtScores1,
          edtScores2, ivFlag1, ivFlag2, ivOctopus1, ivOctopus2, llScores, tvSave);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
