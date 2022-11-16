package com.example.worldcup2022.data.remote

import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.frames.DataFrames
import com.example.worldcup2022.data.dto.recipes.Recipes
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.data.dto.worldcup.ResponseSelfieFrame
import com.example.worldcup2022.data.dto.worldcup.SelfieFrame

/**
 * Created by TruyenIT
 */

internal interface RemoteDataSource {
    suspend fun requestRecipes(): Resource<Recipes>
    suspend fun requestFrames(): Resource<DataFrames>
    suspend fun requestMatch(filter : String): Resource<ResponseMatch>
    suspend fun requestSelfieFrame(): Resource<ResponseSelfieFrame>
}
