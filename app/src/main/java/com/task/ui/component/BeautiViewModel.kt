package com.task.ui.component

import com.task.data.DataRepositorySource
import com.task.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by TruyenDev on 04/10/2022.
 */
@HiltViewModel
class BeautiViewModel @Inject constructor(private val dataRepository: DataRepositorySource) : BaseViewModel(){
}