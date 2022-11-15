package com.example.worldcup2022.view.fragment.selfie;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.worldcup2022.R;

public class SelfiePreviewFragmentDirections {
  private SelfiePreviewFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSelfiePreviewFragmentToSelfieResultFragment() {
    return new ActionOnlyNavDirections(R.id.action_selfiePreviewFragment_to_selfieResultFragment);
  }
}
