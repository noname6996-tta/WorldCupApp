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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.worldcup2022.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemSoundBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imgSound;

  @NonNull
  public final TextView tvNameSound;

  @NonNull
  public final TextView txtAd;

  private ItemSoundBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imgSound,
      @NonNull TextView tvNameSound, @NonNull TextView txtAd) {
    this.rootView = rootView;
    this.imgSound = imgSound;
    this.tvNameSound = tvNameSound;
    this.txtAd = txtAd;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSoundBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSoundBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_sound, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSoundBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgSound;
      ImageView imgSound = ViewBindings.findChildViewById(rootView, id);
      if (imgSound == null) {
        break missingId;
      }

      id = R.id.tvNameSound;
      TextView tvNameSound = ViewBindings.findChildViewById(rootView, id);
      if (tvNameSound == null) {
        break missingId;
      }

      id = R.id.txt_ad;
      TextView txtAd = ViewBindings.findChildViewById(rootView, id);
      if (txtAd == null) {
        break missingId;
      }

      return new ItemSoundBinding((ConstraintLayout) rootView, imgSound, tvNameSound, txtAd);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
