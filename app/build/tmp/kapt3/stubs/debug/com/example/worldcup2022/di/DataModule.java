package com.example.worldcup2022.di;

import com.example.worldcup2022.data.DataRepository;
import com.example.worldcup2022.data.DataRepositorySource;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/worldcup2022/di/DataModule;", "", "()V", "provideDataRepository", "Lcom/example/worldcup2022/data/DataRepositorySource;", "dataRepository", "Lcom/example/worldcup2022/data/DataRepository;", "app_debug"})
@dagger.Module()
public abstract class DataModule {
    
    public DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.example.worldcup2022.data.DataRepositorySource provideDataRepository(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.DataRepository dataRepository);
}