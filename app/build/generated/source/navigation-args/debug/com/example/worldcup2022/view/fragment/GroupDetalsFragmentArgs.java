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

public class GroupDetalsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private GroupDetalsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private GroupDetalsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static GroupDetalsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    GroupDetalsFragmentArgs __result = new GroupDetalsFragmentArgs();
    bundle.setClassLoader(GroupDetalsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("group_name")) {
      String groupName;
      groupName = bundle.getString("group_name");
      if (groupName == null) {
        throw new IllegalArgumentException("Argument \"group_name\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("group_name", groupName);
    } else {
      throw new IllegalArgumentException("Required argument \"group_name\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getGroupName() {
    return (String) arguments.get("group_name");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("group_name")) {
      String groupName = (String) arguments.get("group_name");
      __result.putString("group_name", groupName);
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
    GroupDetalsFragmentArgs that = (GroupDetalsFragmentArgs) object;
    if (arguments.containsKey("group_name") != that.arguments.containsKey("group_name")) {
      return false;
    }
    if (getGroupName() != null ? !getGroupName().equals(that.getGroupName()) : that.getGroupName() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getGroupName() != null ? getGroupName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "GroupDetalsFragmentArgs{"
        + "groupName=" + getGroupName()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(GroupDetalsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String groupName) {
      if (groupName == null) {
        throw new IllegalArgumentException("Argument \"group_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("group_name", groupName);
    }

    @NonNull
    public GroupDetalsFragmentArgs build() {
      GroupDetalsFragmentArgs result = new GroupDetalsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setGroupName(@NonNull String groupName) {
      if (groupName == null) {
        throw new IllegalArgumentException("Argument \"group_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("group_name", groupName);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getGroupName() {
      return (String) arguments.get("group_name");
    }
  }
}
