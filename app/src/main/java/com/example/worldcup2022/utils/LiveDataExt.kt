package com.example.worldcup2022.utils

import androidx.lifecycle.MutableLiveData

fun<T: Any?> mutableLiveDataOf(value: T): MutableLiveData<T> = MutableLiveData(value)