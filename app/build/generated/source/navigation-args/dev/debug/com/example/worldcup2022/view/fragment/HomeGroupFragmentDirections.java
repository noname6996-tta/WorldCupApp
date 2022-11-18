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

public class HomeGroupFragmentDirections {
  private HomeGroupFragmentDirections() {
  }

  @NonNull
  public static ActionHomeGroupFragmentToGroupInfoFragment actionHomeGroupFragmentToGroupInfoFragment(
      @NonNull String groupName) {
    return new ActionHomeGroupFragmentToGroupInfoFragment(groupName);
  }

  public static class ActionHomeGroupFragmentToGroupInfoFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHomeGroupFragmentToGroupInfoFragment(@NonNull String groupName) {
      if (groupName == null) {
        throw new IllegalArgumentException("Argument \"group_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("group_name", groupName);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeGroupFragmentToGroupInfoFragment setGroupName(@NonNull String groupName) {
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
      return R.id.action_homeGroupFragment_to_groupInfoFragment;
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
      ActionHomeGroupFragmentToGroupInfoFragment that = (ActionHomeGroupFragmentToGroupInfoFragment) object;
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
      return "ActionHomeGroupFragmentToGroupInfoFragment(actionId=" + getActionId() + "){"
          + "groupName=" + getGroupName()
          + "}";
    }
  }
}
