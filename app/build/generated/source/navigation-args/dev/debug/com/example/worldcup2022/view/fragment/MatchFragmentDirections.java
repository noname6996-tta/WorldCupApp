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

public class MatchFragmentDirections {
  private MatchFragmentDirections() {
  }

  @NonNull
  public static ActionMatchFragmentToGroupDetalsFragment actionMatchFragmentToGroupDetalsFragment(
      @NonNull String groupName) {
    return new ActionMatchFragmentToGroupDetalsFragment(groupName);
  }

  @NonNull
  public static ActionMatchFragmentToStadiumFragment actionMatchFragmentToStadiumFragment(
      int idStadium) {
    return new ActionMatchFragmentToStadiumFragment(idStadium);
  }

  public static class ActionMatchFragmentToGroupDetalsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionMatchFragmentToGroupDetalsFragment(@NonNull String groupName) {
      if (groupName == null) {
        throw new IllegalArgumentException("Argument \"group_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("group_name", groupName);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMatchFragmentToGroupDetalsFragment setGroupName(@NonNull String groupName) {
      if (groupName == null) {
        throw new IllegalArgumentException("Argument \"group_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("group_name", groupName);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("group_name")) {
        String groupName = (String) arguments.get("group_name");
        __result.putString("group_name", groupName);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_matchFragment_to_groupDetalsFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getGroupName() {
      return (String) arguments.get("group_name");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMatchFragmentToGroupDetalsFragment that = (ActionMatchFragmentToGroupDetalsFragment) object;
      if (arguments.containsKey("group_name") != that.arguments.containsKey("group_name")) {
        return false;
      }
      if (getGroupName() != null ? !getGroupName().equals(that.getGroupName()) : that.getGroupName() != null) {
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
      result = 31 * result + (getGroupName() != null ? getGroupName().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMatchFragmentToGroupDetalsFragment(actionId=" + getActionId() + "){"
          + "groupName=" + getGroupName()
          + "}";
    }
  }

  public static class ActionMatchFragmentToStadiumFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionMatchFragmentToStadiumFragment(int idStadium) {
      this.arguments.put("id_stadium", idStadium);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMatchFragmentToStadiumFragment setIdStadium(int idStadium) {
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
      return R.id.action_matchFragment_to_stadiumFragment;
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
      ActionMatchFragmentToStadiumFragment that = (ActionMatchFragmentToStadiumFragment) object;
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
      return "ActionMatchFragmentToStadiumFragment(actionId=" + getActionId() + "){"
          + "idStadium=" + getIdStadium()
          + "}";
    }
  }
}
