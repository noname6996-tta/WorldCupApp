package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.worldcup2022.R;
import com.example.worldcup2022.model.Match;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToHomeGroupFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_homeGroupFragment);
  }

  @NonNull
  public static ActionHomeFragmentToMatchFragment actionHomeFragmentToMatchFragment(
      @NonNull Match objectMatch) {
    return new ActionHomeFragmentToMatchFragment(objectMatch);
  }

  public static class ActionHomeFragmentToMatchFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHomeFragmentToMatchFragment(@NonNull Match objectMatch) {
      if (objectMatch == null) {
        throw new IllegalArgumentException("Argument \"object_match\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("object_match", objectMatch);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToMatchFragment setObjectMatch(@NonNull Match objectMatch) {
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
      return R.id.action_homeFragment_to_matchFragment;
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
      ActionHomeFragmentToMatchFragment that = (ActionHomeFragmentToMatchFragment) object;
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
      return "ActionHomeFragmentToMatchFragment(actionId=" + getActionId() + "){"
          + "objectMatch=" + getObjectMatch()
          + "}";
    }
  }
}
