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

public class StadiumSecondFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private StadiumSecondFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private StadiumSecondFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static StadiumSecondFragmentArgs fromBundle(@NonNull Bundle bundle) {
    StadiumSecondFragmentArgs __result = new StadiumSecondFragmentArgs();
    bundle.setClassLoader(StadiumSecondFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("id_stadium2")) {
      int idStadium2;
      idStadium2 = bundle.getInt("id_stadium2");
      __result.arguments.put("id_stadium2", idStadium2);
    } else {
      throw new IllegalArgumentException("Required argument \"id_stadium2\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getIdStadium2() {
    return (int) arguments.get("id_stadium2");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("id_stadium2")) {
      int idStadium2 = (int) arguments.get("id_stadium2");
      __result.putInt("id_stadium2", idStadium2);
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
    StadiumSecondFragmentArgs that = (StadiumSecondFragmentArgs) object;
    if (arguments.containsKey("id_stadium2") != that.arguments.containsKey("id_stadium2")) {
      return false;
    }
    if (getIdStadium2() != that.getIdStadium2()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getIdStadium2();
    return result;
  }

  @Override
  public String toString() {
    return "StadiumSecondFragmentArgs{"
        + "idStadium2=" + getIdStadium2()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(StadiumSecondFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int idStadium2) {
      this.arguments.put("id_stadium2", idStadium2);
    }

    @NonNull
    public StadiumSecondFragmentArgs build() {
      StadiumSecondFragmentArgs result = new StadiumSecondFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setIdStadium2(int idStadium2) {
      this.arguments.put("id_stadium2", idStadium2);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getIdStadium2() {
      return (int) arguments.get("id_stadium2");
    }
  }
}
