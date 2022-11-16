package com.example.worldcup2022.data.remote

import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.frames.DataFrames
import com.example.worldcup2022.data.dto.recipes.Recipes
import com.example.worldcup2022.data.dto.worldcup.ResponseHighlight
import com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.data.dto.worldcup.ResponseSound

/**
 * Created by TruyenIT
 */

internal interface RemoteDataSource {
    suspend fun requestRecipes(): Resource<Recipes>
    suspend fun requestFrames(): Resource<DataFrames>
    suspend fun requestMatch(filter : String): Resource<ResponseMatch>
    suspend fun requestSound(filter : String): Resource<ResponseSound>
    suspend fun requestHighlight(filter : String, pageSize: Int): Resource<ResponseHighlight>
    suspend fun requestHistoryMatch(filter : String, pageSize: Int): Resource<ResponseHistoryMatch>
}
