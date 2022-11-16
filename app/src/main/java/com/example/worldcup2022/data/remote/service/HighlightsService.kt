package com.example.worldcup2022.data.remote.service

import com.example.worldcup2022.data.dto.worldcup.ResponseHighlight
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by DucNT
 */

interface HighlightsService {
    @GET("image/search")
    suspend fun fetchHighlights(
        @Query("filter") filter: String,
        @Query("pageIndex") pageIndex: Int,
        @Query("pageSize") pageSize: Int
    ): Response<ResponseHighlight>
}