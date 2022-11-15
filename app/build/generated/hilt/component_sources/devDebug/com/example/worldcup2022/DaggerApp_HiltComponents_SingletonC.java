// Generated by Dagger (https://dagger.dev).
package com.example.worldcup2022;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.worldcup2022.data.DataRepository;
import com.example.worldcup2022.data.DataRepositorySource;
import com.example.worldcup2022.data.error.mapper.ErrorMapper;
import com.example.worldcup2022.data.local.LocalData;
import com.example.worldcup2022.data.remote.RemoteData;
import com.example.worldcup2022.data.remote.ServiceGenerator;
import com.example.worldcup2022.di.AppModule;
import com.example.worldcup2022.di.AppModule_ProvideCoroutineContextFactory;
import com.example.worldcup2022.di.AppModule_ProvideLocalRepositoryFactory;
import com.example.worldcup2022.di.AppModule_ProvideNetworkConnectivityFactory;
import com.example.worldcup2022.ui.base.BaseViewModel_MembersInjector;
import com.example.worldcup2022.ui.component.login.LoginActivity;
import com.example.worldcup2022.ui.component.login.LoginViewModel;
import com.example.worldcup2022.ui.component.login.LoginViewModel_Factory;
import com.example.worldcup2022.ui.component.login.LoginViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.worldcup2022.ui.component.main.MainNewActivity;
import com.example.worldcup2022.ui.component.main.MainViewModel;
import com.example.worldcup2022.ui.component.main.MainViewModel_Factory;
import com.example.worldcup2022.ui.component.main.MainViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.worldcup2022.ui.component.recipes.RecipesListActivity;
import com.example.worldcup2022.ui.component.recipes.RecipesListViewModel;
import com.example.worldcup2022.ui.component.recipes.RecipesListViewModel_Factory;
import com.example.worldcup2022.ui.component.recipes.RecipesListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.worldcup2022.ui.component.splash.SplashActivity;
import com.example.worldcup2022.usecase.errors.ErrorManager;
import com.example.worldcup2022.utils.NetworkConnectivity;
import com.example.worldcup2022.view.fragment.SimulationSoundFragment;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApp_HiltComponents_SingletonC extends App_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final AppModule appModule;

  private final DaggerApp_HiltComponents_SingletonC singletonC = this;

  private Provider<ServiceGenerator> serviceGeneratorProvider;

  private Provider<NetworkConnectivity> provideNetworkConnectivityProvider;

  private Provider<LocalData> provideLocalRepositoryProvider;

  private Provider<CoroutineContext> provideCoroutineContextProvider;

  private Provider<DataRepository> dataRepositoryProvider;

  private Provider<DataRepositorySource> provideDataRepositoryProvider;

  private DaggerApp_HiltComponents_SingletonC(AppModule appModuleParam,
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.appModule = appModuleParam;
    initialize(appModuleParam, applicationContextModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private RemoteData remoteData() {
    return new RemoteData(serviceGeneratorProvider.get(), provideNetworkConnectivityProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam,
      final ApplicationContextModule applicationContextModuleParam) {
    this.serviceGeneratorProvider = DoubleCheck.provider(new SwitchingProvider<ServiceGenerator>(singletonC, 0));
    this.provideNetworkConnectivityProvider = DoubleCheck.provider(new SwitchingProvider<NetworkConnectivity>(singletonC, 1));
    this.provideLocalRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<LocalData>(singletonC, 2));
    this.provideCoroutineContextProvider = DoubleCheck.provider(new SwitchingProvider<CoroutineContext>(singletonC, 3));
    this.dataRepositoryProvider = new SwitchingProvider<>(singletonC, 4);
    this.provideDataRepositoryProvider = DoubleCheck.provider((Provider) dataRepositoryProvider);
  }

  @Override
  public void injectApp(App arg0) {
  }

  @Override
  public Set<Boolean> getDisableFragmentGetContextFix() {
    return Collections.<Boolean>emptySet();
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  public static final class Builder {
    private AppModule appModule;

    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerApp_HiltComponents_SingletonC(appModule, applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public App_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public App_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public App_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends App_HiltComponents.FragmentC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void injectSimulationSoundFragment(SimulationSoundFragment arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends App_HiltComponents.ViewC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends App_HiltComponents.ActivityC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectLoginActivity(LoginActivity arg0) {
    }

    @Override
    public void injectMainNewActivity(MainNewActivity arg0) {
    }

    @Override
    public void injectRecipesListActivity(RecipesListActivity arg0) {
    }

    @Override
    public void injectSplashActivity(SplashActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(3).add(LoginViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MainViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(RecipesListViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<LoginViewModel> loginViewModelProvider;

    private Provider<MainViewModel> mainViewModelProvider;

    private Provider<RecipesListViewModel> recipesListViewModelProvider;

    private ViewModelCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    private RemoteData remoteData() {
      return new RemoteData(singletonC.serviceGeneratorProvider.get(), singletonC.provideNetworkConnectivityProvider.get());
    }

    private DataRepository dataRepository() {
      return new DataRepository(remoteData(), singletonC.provideLocalRepositoryProvider.get(), singletonC.provideCoroutineContextProvider.get());
    }

    private ErrorMapper errorMapper() {
      return new ErrorMapper(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));
    }

    private ErrorManager errorManager() {
      return new ErrorManager(errorMapper());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.loginViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
      this.mainViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 1);
      this.recipesListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 2);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(3).put("com.example.worldcup2022.ui.component.login.LoginViewModel", (Provider) loginViewModelProvider).put("com.example.worldcup2022.ui.component.main.MainViewModel", (Provider) mainViewModelProvider).put("com.example.worldcup2022.ui.component.recipes.RecipesListViewModel", (Provider) recipesListViewModelProvider).build();
    }

    private LoginViewModel injectLoginViewModel(LoginViewModel instance) {
      BaseViewModel_MembersInjector.injectErrorManager(instance, errorManager());
      return instance;
    }

    private MainViewModel injectMainViewModel(MainViewModel instance) {
      BaseViewModel_MembersInjector.injectErrorManager(instance, errorManager());
      return instance;
    }

    private RecipesListViewModel injectRecipesListViewModel(RecipesListViewModel instance) {
      BaseViewModel_MembersInjector.injectErrorManager(instance, errorManager());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.example.worldcup2022.ui.component.login.LoginViewModel 
          return (T) viewModelCImpl.injectLoginViewModel(LoginViewModel_Factory.newInstance(viewModelCImpl.dataRepository()));

          case 1: // com.example.worldcup2022.ui.component.main.MainViewModel 
          return (T) viewModelCImpl.injectMainViewModel(MainViewModel_Factory.newInstance(singletonC.provideDataRepositoryProvider.get()));

          case 2: // com.example.worldcup2022.ui.component.recipes.RecipesListViewModel 
          return (T) viewModelCImpl.injectRecipesListViewModel(RecipesListViewModel_Factory.newInstance(singletonC.provideDataRepositoryProvider.get()));

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerApp_HiltComponents_SingletonC singletonC, Service serviceParam) {
      this.singletonC = singletonC;


    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.example.worldcup2022.data.remote.ServiceGenerator 
        return (T) new ServiceGenerator();

        case 1: // com.example.worldcup2022.utils.NetworkConnectivity 
        return (T) AppModule_ProvideNetworkConnectivityFactory.provideNetworkConnectivity(singletonC.appModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 2: // com.example.worldcup2022.data.local.LocalData 
        return (T) AppModule_ProvideLocalRepositoryFactory.provideLocalRepository(singletonC.appModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 3: // kotlin.coroutines.CoroutineContext 
        return (T) AppModule_ProvideCoroutineContextFactory.provideCoroutineContext(singletonC.appModule);

        case 4: // com.example.worldcup2022.data.DataRepository 
        return (T) new DataRepository(singletonC.remoteData(), singletonC.provideLocalRepositoryProvider.get(), singletonC.provideCoroutineContextProvider.get());

        default: throw new AssertionError(id);
      }
    }
  }
}
