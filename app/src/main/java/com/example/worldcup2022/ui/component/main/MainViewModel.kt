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
import com.example.worldcup2022.data.dto.worldcup.ResponseSound
import com.example.worldcup2022.data.dto.worldcup.ResponseSquad
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

    val squadsLiveDataPrivate = MutableLiveData<Resource<ResponseSquad>>()
    val squadsLiveData: LiveData<Resource<ResponseSquad>> get() = squadsLiveDataPrivate

    /**
     * Data --> LiveData, Exposed as LiveData, Locally in viewModel as MutableLiveData
     */

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    val highlightLiveDataPrivate = MutableLiveData<Resource<ResponseHighlight>>()
    val highlightLiveData: LiveData<Resource<ResponseHighlight>> get() = highlightLiveDataPrivate
    var currentPageHighlight = 0
    var maxPageHighlight = 0

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    val userLiveDataPrivate = MutableLiveData<Resource<ResponseUser>>()
    val userLiveData: LiveData<Resource<ResponseUser>> get() = userLiveDataPrivate

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    val resultGuessLiveDataPrivate = MutableLiveData<Resource<ResponseResultGuess>>()
    val resultGuessLiveData: LiveData<Resource<ResponseResultGuess>> get() = resultGuessLiveDataPrivate

    /**
     *
     */
    fun getFullMatchs() {
        viewModelScope.launch {
            matchsLiveDataPrivate.value = Resource.Loading()
            wrapEspressoIdlingResource {
                dataRepositoryRepository.requestMatchs("date==\"" + URLEncoder.encode("**", "UTF-8") + "\""+";"+"country1Name==\""+ URLEncoder.encode("#NULL#", "UTF-8") + "\"").collect {
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
                dataRepositoryRepository.requestSounds("id==\"" + URLEncoder.encode("**", "UTF-8") + "\"").collect {
                    soundsLiveDataPrivate.value = it
                }
            }
        }
    }

    fun getFullSquads(s: String) {
        viewModelScope.launch {
            squadsLiveDataPrivate.value = Resource.Loading()
            wrapEspressoIdlingResource {
                dataRepositoryRepository.requestSquads("countryId==\"$s\"").collect {
                    squadsLiveDataPrivate.value = it
                }
            }
        }
    }

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


    /**
     *
     */
    fun loadMoreHighlights(search: CharSequence, oldList: List<Highlight>) {
        if (currentPageHighlight < maxPageHighlight) {
            val tmp: ArrayList<Highlight> = arrayListOf()
            tmp.addAll(oldList)
            tmp.removeLast()
            getHighlightsViaSearch(search, currentPageHighlight)
        }
    }

    /**
     *
     */
    fun getRegisterUser() {
        viewModelScope.launch {
            userLiveDataPrivate.value = Resource.Loading()
            wrapEspressoIdlingResource {
                dataRepositoryRepository.registerUser().collect {
                    userLiveDataPrivate.value = it
                }
            }
        }
    }

    /**
     *
     */
    fun getResultGuess(userId: String) {
        viewModelScope.launch {
            resultGuessLiveDataPrivate.value = Resource.Loading()
            wrapEspressoIdlingResource {
                dataRepositoryRepository.getResultGuess(userId).collect {
                    resultGuessLiveDataPrivate.value = it
                }
            }
        }
    }
}