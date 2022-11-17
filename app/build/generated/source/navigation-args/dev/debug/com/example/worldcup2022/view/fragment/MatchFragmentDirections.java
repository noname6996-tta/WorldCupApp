package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.dto.worldcup.Country;
import java.io.Serializable;
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
      @NonNull String idStadium) {
    return new ActionMatchFragmentToStadiumFragment(idStadium);
  }

  @NonNull
  public static ActionMatchFragmentToSquadFragment actionMatchFragmentToSquadFragment(
      @NonNull Country country) {
    return new ActionMatchFragmentToSquadFragment(country);
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
    private ActionMatchFragmentToStadiumFragment(@NonNull String idStadium) {
      if (idStadium == null) {
        throw new IllegalArgumentException("Argument \"id_stadium\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id_stadium", idStadium);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMatchFragmentToStadiumFragment setIdStadium(@NonNull String idStadium) {
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
      return R.id.action_matchFragment_to_stadiumFragment;
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
      ActionMatchFragmentToStadiumFragment that = (ActionMatchFragmentToStadiumFragment) object;
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
      return "ActionMatchFragmentToStadiumFragment(actionId=" + getActionId() + "){"
          + "idStadium=" + getIdStadium()
          + "}";
    }
  }

  public static class ActionMatchFragmentToSquadFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionMatchFragmentToSquadFragment(@NonNull Country country) {
      if (country == null) {
        throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("country", country);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMatchFragmentToSquadFragment setCountry(@NonNull Country country) {
      if (country == null) {
        throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("country", country);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("country")) {
        Country country = (Country) arguments.get("country");
        if (Parcelable.class.isAssignableFrom(Country.class) || country == null) {
          __result.putParcelable("country", Parcelable.class.cast(country));
        } else if (Serializable.class.isAssignableFrom(Country.class)) {
          __result.putSerializable("country", Serializable.class.cast(country));
        } else {
          throw new UnsupportedOperationException(Country.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_matchFragment_to_squadFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Country getCountry() {
      return (Country) arguments.get("country");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMatchFragmentToSquadFragment that = (ActionMatchFragmentToSquadFragment) object;
      if (arguments.containsKey("country") != that.arguments.containsKey("country")) {
        return false;
      }
      if (getCountry() != null ? !getCountry().equals(that.getCountry()) : that.getCountry() != null) {
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
      result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMatchFragmentToSquadFragment(actionId=" + getActionId() + "){"
          + "country=" + getCountry()
          + "}";
    }
  }
}
