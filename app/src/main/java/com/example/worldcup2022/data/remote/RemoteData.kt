package com.example.worldcup2022.data.remote

import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.frames.DataFrames
import com.example.worldcup2022.data.dto.recipes.Recipes
import com.example.worldcup2022.data.dto.recipes.RecipesItem
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.data.dto.worldcup.ResponseSelfieFrame
import com.example.worldcup2022.data.dto.worldcup.SelfieFrame
import com.example.worldcup2022.data.error.NETWORK_ERROR
import com.example.worldcup2022.data.error.NO_INTERNET_CONNECTION
import com.example.worldcup2022.data.remote.service.FramesService
import com.example.worldcup2022.data.remote.service.MatchsService
//import com.example.worldcup2022.data.remote.service.FramesService
import com.example.worldcup2022.data.remote.service.RecipesService
import com.example.worldcup2022.data.remote.service.SelfieFrameService
import com.example.worldcup2022.utils.NetworkConnectivity
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject


/**
 * Created by TruyenIT
 */

class RemoteData @Inject
constructor(
    private val serviceGenerator: ServiceGenerator,
    private val networkConnectivity: NetworkConnectivity
) : RemoteDataSource {
    override suspend fun requestRecipes(): Resource<Recipes> {
        val recipesService = serviceGenerator.createService(RecipesService::class.java)
        return when (val response = processCall(recipesService::fetchRecipes)) {
            is List<*> -> {
                Resource.Success(data = Recipes(response as ArrayList<RecipesItem>))
            }
            else -> {
                Resource.DataError(errorCode = response as Int)
            }
        }
    }

    override suspend fun requestFrames(): Resource<DataFrames> {
        val framesService = serviceGenerator.createService(FramesService::class.java)
        return when (val response = processCall(framesService::fetchFrames)) {
            is DataFrames -> {
                Resource.Success(data = response as DataFrames)
            }
            else -> {
                Resource.DataError(errorCode = response as Int)
            }
        }
    }

    override suspend fun requestMatch(filter:String): Resource<ResponseMatch> {
        val matchsService = serviceGenerator.createService(MatchsService::class.java)
        return when (val response = processCall { matchsService.fetchMatchs(filter, 0, 100) }) {
            is ResponseMatch -> {
                Resource.Success(data = response as ResponseMatch)
            }
            else -> {
                Resource.DataError(errorCode = response as Int)
            }
        }
    }

    override suspend fun requestSelfieFrame(): Resource<ResponseSelfieFrame> {
        val selfieFrameService = serviceGenerator.createService(SelfieFrameService::class.java)
        return when (val response =
            processCall { selfieFrameService.fetch("group=in=(player, team)", 0, 100) }) {
            is ResponseSelfieFrame -> Resource.Success(data = response)
            else -> Resource.DataError(errorCode = (response as ResponseSelfieFrame).code)
        }
    }

    private suspend fun processCall(responseCall: suspend () -> Response<*>): Any? {
        if (!networkConnectivity.isConnected()) {
            return NO_INTERNET_CONNECTION
        }
        return try {
            val response = responseCall.invoke()
            val responseCode = response.code()
            if (response.isSuccessful) {
                response.body()
            } else {
                responseCode
            }
        } catch (e: IOException) {
            NETWORK_ERROR
        }
    }
}
