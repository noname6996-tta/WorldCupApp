package com.example.worldcup2022.data

import com.example.worldcup2022.data.dto.frames.DataFrames
import com.example.worldcup2022.data.dto.login.LoginRequest
import com.example.worldcup2022.data.dto.login.LoginResponse
import com.example.worldcup2022.data.dto.recipes.Recipes
import com.example.worldcup2022.data.dto.worldcup.*
import kotlinx.coroutines.flow.Flow
import okhttp3.RequestBody

/**
 * Created by TruyenIT
 */

interface DataRepositorySource {
    suspend fun requestRecipes(): Flow<Resource<Recipes>>
    suspend fun doLogin(loginRequest: LoginRequest): Flow<Resource<LoginResponse>>
    suspend fun addToFavourite(id: String): Flow<Resource<Boolean>>
    suspend fun removeFromFavourite(id: String): Flow<Resource<Boolean>>
    suspend fun isFavourite(id: String): Flow<Resource<Boolean>>
    suspend fun requestFrames(): Flow<Resource<DataFrames>>
    suspend fun requestMatchs(filter: String): Flow<Resource<ResponseMatch>>
    suspend fun requestSounds(filter: String): Flow<Resource<ResponseSound>>
    suspend fun requestSquads(filter: String): Flow<Resource<ResponseSquad>>
    suspend fun requestHighlights(filter: String, pageSize: Int): Flow<Resource<ResponseHighlight>>
    suspend fun requestHistoryMatchs(filter: String, pageSize: Int): Flow<Resource<ResponseHistoryMatch>>
    suspend fun registerUser(): Flow<Resource<ResponseUser>>
    suspend fun getResultGuess(userId: String): Flow<Resource<ResponseResultGuess>>
    suspend fun postGuess(requestBody: RequestBody): Flow<Resource<ResponseGuess>>
}
