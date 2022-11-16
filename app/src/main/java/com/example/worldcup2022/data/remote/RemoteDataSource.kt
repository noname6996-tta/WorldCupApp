package com.example.worldcup2022.data.remote

import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.frames.DataFrames
import com.example.worldcup2022.data.dto.recipes.Recipes
import com.example.worldcup2022.data.dto.worldcup.*

/**
 * Created by TruyenIT
 */

internal interface RemoteDataSource {
    suspend fun requestRecipes(): Resource<Recipes>
    suspend fun requestFrames(): Resource<DataFrames>
    suspend fun requestMatch(filter: String): Resource<ResponseMatch>
    suspend fun requestSound(filter: String): Resource<ResponseSound>
    suspend fun requestHighlight(filter: String, pageSize: Int): Resource<ResponseHighlight>
    suspend fun registerUser(): Resource<ResponseUser>
    suspend fun getResultGuess(userId: String): Resource<ResponseResultGuess>
}
