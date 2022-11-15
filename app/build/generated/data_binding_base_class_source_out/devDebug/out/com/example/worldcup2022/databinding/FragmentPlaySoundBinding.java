// Generated by view binder compiler. Do not edit!
package com.example.worldcup2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
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

public final class FragmentPlaySoundBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imgPlay;

  @NonNull
  public final SeekBar seekBar;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final View view11;

  @NonNull
  public final View viewBack;

  private FragmentPlaySoundBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView2, @NonNull ImageView imageView4, @NonNull ImageView imageView5,
      @NonNull ImageView imgPlay, @NonNull SeekBar seekBar, @NonNull TextView textView14,
      @NonNull View view11, @NonNull View viewBack) {
    this.rootView = rootView;
    this.imageView2 = imageView2;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.imgPlay = imgPlay;
    this.seekBar = seekBar;
    this.textView14 = textView14;
    this.view11 = view11;
    this.viewBack = viewBack;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPlaySoundBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPlaySoundBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_play_sound, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPlaySoundBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imgPlay;
      ImageView imgPlay = ViewBindings.findChildViewById(rootView, id);
      if (imgPlay == null) {
        break missingId;
      }

      id = R.id.seekBar;
      SeekBar seekBar = ViewBindings.findChildViewById(rootView, id);
      if (seekBar == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.view11;
      View view11 = ViewBindings.findChildViewById(rootView, id);
      if (view11 == null) {
        break missingId;
      }

      id = R.id.viewBack;
      View viewBack = ViewBindings.findChildViewById(rootView, id);
      if (viewBack == null) {
        break missingId;
      }

      return new FragmentPlaySoundBinding((ConstraintLayout) rootView, imageView2, imageView4,
          imageView5, imgPlay, seekBar, textView14, view11, viewBack);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
