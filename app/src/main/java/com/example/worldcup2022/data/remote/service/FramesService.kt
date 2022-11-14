package com.example.worldcup2022.data.remote.service

import com.example.worldcup2022.data.dto.frames.DataFrames
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by TruyenDev
 */

interface FramesService {
    @GET("frames.json")
    suspend fun fetchFrames(): Response<DataFrames>
}
