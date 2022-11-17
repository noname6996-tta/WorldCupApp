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

public class StadiumFragmentDirections {
  private StadiumFragmentDirections() {
  }

  @NonNull
  public static ActionStadiumFragmentToStadiumSecondFragment actionStadiumFragmentToStadiumSecondFragment(
      @NonNull String idStadium2) {
    return new ActionStadiumFragmentToStadiumSecondFragment(idStadium2);
  }

  public static class ActionStadiumFragmentToStadiumSecondFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionStadiumFragmentToStadiumSecondFragment(@NonNull String idStadium2) {
      if (idStadium2 == null) {
        throw new IllegalArgumentException("Argument \"id_stadium2\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id_stadium2", idStadium2);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionStadiumFragmentToStadiumSecondFragment setIdStadium2(@NonNull String idStadium2) {
      if (idStadium2 == null) {
        throw new IllegalArgumentException("Argument \"id_stadium2\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id_stadium2", idStadium2);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("id_stadium2")) {
        String idStadium2 = (String) arguments.get("id_stadium2");
        __result.putString("id_stadium2", idStadium2);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_stadiumFragment_to_stadiumSecondFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getIdStadium2() {
      return (String) arguments.get("id_stadium2");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionStadiumFragmentToStadiumSecondFragment that = (ActionStadiumFragmentToStadiumSecondFragment) object;
      if (arguments.containsKey("id_stadium2") != that.arguments.containsKey("id_stadium2")) {
        return false;
      }
      if (getIdStadium2() != null ? !getIdStadium2().equals(that.getIdStadium2()) : that.getIdStadium2() != null) {
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
      result = 31 * result + (getIdStadium2() != null ? getIdStadium2().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionStadiumFragmentToStadiumSecondFragment(actionId=" + getActionId() + "){"
          + "idStadium2=" + getIdStadium2()
          + "}";
    }
  }
}
