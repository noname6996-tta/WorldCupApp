package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.dto.worldcup.Match;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GroupDetalsFragmentDirections {
  private GroupDetalsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGroupDetalsFragmentToTablesFragment() {
    return new ActionOnlyNavDirections(R.id.action_groupDetalsFragment_to_tablesFragment);
  }

  @NonNull
  public static ActionGroupDetalsFragmentToMatchFragment actionGroupDetalsFragmentToMatchFragment(
      @NonNull Match objectMatch) {
    return new ActionGroupDetalsFragmentToMatchFragment(objectMatch);
  }

  public static class ActionGroupDetalsFragmentToMatchFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionGroupDetalsFragmentToMatchFragment(@NonNull Match objectMatch) {
      if (objectMatch == null) {
        throw new IllegalArgumentException("Argument \"object_match\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("object_match", objectMatch);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionGroupDetalsFragmentToMatchFragment setObjectMatch(@NonNull Match objectMatch) {
      if (objectMatch == null) {
        throw new IllegalArgumentException("Argument \"object_match\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("object_match", objectMatch);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("object_match")) {
        Match objectMatch = (Match) arguments.get("object_match");
        if (Parcelable.class.isAssignableFrom(Match.class) || objectMatch == null) {
          __result.putParcelable("object_match", Parcelable.class.cast(objectMatch));
        } else if (Serializable.class.isAssignableFrom(Match.class)) {
          __result.putSerializable("object_match", Serializable.class.cast(objectMatch));
        } else {
          throw new UnsupportedOperationException(Match.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_groupDetalsFragment_to_matchFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Match getObjectMatch() {
      return (Match) arguments.get("object_match");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGroupDetalsFragmentToMatchFragment that = (ActionGroupDetalsFragmentToMatchFragment) object;
      if (arguments.containsKey("object_match") != that.arguments.containsKey("object_match")) {
        return false;
      }
      if (getObjectMatch() != null ? !getObjectMatch().equals(that.getObjectMatch()) : that.getObjectMatch() != null) {
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
      result = 31 * result + (getObjectMatch() != null ? getObjectMatch().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGroupDetalsFragmentToMatchFragment(actionId=" + getActionId() + "){"
          + "objectMatch=" + getObjectMatch()
          + "}";
    }
  }
}