// Generated by Dagger (https://dagger.dev).
package com.example.worldcup2022.ui.component.login;

import com.example.worldcup2022.data.DataRepository;
import com.example.worldcup2022.ui.base.BaseViewModel_MembersInjector;
import com.example.worldcup2022.usecase.errors.ErrorManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<DataRepository> dataRepositoryProvider;

  private final Provider<ErrorManager> errorManagerProvider;

  public LoginViewModel_Factory(Provider<DataRepository> dataRepositoryProvider,
      Provider<ErrorManager> errorManagerProvider) {
    this.dataRepositoryProvider = dataRepositoryProvider;
    this.errorManagerProvider = errorManagerProvider;
  }

  @Override
  public LoginViewModel get() {
    LoginViewModel instance = newInstance(dataRepositoryProvider.get());
    BaseViewModel_MembersInjector.injectErrorManager(instance, errorManagerProvider.get());
    return instance;
  }

  public static LoginViewModel_Factory create(Provider<DataRepository> dataRepositoryProvider,
      Provider<ErrorManager> errorManagerProvider) {
    return new LoginViewModel_Factory(dataRepositoryProvider, errorManagerProvider);
  }

  public static LoginViewModel newInstance(DataRepository dataRepository) {
    return new LoginViewModel(dataRepository);
  }
}
