package com.example.worldcup2022.data.remote.service

import com.example.worldcup2022.data.dto.frames.DataFrames
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.data.dto.worldcup.ResponseSound
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by TruyenDev
 */

interface SoundsService {
    @GET("sound/search")
    suspend fun fetchSounds(@Query("filter") filter: String, @Query("pageIndex") pageIndex: Int, @Query("pageSize") pageSize: Int): Response<ResponseSound>
}
