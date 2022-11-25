// Generated by Dagger (https://dagger.dev).
package com.example.worldcup2022.data.remote;

import com.example.worldcup2022.utils.NetworkConnectivity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoteData_Factory implements Factory<RemoteData> {
  private final Provider<ServiceGenerator> serviceGeneratorProvider;

  private final Provider<NetworkConnectivity> networkConnectivityProvider;

  public RemoteData_Factory(Provider<ServiceGenerator> serviceGeneratorProvider,
      Provider<NetworkConnectivity> networkConnectivityProvider) {
    this.serviceGeneratorProvider = serviceGeneratorProvider;
    this.networkConnectivityProvider = networkConnectivityProvider;
  }

  @Override
  public RemoteData get() {
    return newInstance(serviceGeneratorProvider.get(), networkConnectivityProvider.get());
  }

  public static RemoteData_Factory create(Provider<ServiceGenerator> serviceGeneratorProvider,
      Provider<NetworkConnectivity> networkConnectivityProvider) {
    return new RemoteData_Factory(serviceGeneratorProvider, networkConnectivityProvider);
  }

  public static RemoteData newInstance(ServiceGenerator serviceGenerator,
      NetworkConnectivity networkConnectivity) {
    return new RemoteData(serviceGenerator, networkConnectivity);
  }
}
