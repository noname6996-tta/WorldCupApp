package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.worldcup2022.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class StadiumSecondFragmentDirections {
  private StadiumSecondFragmentDirections() {
  }

  @NonNull
  public static ActionStadiumSecondFragmentToStadiumFragment actionStadiumSecondFragmentToStadiumFragment(
      @NonNull String idStadium) {
    return new ActionStadiumSecondFragmentToStadiumFragment(idStadium);
  }

  public static class ActionStadiumSecondFragmentToStadiumFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionStadiumSecondFragmentToStadiumFragment(@NonNull String idStadium) {
      if (idStadium == null) {
        throw new IllegalArgumentException("Argument \"id_stadium\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id_stadium", idStadium);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionStadiumSecondFragmentToStadiumFragment setIdStadium(@NonNull String idStadium) {
      if (idStadium == null) {
        throw new IllegalArgumentException("Argument \"id_stadium\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id_stadium", idStadium);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("id_stadium")) {
        String idStadium = (String) arguments.get("id_stadium");
        __result.putString("id_stadium", idStadium);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_stadiumSecondFragment_to_stadiumFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getIdStadium() {
      return (String) arguments.get("id_stadium");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionStadiumSecondFragmentToStadiumFragment that = (ActionStadiumSecondFragmentToStadiumFragment) object;
      if (arguments.containsKey("id_stadium") != that.arguments.containsKey("id_stadium")) {
        return false;
      }
      if (getIdStadium() != null ? !getIdStadium().equals(that.getIdStadium()) : that.getIdStadium() != null) {
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
      result = 31 * result + (getIdStadium() != null ? getIdStadium().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionStadiumSecondFragmentToStadiumFragment(actionId=" + getActionId() + "){"
          + "idStadium=" + getIdStadium()
          + "}";
    }
  }
}
