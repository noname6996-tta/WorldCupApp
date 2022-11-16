package com.example.worldcup2022.data.remote.service

import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.data.dto.worldcup.ResponseSelfieFrame
import com.example.worldcup2022.data.dto.worldcup.SelfieFrame
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SelfieFrameService {
    @GET("image/search")
    suspend fun fetch(@Query("filter") filter: String, @Query("pageIndex") pageIndex: Int, @Query("pageSize") pageSize: Int): Response<ResponseSelfieFrame>
}