package com.example.worldcup2022.usecase.errors

import com.example.worldcup2022.data.error.Error
import com.example.worldcup2022.data.error.mapper.ErrorMapper
import javax.inject.Inject

/**
 * Created by TruyenIT
 */

class ErrorManager @Inject constructor(private val errorMapper: ErrorMapper) : ErrorUseCase {
    override fun getError(errorCode: Int): Error {
        return Error(code = errorCode, description = errorMapper.errorsMap.getValue(errorCode))
    }
}
