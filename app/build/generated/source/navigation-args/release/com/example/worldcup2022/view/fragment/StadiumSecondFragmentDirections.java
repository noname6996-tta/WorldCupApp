package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.worldcup2022.R;
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
      int idStadium) {
    return new ActionStadiumSecondFragmentToStadiumFragment(idStadium);
  }

  public static class ActionStadiumSecondFragmentToStadiumFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionStadiumSecondFragmentToStadiumFragment(int idStadium) {
      this.arguments.put("id_stadium", idStadium);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionStadiumSecondFragmentToStadiumFragment setIdStadium(int idStadium) {
      this.arguments.put("id_stadium", idStadium);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("id_stadium")) {
        int idStadium = (int) arguments.get("id_stadium");
        __result.putInt("id_stadium", idStadium);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_stadiumSecondFragment_to_stadiumFragment;
    }

    @SuppressWarnings("unchecked")
    public int getIdStadium() {
      return (int) arguments.get("id_stadium");
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
      if (getIdStadium() != that.getIdStadium()) {
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
      result = 31 * result + getIdStadium();
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
