package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.worldcup2022.data.dto.worldcup.Match;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MatchFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private MatchFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private MatchFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MatchFragmentArgs fromBundle(@NonNull Bundle bundle) {
    MatchFragmentArgs __result = new MatchFragmentArgs();
    bundle.setClassLoader(MatchFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("object_match")) {
      Match objectMatch;
      if (Parcelable.class.isAssignableFrom(Match.class) || Serializable.class.isAssignableFrom(Match.class)) {
        objectMatch = (Match) bundle.get("object_match");
      } else {
        throw new UnsupportedOperationException(Match.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (objectMatch == null) {
        throw new IllegalArgumentException("Argument \"object_match\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("object_match", objectMatch);
    } else {
      throw new IllegalArgumentException("Required argument \"object_match\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Match getObjectMatch() {
    return (Match) arguments.get("object_match");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    MatchFragmentArgs that = (MatchFragmentArgs) object;
    if (arguments.containsKey("object_match") != that.arguments.containsKey("object_match")) {
      return false;
    }
    if (getObjectMatch() != null ? !getObjectMatch().equals(that.getObjectMatch()) : that.getObjectMatch() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getObjectMatch() != null ? getObjectMatch().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MatchFragmentArgs{"
        + "objectMatch=" + getObjectMatch()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(MatchFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Match objectMatch) {
      if (objectMatch == null) {
        throw new IllegalArgumentException("Argument \"object_match\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("object_match", objectMatch);
    }

    @NonNull
    public MatchFragmentArgs build() {
      MatchFragmentArgs result = new MatchFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setObjectMatch(@NonNull Match objectMatch) {
      if (objectMatch == null) {
        throw new IllegalArgumentException("Argument \"object_match\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("object_match", objectMatch);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Match getObjectMatch() {
      return (Match) arguments.get("object_match");
    }
  }
}
