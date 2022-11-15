package com.example.worldcup2022.view.fragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.worldcup2022.R;

public class HomeMatchFragmentDirections {
  private HomeMatchFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeMatchFragmentToHomeGroupFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeMatchFragment_to_homeGroupFragment);
  }
}
