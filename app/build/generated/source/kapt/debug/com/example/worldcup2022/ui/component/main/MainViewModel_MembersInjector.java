// Generated by Dagger (https://dagger.dev).
package com.example.worldcup2022.ui.component.main;

import com.example.worldcup2022.ui.base.BaseViewModel_MembersInjector;
import com.example.worldcup2022.usecase.errors.ErrorManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_MembersInjector implements MembersInjector<MainViewModel> {
  private final Provider<ErrorManager> errorManagerProvider;

  public MainViewModel_MembersInjector(Provider<ErrorManager> errorManagerProvider) {
    this.errorManagerProvider = errorManagerProvider;
  }

  public static MembersInjector<MainViewModel> create(Provider<ErrorManager> errorManagerProvider) {
    return new MainViewModel_MembersInjector(errorManagerProvider);
  }

  @Override
  public void injectMembers(MainViewModel instance) {
    BaseViewModel_MembersInjector.injectErrorManager(instance, errorManagerProvider.get());
  }
}