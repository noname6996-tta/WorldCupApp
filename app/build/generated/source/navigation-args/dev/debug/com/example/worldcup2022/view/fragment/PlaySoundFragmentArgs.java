package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class PlaySoundFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private PlaySoundFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private PlaySoundFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PlaySoundFragmentArgs fromBundle(@NonNull Bundle bundle) {
    PlaySoundFragmentArgs __result = new PlaySoundFragmentArgs();
    bundle.setClassLoader(PlaySoundFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("isInternet")) {
      int isInternet;
      isInternet = bundle.getInt("isInternet");
      __result.arguments.put("isInternet", isInternet);
    } else {
      throw new IllegalArgumentException("Required argument \"isInternet\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getIsInternet() {
    return (int) arguments.get("isInternet");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("isInternet")) {
      int isInternet = (int) arguments.get("isInternet");
      __result.putInt("isInternet", isInternet);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    PlaySoundFragmentArgs that = (PlaySoundFragmentArgs) object;
    if (arguments.containsKey("isInternet") != that.arguments.containsKey("isInternet")) {
      return false;
    }
    if (getIsInternet() != that.getIsInternet()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getIsInternet();
    return result;
  }

  @Override
  public String toString() {
    return "PlaySoundFragmentArgs{"
        + "isInternet=" + getIsInternet()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(PlaySoundFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int isInternet) {
      this.arguments.put("isInternet", isInternet);
    }

    @NonNull
    public PlaySoundFragmentArgs build() {
      PlaySoundFragmentArgs result = new PlaySoundFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setIsInternet(int isInternet) {
      this.arguments.put("isInternet", isInternet);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getIsInternet() {
      return (int) arguments.get("isInternet");
    }
  }
}
