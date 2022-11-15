package com.example.worldcup2022.ui.component.main

import androidx.annotation.VisibleForTesting
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.worldcup2022.data.DataRepositorySource
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.Highlight
import com.example.worldcup2022.data.dto.worldcup.ResponseHighlight
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
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

    /**
     *
     */
    fun getFullMatchs() {
        viewModelScope.launch {
            matchsLiveDataPrivate.value = Resource.Loading()
            wrapEspressoIdlingResource {
                dataRepositoryRepository.requestMatchs("date==\""+URLEncoder.encode("**","UTF-8")+"\"").collect {
                    matchsLiveDataPrivate.value = it
                }
            }
        }
    }


    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    val highlightLiveDataPrivate = MutableLiveData<Resource<ResponseHighlight>>()
    val highlightLiveData: LiveData<Resource<ResponseHighlight>> get() = highlightLiveDataPrivate
    var currentPageHighlight = 0
    var maxPageHighlight = 0

    /**
     *
     */
    fun getHighlightsViaSearch(search: CharSequence, pageSize: Int) {
        viewModelScope.launch {
            highlightLiveDataPrivate.value = Resource.Loading()
            wrapEspressoIdlingResource {
                dataRepositoryRepository.requestHighlights(filter = "group==\"highlight\";name==\"*$search*\"", pageSize = pageSize).collect {
                    highlightLiveDataPrivate.value = it
                }
            }
        }
    }

    fun loadMoreHighlights(search: CharSequence, oldList: List<Highlight>) {
        if (currentPageHighlight < maxPageHighlight) {
            val tmp: ArrayList<Highlight> = arrayListOf()
            tmp.addAll(oldList)
            tmp.removeLast()
            getHighlightsViaSearch(search, currentPageHighlight)
        }
    }
}