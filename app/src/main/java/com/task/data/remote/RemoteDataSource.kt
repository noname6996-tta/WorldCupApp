package com.task.data.remote

import com.task.data.Resource
import com.task.data.dto.recipes.Recipes
import g3.module.libframemagic.entities.FrameResponseModel

/**
 * Created by AhmedEltaher
 */

internal interface RemoteDataSource {
    suspend fun requestRecipes(): Resource<Recipes>
//    suspend fun requestFrameRespone(): Resource<FrameResponseModel>
}
