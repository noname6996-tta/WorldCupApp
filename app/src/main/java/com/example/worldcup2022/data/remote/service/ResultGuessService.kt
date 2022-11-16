package com.example.worldcup2022.data.remote.service

import com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by TruyenDev
 */

interface ResultGuessService {
    @GET("user/check")
    suspend fun getResultGuess(@Query("userId") userId: String,): Response<ResponseResultGuess>
}
