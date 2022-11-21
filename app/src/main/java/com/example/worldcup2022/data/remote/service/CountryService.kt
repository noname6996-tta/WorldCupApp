package com.example.worldcup2022.data.remote.service

import com.example.worldcup2022.data.dto.worldcup.ResponseCountry
import com.example.worldcup2022.data.dto.worldcup.ResponseSound
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CountryService {
    @GET("country/search")
    suspend fun fetchCountry(@Query("filter") filter: String, @Query("pageIndex") pageIndex: Int, @Query("pageSize") pageSize: Int, @Query("sort") sort : String): Response<ResponseCountry>
}