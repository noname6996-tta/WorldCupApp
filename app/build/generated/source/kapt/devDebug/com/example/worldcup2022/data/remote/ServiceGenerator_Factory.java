// Generated by Dagger (https://dagger.dev).
package com.example.worldcup2022.data.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceGenerator_Factory implements Factory<ServiceGenerator> {
  @Override
  public ServiceGenerator get() {
    return newInstance();
  }

  public static ServiceGenerator_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ServiceGenerator newInstance() {
    return new ServiceGenerator();
  }

  private static final class InstanceHolder {
    private static final ServiceGenerator_Factory INSTANCE = new ServiceGenerator_Factory();
  }
}
