package com.example.worldcup2022.usecase.errors

import com.example.worldcup2022.data.error.Error

interface ErrorUseCase {
    fun getError(errorCode: Int): Error
}
