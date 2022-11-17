package com.example.worldcup2022.ui.component.main;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.worldcup2022.data.DataRepositorySource;
import com.example.worldcup2022.data.Resource;
import com.example.worldcup2022.data.dto.worldcup.*;
import com.example.worldcup2022.ui.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import okhttp3.RequestBody;
import java.net.URLEncoder;
import javax.inject.Inject;

/**
 * Created by TruyenDev on 14/11/2022.
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010^\u001a\u00020_J\u0006\u0010`\u001a\u00020_J\u0006\u0010a\u001a\u00020_J\u000e\u0010b\u001a\u00020_2\u0006\u0010c\u001a\u00020dJ\u000e\u0010e\u001a\u00020_2\u0006\u0010f\u001a\u00020gJ\u000e\u0010h\u001a\u00020_2\u0006\u0010i\u001a\u00020dJ\u000e\u0010j\u001a\u00020_2\u0006\u0010k\u001a\u00020dJ\u000e\u0010l\u001a\u00020_2\u0006\u0010m\u001a\u00020dJ\u0006\u0010n\u001a\u00020_J\u000e\u0010o\u001a\u00020_2\u0006\u0010p\u001a\u00020dJ\u0006\u0010q\u001a\u00020_J\u001c\u0010r\u001a\u00020_2\u0006\u0010f\u001a\u00020g2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020u0tJ\u001c\u0010v\u001a\u00020_2\u0006\u0010i\u001a\u00020d2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020w0tJ\u000e\u0010x\u001a\u00020_2\u0006\u0010y\u001a\u00020zR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\rR(\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\rR(\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0010R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\rR(\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0010R\u001d\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\rR(\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0010R\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\rR(\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0016\u001a\u0004\b1\u0010\u0010R\u001d\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b3\u0010\rR(\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u0016\u001a\u0004\b6\u0010\u0010R(\u00107\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u000108080\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0010\"\u0004\b;\u0010<R(\u0010=\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u000108080\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0010\"\u0004\b?\u0010<R(\u0010@\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u000108080\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0010\"\u0004\bB\u0010<R(\u0010C\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u000108080\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0010\"\u0004\bE\u0010<R\u001d\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\bH\u0010\rR(\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010\u0016\u001a\u0004\bK\u0010\u0010R\u001d\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\bM\u0010\rR\u001d\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\bP\u0010\rR\u001d\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0010R\u001d\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\bU\u0010\rR\u001d\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010\u0010R\u001d\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\bZ\u0010\rR(\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\\\u0010\u0016\u001a\u0004\b]\u0010\u0010\u00a8\u0006{"}, d2 = {"Lcom/example/worldcup2022/ui/component/main/MainViewModel;", "Lcom/example/worldcup2022/ui/base/BaseViewModel;", "dataRepositoryRepository", "Lcom/example/worldcup2022/data/DataRepositorySource;", "(Lcom/example/worldcup2022/data/DataRepositorySource;)V", "_selfieFrames", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/worldcup2022/data/Resource;", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSelfieFrame;", "countrysLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseCountry;", "getCountrysLiveData", "()Landroidx/lifecycle/LiveData;", "countrysLiveDataPrivate", "getCountrysLiveDataPrivate", "()Landroidx/lifecycle/MutableLiveData;", "guessLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseGuess;", "getGuessLiveData", "guessLiveDataPrivate", "getGuessLiveDataPrivate$annotations", "()V", "getGuessLiveDataPrivate", "handleUpdateDataHighlight", "Landroid/os/Handler;", "handleUpdateDataHistoryMatch", "highlightLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHighlight;", "getHighlightLiveData", "highlightLiveDataPrivate", "getHighlightLiveDataPrivate$annotations", "getHighlightLiveDataPrivate", "historyMatchLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseHistoryMatch;", "getHistoryMatchLiveData", "historyMatchLiveDataPrivate", "getHistoryMatchLiveDataPrivate$annotations", "getHistoryMatchLiveDataPrivate", "matchsByDateLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseMatch;", "getMatchsByDateLiveData", "matchsByDateLiveDataPrivate", "getMatchsByDateLiveDataPrivate$annotations", "getMatchsByDateLiveDataPrivate", "matchsByGroupLiveData", "getMatchsByGroupLiveData", "matchsByGroupLiveDataPrivate", "getMatchsByGroupLiveDataPrivate$annotations", "getMatchsByGroupLiveDataPrivate", "matchsLiveData", "getMatchsLiveData", "matchsLiveDataPrivate", "getMatchsLiveDataPrivate$annotations", "getMatchsLiveDataPrivate", "maxPageHighlight", "", "kotlin.jvm.PlatformType", "getMaxPageHighlight", "setMaxPageHighlight", "(Landroidx/lifecycle/MutableLiveData;)V", "maxPageHistoryMatch", "getMaxPageHistoryMatch", "setMaxPageHistoryMatch", "nextPageHighlight", "getNextPageHighlight", "setNextPageHighlight", "nextPageHistoryMatch", "getNextPageHistoryMatch", "setNextPageHistoryMatch", "resultGuessLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseResultGuess;", "getResultGuessLiveData", "resultGuessLiveDataPrivate", "getResultGuessLiveDataPrivate$annotations", "getResultGuessLiveDataPrivate", "selfieFrames", "getSelfieFrames", "soundsLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSound;", "getSoundsLiveData", "soundsLiveDataPrivate", "getSoundsLiveDataPrivate", "squadsLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseSquad;", "getSquadsLiveData", "squadsLiveDataPrivate", "getSquadsLiveDataPrivate", "userLiveData", "Lcom/example/worldcup2022/data/dto/worldcup/ResponseUser;", "getUserLiveData", "userLiveDataPrivate", "getUserLiveDataPrivate$annotations", "getUserLiveDataPrivate", "getFullCountry", "", "getFullMatchs", "getFullSounds", "getFullSquads", "s", "", "getHighlightsViaSearch", "search", "", "getHistoryMatchViaID", "id", "getMatchsByDate", "date", "getMatchsByGroup", "group", "getRegisterUser", "getResultGuess", "userId", "getSelfieFrame", "loadMoreHighlights", "oldList", "", "Lcom/example/worldcup2022/data/dto/worldcup/Highlight;", "loadMoreHistoryMatch", "Lcom/example/worldcup2022/data/dto/worldcup/HistoryMatch;", "postGuess", "requestBody", "Lokhttp3/RequestBody;", "app_devDebug"})
public final class MainViewModel extends com.example.worldcup2022.ui.base.BaseViewModel {
    private final com.example.worldcup2022.data.DataRepositorySource dataRepositoryRepository = null;
    
    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> matchsLiveDataPrivate = null;
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSelfieFrame>> _selfieFrames = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSound>> soundsLiveDataPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseSquad>> squadsLiveDataPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseCountry>> countrysLiveDataPrivate = null;
    
    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHighlight>> highlightLiveDataPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> nextPageHighlight;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> maxPageHighlight;
    
    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch>> historyMatchLiveDataPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> nextPageHistoryMatch;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> maxPageHistoryMatch;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseUser>> userLiveDataPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess>> resultGuessLiveDataPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> matchsByDateLiveDataPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseGuess>> guessLiveDataPrivate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> matchsByGroupLiveDataPrivate = null;
    
    /**
     */
    private android.os.Handler handleUpdateDataHighlight;
    
    /**
     */
    private android.os.Handler handleUpdateDataHistoryMatch;
    
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
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseCountry>> getCountrysLiveDataPrivate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseCountry>> getCountrysLiveData() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getNextPageHighlight() {
        return null;
    }
    
    public final void setNextPageHighlight(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMaxPageHighlight() {
        return null;
    }
    
    public final void setMaxPageHighlight(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch>> getHistoryMatchLiveDataPrivate() {
        return null;
    }
    
    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void getHistoryMatchLiveDataPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch>> getHistoryMatchLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getNextPageHistoryMatch() {
        return null;
    }
    
    public final void setNextPageHistoryMatch(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMaxPageHistoryMatch() {
        return null;
    }
    
    public final void setMaxPageHistoryMatch(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> getMatchsByDateLiveDataPrivate() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void getMatchsByDateLiveDataPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> getMatchsByDateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseGuess>> getGuessLiveDataPrivate() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void getGuessLiveDataPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseGuess>> getGuessLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> getMatchsByGroupLiveDataPrivate() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @java.lang.Deprecated()
    public static void getMatchsByGroupLiveDataPrivate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.worldcup2022.data.Resource<com.example.worldcup2022.data.dto.worldcup.ResponseMatch>> getMatchsByGroupLiveData() {
        return null;
    }
    
    /**
     */
    public final void getFullMatchs() {
    }
    
    public final void getSelfieFrame() {
    }
    
    /**
     */
    public final void getFullSounds() {
    }
    
    /**
     */
    public final void getFullSquads(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    /**
     */
    public final void getFullCountry() {
    }
    
    public final void getHighlightsViaSearch(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence search) {
    }
    
    /**
     */
    public final void loadMoreHighlights(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence search, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.dto.worldcup.Highlight> oldList) {
    }
    
    public final void getHistoryMatchViaID(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    /**
     */
    public final void loadMoreHistoryMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.dto.worldcup.HistoryMatch> oldList) {
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
    
    /**
     */
    public final void getMatchsByDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
    }
    
    /**
     */
    public final void getMatchsByGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String group) {
    }
    
    /**
     */
    public final void postGuess(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody requestBody) {
    }
}