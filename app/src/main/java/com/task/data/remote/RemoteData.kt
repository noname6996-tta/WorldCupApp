package com.task.data.remote

import com.task.data.Resource
import com.task.data.dto.recipes.Recipes
import com.task.data.dto.recipes.RecipesItem
import com.task.data.error.NETWORK_ERROR
import com.task.data.error.NO_INTERNET_CONNECTION
//import com.task.data.remote.service.FramesService
import com.task.data.remote.service.RecipesService
import com.task.utils.NetworkConnectivity
import g3.module.libframemagic.entities.FrameResponseModel
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject


/**
 * Created by AhmedEltaher
 */

class RemoteData @Inject
constructor(private val serviceGenerator: ServiceGenerator, private val networkConnectivity: NetworkConnectivity) : RemoteDataSource {
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

//    override suspend fun requestFrameRespone(): Resource<FrameResponseModel> {
//        val framesService = serviceGenerator.createService(FramesService::class.java)
//        return when (val response = processCall(framesService::fetchFramesResponse)) {
//            is FrameResponseModel -> {
//                Resource.Success(data = response)
//            }
//            else -> {
//                Resource.DataError(errorCode = response as Int)
//            }
//        }
//    }

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
