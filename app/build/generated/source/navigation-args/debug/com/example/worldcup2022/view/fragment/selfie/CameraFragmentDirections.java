package com.example.worldcup2022.view.fragment.selfie;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.worldcup2022.R;

public class CameraFragmentDirections {
  private CameraFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionCameraFragmentToImagePreviewFragment() {
    return new ActionOnlyNavDirections(R.id.action_cameraFragment_to_imagePreviewFragment);
  }
}
