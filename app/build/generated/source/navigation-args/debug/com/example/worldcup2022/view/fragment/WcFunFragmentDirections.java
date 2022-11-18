package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.worldcup2022.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class WcFunFragmentDirections {
  private WcFunFragmentDirections() {
  }

  @NonNull
  public static ActionWcFunFragmentToPlaySoundFragment actionWcFunFragmentToPlaySoundFragment(
      int isInternet) {
    return new ActionWcFunFragmentToPlaySoundFragment(isInternet);
  }

  @NonNull
  public static NavDirections actionWcFunFragmentToCameraFragment() {
    return new ActionOnlyNavDirections(R.id.action_wcFunFragment_to_cameraFragment);
  }

  public static class ActionWcFunFragmentToPlaySoundFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionWcFunFragmentToPlaySoundFragment(int isInternet) {
      this.arguments.put("isInternet", isInternet);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionWcFunFragmentToPlaySoundFragment setIsInternet(int isInternet) {
      this.arguments.put("isInternet", isInternet);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("isInternet")) {
        int isInternet = (int) arguments.get("isInternet");
        __result.putInt("isInternet", isInternet);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_wcFunFragment_to_playSoundFragment;
    }

    @SuppressWarnings("unchecked")
    public int getIsInternet() {
      return (int) arguments.get("isInternet");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionWcFunFragmentToPlaySoundFragment that = (ActionWcFunFragmentToPlaySoundFragment) object;
      if (arguments.containsKey("isInternet") != that.arguments.containsKey("isInternet")) {
        return false;
      }
      if (getIsInternet() != that.getIsInternet()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getIsInternet();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionWcFunFragmentToPlaySoundFragment(actionId=" + getActionId() + "){"
          + "isInternet=" + getIsInternet()
          + "}";
    }
  }
}
