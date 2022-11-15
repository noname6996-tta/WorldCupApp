package com.example.worldcup2022.data.remote.service

import com.example.worldcup2022.data.dto.frames.DataFrames
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by TruyenDev
 */

interface MatchsService {
    @GET("match/search")
    suspend fun fetchMatchs(@Query("filter") filter: String, @Query("pageIndex") pageIndex: Int, @Query("pageSize") pageSize: Int,@Query("sort") sort: String): Response<ResponseMatch>
}
