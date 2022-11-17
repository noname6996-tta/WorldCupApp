package com.example.worldcup2022.di;

import com.example.worldcup2022.data.error.mapper.ErrorMapper;
import com.example.worldcup2022.data.error.mapper.ErrorMapperSource;
import com.example.worldcup2022.usecase.errors.ErrorUseCase;
import com.example.worldcup2022.usecase.errors.ErrorManager;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/worldcup2022/di/ErrorModule;", "", "()V", "provideErrorFactoryImpl", "Lcom/example/worldcup2022/usecase/errors/ErrorUseCase;", "errorManager", "Lcom/example/worldcup2022/usecase/errors/ErrorManager;", "provideErrorMapper", "Lcom/example/worldcup2022/data/error/mapper/ErrorMapperSource;", "errorMapper", "Lcom/example/worldcup2022/data/error/mapper/ErrorMapper;", "app_devDebug"})
@dagger.Module()
public abstract class ErrorModule {
    
    public ErrorModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.example.worldcup2022.usecase.errors.ErrorUseCase provideErrorFactoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.usecase.errors.ErrorManager errorManager);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.example.worldcup2022.data.error.mapper.ErrorMapperSource provideErrorMapper(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.error.mapper.ErrorMapper errorMapper);
}