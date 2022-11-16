package com.example.worldcup2022.ui.component.main;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.worldcup2022.data.DataRepositorySource;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch;
import com.example.worldcup2022.data.dto.worldcup.ResponseSelfieFrame;
import com.example.worldcup2022.data.dto.worldcup.SelfieFrame;
import com.example.worldcup2022.ui.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.net.URLEncoder;
import javax.inject.Inject;

/**
 * Created by TruyenDev on 14/11/2022.
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "Lcom/example/worldcup2022/ui/base/BaseViewModel;", "dataRepositoryRepository", "Lcom/example/worldcup2022/data/DataRepositorySource;", "(Lcom/example/worldcup2022/data/DataRepositorySource;)V", "_selfieFrames", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/worldcup2022/data/Resource;", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSelfieFrame;", "matchsLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "getMatchsLiveData", "()Landroidx/lifecycle/LiveData;", "matchsLiveDataPrivate", "getMatchsLiveDataPrivate$annotations", "()V", "getMatchsLiveDataPrivate", "()Landroidx/lifecycle/MutableLiveData;", "selfieFrames", "getSelfieFrames", "getFullMatchs", "", "getSelfieFrame", "app_devDebug"})
public final class MainViewModel extends com.example.worldcup2022.ui.base.BaseViewModel {
    private final com.example.worldcup2022.data.DataRepositorySource dataRepositoryRepository = null;
    
    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> matchsLiveDataPrivate = null;
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSelfieFrame>> _selfieFrames = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.DataRepositorySource dataRepositoryRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> getMatchsLiveDataPrivate() {
        return null;
    }
    
    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void getMatchsLiveDataPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> getMatchsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSelfieFrame>> getSelfieFrames() {
        return null;
    }
    
    /**
     */
    public final void getFullMatchs() {
    }
    
    public final void getSelfieFrame() {
    }
}