package com.example.worldcup2022.ui.component.main;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.worldcup2022.data.DataRepositorySource;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.Highlight;
import com.example.worldcup2022.data.dto.worldcup.ResponseHighlight;
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch;
import com.example.worldcup2022.data.dto.worldcup.ResponseSound;
import com.example.worldcup2022.data.dto.worldcup.ResponseSquad;
import com.example.worldcup2022.data.dto.worldcup.*;
import com.example.worldcup2022.ui.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.net.URLEncoder;
import javax.inject.Inject;

/**
 * Created by TruyenDev on 14/11/2022.
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u000207J\u000e\u00109\u001a\u0002072\u0006\u0010:\u001a\u00020;J\u0016\u0010<\u001a\u0002072\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0006J\u0006\u0010@\u001a\u000207J\u000e\u0010A\u001a\u0002072\u0006\u0010B\u001a\u00020;J\u001c\u0010C\u001a\u0002072\u0006\u0010=\u001a\u00020>2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0ER\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00128\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010R(\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\r0\u00128\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0010R(\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\r0\u00128\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\r0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0016R\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u0010R\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\r0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0016R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u0010R(\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\r0\u00128\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u0014\u001a\u0004\b5\u0010\u0016\u00a8\u0006G"}, d2 = {"Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "Lcom/example/worldcup2022/ui/base/BaseViewModel;", "dataRepositoryRepository", "Lcom/example/worldcup2022/data/DataRepositorySource;", "(Lcom/example/worldcup2022/data/DataRepositorySource;)V", "currentPageHighlight", "", "getCurrentPageHighlight", "()I", "setCurrentPageHighlight", "(I)V", "highlightLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/worldcup2022/data/Resource;", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHighlight;", "getHighlightLiveData", "()Landroidx/lifecycle/LiveData;", "highlightLiveDataPrivate", "Landroidx/lifecycle/MutableLiveData;", "getHighlightLiveDataPrivate$annotations", "()V", "getHighlightLiveDataPrivate", "()Landroidx/lifecycle/MutableLiveData;", "matchsLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "getMatchsLiveData", "matchsLiveDataPrivate", "getMatchsLiveDataPrivate$annotations", "getMatchsLiveDataPrivate", "maxPageHighlight", "getMaxPageHighlight", "setMaxPageHighlight", "resultGuessLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseResultGuess;", "getResultGuessLiveData", "resultGuessLiveDataPrivate", "getResultGuessLiveDataPrivate$annotations", "getResultGuessLiveDataPrivate", "soundsLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSound;", "getSoundsLiveData", "soundsLiveDataPrivate", "getSoundsLiveDataPrivate", "squadsLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSquad;", "getSquadsLiveData", "squadsLiveDataPrivate", "getSquadsLiveDataPrivate", "userLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseUser;", "getUserLiveData", "userLiveDataPrivate", "getUserLiveDataPrivate$annotations", "getUserLiveDataPrivate", "getFullMatchs", "", "getFullSounds", "getFullSquads", "s", "", "getHighlightsViaSearch", "search", "", "pageSize", "getRegisterUser", "getResultGuess", "userId", "loadMoreHighlights", "oldList", "", "Lcom/example/worldcup2022/data/dto/worldcup/Highlight;", "app_devDebug"})
public final class MainViewModel extends com.example.worldcup2022.ui.base.BaseViewModel {
    private final com.example.worldcup2022.data.DataRepositorySource dataRepositoryRepository = null;
    
    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> matchsLiveDataPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSound>> soundsLiveDataPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSquad>> squadsLiveDataPrivate = null;
    
    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHighlight>> highlightLiveDataPrivate = null;
    private int currentPageHighlight = 0;
    private int maxPageHighlight = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseUser>> userLiveDataPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess>> resultGuessLiveDataPrivate = null;
    
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
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSound>> getSoundsLiveDataPrivate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSound>> getSoundsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSquad>> getSquadsLiveDataPrivate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSquad>> getSquadsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHighlight>> getHighlightLiveDataPrivate() {
        return null;
    }
    
    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void getHighlightLiveDataPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHighlight>> getHighlightLiveData() {
        return null;
    }
    
    public final int getCurrentPageHighlight() {
        return 0;
    }
    
    public final void setCurrentPageHighlight(int p0) {
    }
    
    public final int getMaxPageHighlight() {
        return 0;
    }
    
    public final void setMaxPageHighlight(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseUser>> getUserLiveDataPrivate() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void getUserLiveDataPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseUser>> getUserLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess>> getResultGuessLiveDataPrivate() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void getResultGuessLiveDataPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess>> getResultGuessLiveData() {
        return null;
    }
    
    /**
     */
    public final void getFullMatchs() {
    }
    
    /**
     */
    public final void getFullSounds() {
    }
    
    public final void getFullSquads(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    /**
     */
    public final void getHighlightsViaSearch(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence search, int pageSize) {
    }
    
    /**
     */
    public final void loadMoreHighlights(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence search, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.dto.worldcup.Highlight> oldList) {
    }
    
    /**
     */
    public final void getRegisterUser() {
    }
    
    /**
     */
    public final void getResultGuess(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
}