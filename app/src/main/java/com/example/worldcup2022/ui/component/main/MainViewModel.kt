package com.example.worldcup2022.ui.component.main

import android.os.Handler
import android.os.Looper
import androidx.annotation.VisibleForTesting
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.worldcup2022.data.DataRepositorySource
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.*
import com.example.worldcup2022.ui.base.BaseViewModel
import com.example.worldcup2022.utils.wrapEspressoIdlingResource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.net.URLEncoder
import javax.inject.Inject

/**
 * Created by TruyenDev on 14/11/2022.
 */
@HiltViewModel
class MainViewModel @Inject
constructor(private val dataRepositoryRepository: DataRepositorySource) : BaseViewModel() {

    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    val matchsLiveDataPrivate = MutableLiveData<Resource<ResponseMatch>>()
    val matchsLiveData: LiveData<Resource<ResponseMatch>> get() = matchsLiveDataPrivate

    val soundsLiveDataPrivate = MutableLiveData<Resource<ResponseSound>>()
    val soundsLiveData: LiveData<Resource<ResponseSound>> get() = soundsLiveDataPrivate

    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    val highlightLiveDataPrivate = MutableLiveData<Resource<ResponseHighlight>>()
    val highlightLiveData: LiveData<Resource<ResponseHighlight>> get() = highlightLiveDataPrivate
    var nextPageHighlight = MutableLiveData(0)
    var maxPageHighlight = MutableLiveData(0)

    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    val historyMatchLiveDataPrivate = MutableLiveData<Resource<ResponseHistoryMatch>>()
    val historyMatchLiveData: LiveData<Resource<ResponseHistoryMatch>> get() = historyMatchLiveDataPrivate
    var nextPageHistoryMatch = MutableLiveData(0)
    var maxPageHistoryMatch = MutableLiveData(0)

    /**
     *
     */
    fun getFullMatchs() {
        viewModelScope.launch {
            matchsLiveDataPrivate.value = Resource.Loading()
            wrapEspressoIdlingResource {
                dataRepositoryRepository.requestMatchs(
                    "date==\"" + URLEncoder.encode(
                        "**",
                        "UTF-8"
                    ) + "\""
                ).collect {
                    matchsLiveDataPrivate.value = it
                }
            }
        }
    }

    /**
     *
     */
    fun getFullSounds() {
        viewModelScope.launch {
            soundsLiveDataPrivate.value = Resource.Loading()
            wrapEspressoIdlingResource {
                dataRepositoryRepository.requestSounds(
                    "id==\"" + URLEncoder.encode(
                        "**",
                        "UTF-8"
                    ) + "\""
                ).collect {
                    soundsLiveDataPrivate.value = it
                }
            }
        }
    }


    /**
     *
     */
    private var handleUpdateDataHighlight = Handler(Looper.getMainLooper())
    fun getHighlightsViaSearch(search: CharSequence) {
        handleUpdateDataHighlight.removeCallbacksAndMessages(null)
        handleUpdateDataHighlight.postDelayed({
            viewModelScope.launch {
                highlightLiveDataPrivate.value = Resource.Loading()
                wrapEspressoIdlingResource {
                    dataRepositoryRepository.requestHighlights(
                        filter = "group==\"highlight\";name==\"*$search*\"",
                        pageSize = nextPageHighlight.value ?: 0
                    ).collect {
                        highlightLiveDataPrivate.value = it
                    }
                }
            }
        }, 500)
    }

    /**
     *
     */
    fun loadMoreHighlights(search: CharSequence, oldList: List<Highlight>) {
        if (nextPageHighlight.value!! < maxPageHighlight.value!!) {
            val tmp: ArrayList<Highlight> = arrayListOf()
            tmp.addAll(oldList)
            tmp.removeLast()
            getHighlightsViaSearch(search)
        }
    }

    /**
     *
     */
    private var handleUpdateDataHistoryMatch = Handler(Looper.getMainLooper())
    fun getHistoryMatchViaID(id: String) {
        handleUpdateDataHistoryMatch.removeCallbacksAndMessages(null)
        handleUpdateDataHistoryMatch.postDelayed({
            viewModelScope.launch {
                historyMatchLiveDataPrivate.value = Resource.Loading()
                wrapEspressoIdlingResource {
                    dataRepositoryRepository.requestHistoryMatchs(
                        filter = "userId==\"$id\"",
                        pageSize = nextPageHistoryMatch.value ?: 0
                    ).collect {
                        historyMatchLiveDataPrivate.value = it
                    }
                }
            }
        }, 500)
    }

    /**
     *
     */
    fun loadMoreHistoryMatch(id: String, oldList: List<HistoryMatch>) {
        if (nextPageHistoryMatch.value!! < maxPageHistoryMatch.value!!) {
            val tmp: ArrayList<HistoryMatch> = arrayListOf()
            tmp.addAll(oldList)
            tmp.removeLast()
            getHistoryMatchViaID(id)
        }
    }
}