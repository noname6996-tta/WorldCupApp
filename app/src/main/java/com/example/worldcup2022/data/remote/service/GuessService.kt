package com.example.worldcup2022.data.remote.service

import com.example.worldcup2022.data.dto.worldcup.ResponseGuess
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by TruyenDev
 */

interface GuessService {
    @POST("user")
    suspend fun postGuess(@Body requestBody: RequestBody): Response<ResponseGuess>
}
