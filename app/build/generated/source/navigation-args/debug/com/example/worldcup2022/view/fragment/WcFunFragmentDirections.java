package com.example.worldcup2022.view.fragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.worldcup2022.R;

public class WcFunFragmentDirections {
  private WcFunFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionWcFunFragmentToPlaySoundFragment() {
    return new ActionOnlyNavDirections(R.id.action_wcFunFragment_to_playSoundFragment);
  }

  @NonNull
  public static NavDirections actionWcFunFragmentToSelfiePreviewFragment() {
    return new ActionOnlyNavDirections(R.id.action_wcFunFragment_to_selfiePreviewFragment);
  }
}
