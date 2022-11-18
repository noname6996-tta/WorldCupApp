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

public class StadiumFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private StadiumFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private StadiumFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static StadiumFragmentArgs fromBundle(@NonNull Bundle bundle) {
    StadiumFragmentArgs __result = new StadiumFragmentArgs();
    bundle.setClassLoader(StadiumFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("id_stadium")) {
      String idStadium;
      idStadium = bundle.getString("id_stadium");
      if (idStadium == null) {
        throw new IllegalArgumentException("Argument \"id_stadium\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("id_stadium", idStadium);
    } else {
      throw new IllegalArgumentException("Required argument \"id_stadium\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getIdStadium() {
    return (String) arguments.get("id_stadium");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("id_stadium")) {
      String idStadium = (String) arguments.get("id_stadium");
      __result.putString("id_stadium", idStadium);
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
    StadiumFragmentArgs that = (StadiumFragmentArgs) object;
    if (arguments.containsKey("id_stadium") != that.arguments.containsKey("id_stadium")) {
      return false;
    }
    if (getIdStadium() != null ? !getIdStadium().equals(that.getIdStadium()) : that.getIdStadium() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getIdStadium() != null ? getIdStadium().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "StadiumFragmentArgs{"
        + "idStadium=" + getIdStadium()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(StadiumFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String idStadium) {
      if (idStadium == null) {
        throw new IllegalArgumentException("Argument \"id_stadium\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id_stadium", idStadium);
    }

    @NonNull
    public StadiumFragmentArgs build() {
      StadiumFragmentArgs result = new StadiumFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setIdStadium(@NonNull String idStadium) {
      if (idStadium == null) {
        throw new IllegalArgumentException("Argument \"id_stadium\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id_stadium", idStadium);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getIdStadium() {
      return (String) arguments.get("id_stadium");
    }
  }
}
