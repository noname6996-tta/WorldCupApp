package com.example.worldcup2022.ui.base;

import androidx.lifecycle.ViewModel;
import com.example.worldcup2022.usecase.errors.ErrorManager;
import javax.inject.Inject;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/worldcup2022/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorManager", "Lcom/example/worldcup2022/usecase/errors/ErrorManager;", "getErrorManager", "()Lcom/example/worldcup2022/usecase/errors/ErrorManager;", "setErrorManager", "(Lcom/example/worldcup2022/usecase/errors/ErrorManager;)V", "app_devDebug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     * Inject Singleton ErrorManager
     * Use this errorManager to get the Errors
     */
    @javax.inject.Inject()
    public com.example.worldcup2022.usecase.errors.ErrorManager errorManager;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.usecase.errors.ErrorManager getErrorManager() {
        return null;
    }
    
    public final void setErrorManager(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.usecase.errors.ErrorManager p0) {
    }
}