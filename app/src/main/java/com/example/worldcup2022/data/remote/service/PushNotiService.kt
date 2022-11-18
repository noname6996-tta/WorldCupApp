package com.example.worldcup2022.data.remote.service

import com.example.worldcup2022.data.dto.worldcup.ResponseNoti
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by TruyenDev
 */

interface PushNotiService {
    @POST("user/noti/add")
    suspend fun registerNoti(@Body requestBody: RequestBody): Response<ResponseNoti>
}
