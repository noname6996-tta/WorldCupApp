package com.example.worldcup2022.data.remote.service

import com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by DucNT
 */

interface HistoryMatchService {
    @GET("user/search")
    suspend fun fetchHistoryMatchs(
        @Query("filter") filter: String,
        @Query("pageIndex") pageIndex: Int,
        @Query("pageSize") pageSize: Int
    ): Response<ResponseHistoryMatch>
}