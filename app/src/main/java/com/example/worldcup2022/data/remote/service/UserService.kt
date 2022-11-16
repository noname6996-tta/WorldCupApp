package com.example.worldcup2022.data.remote.service

import com.example.worldcup2022.data.dto.worldcup.ResponseUser
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by TruyenDev
 */

interface UserService {
    @GET("user/register")
    suspend fun registerUser(): Response<ResponseUser>
}
