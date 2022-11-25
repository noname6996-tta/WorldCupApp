package com.example.worldcup2022.view.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.worldcup2022.data.dto.worldcup.Country;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SquadFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private SquadFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private SquadFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SquadFragmentArgs fromBundle(@NonNull Bundle bundle) {
    SquadFragmentArgs __result = new SquadFragmentArgs();
    bundle.setClassLoader(SquadFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("country")) {
      Country country;
      if (Parcelable.class.isAssignableFrom(Country.class) || Serializable.class.isAssignableFrom(Country.class)) {
        country = (Country) bundle.get("country");
      } else {
        throw new UnsupportedOperationException(Country.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (country == null) {
        throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("country", country);
    } else {
      throw new IllegalArgumentException("Required argument \"country\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Country getCountry() {
    return (Country) arguments.get("country");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    SquadFragmentArgs that = (SquadFragmentArgs) object;
    if (arguments.containsKey("country") != that.arguments.containsKey("country")) {
      return false;
    }
    if (getCountry() != null ? !getCountry().equals(that.getCountry()) : that.getCountry() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "SquadFragmentArgs{"
        + "country=" + getCountry()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(SquadFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Country country) {
      if (country == null) {
        throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("country", country);
    }

    @NonNull
    public SquadFragmentArgs build() {
      SquadFragmentArgs result = new SquadFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setCountry(@NonNull Country country) {
      if (country == null) {
        throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("country", country);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Country getCountry() {
      return (Country) arguments.get("country");
    }
  }
}
