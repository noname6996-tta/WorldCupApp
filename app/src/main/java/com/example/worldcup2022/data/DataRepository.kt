package com.example.worldcup2022.data

import com.example.worldcup2022.data.dto.frames.DataFrames
import com.example.worldcup2022.data.dto.login.LoginRequest
import com.example.worldcup2022.data.dto.login.LoginResponse
import com.example.worldcup2022.data.dto.recipes.Recipes
import com.example.worldcup2022.data.dto.worldcup.ResponseHighlight
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.data.local.LocalData
import com.example.worldcup2022.data.remote.RemoteData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext


/**
 * Created by TruyenIT
 */

class DataRepository @Inject constructor(private val remoteRepository: RemoteData, private val localRepository: LocalData, private val ioDispatcher: CoroutineContext) : DataRepositorySource {

    override suspend fun requestRecipes(): Flow<Resource<Recipes>> {
        return flow {
            emit(remoteRepository.requestRecipes())
        }.flowOn(ioDispatcher)
    }


    override suspend fun doLogin(loginRequest: LoginRequest): Flow<Resource<LoginResponse>> {
        return flow {
            emit(localRepository.doLogin(loginRequest))
        }.flowOn(ioDispatcher)
    }

    override suspend fun addToFavourite(id: String): Flow<Resource<Boolean>> {
        return flow {
            localRepository.getCachedFavourites().let {
                it.data?.toMutableSet()?.let { set ->
                    val isAdded = set.add(id)
                    if (isAdded) {
                        emit(localRepository.cacheFavourites(set))
                    } else {
                        emit(Resource.Success(false))
                    }
                }
                it.errorCode?.let { errorCode ->
                    emit(Resource.DataError<Boolean>(errorCode))
                }
            }
        }.flowOn(ioDispatcher)
    }

    override suspend fun removeFromFavourite(id: String): Flow<Resource<Boolean>> {
        return flow {
            emit(localRepository.removeFromFavourites(id))
            emit(localRepository.removeFromFavourites(id))
        }.flowOn(ioDispatcher)
    }

    override suspend fun isFavourite(id: String): Flow<Resource<Boolean>> {
        return flow {
            emit(localRepository.isFavourite(id))
        }.flowOn(ioDispatcher)
    }

    override suspend fun requestFrames(): Flow<Resource<DataFrames>> {
        return flow {
            emit(remoteRepository.requestFrames())
        }.flowOn(ioDispatcher)
    }

    override suspend fun requestMatchs(filter: String): Flow<Resource<ResponseMatch>> {
        return flow {
            emit(remoteRepository.requestMatch(filter))
        }.flowOn(ioDispatcher)
    }

    override suspend fun requestHighlights(filter: String, pageSize: Int): Flow<Resource<ResponseHighlight>> {
        return flow {
            emit(remoteRepository.requestHighlight(filter, pageSize))
        }.flowOn(ioDispatcher)
    }
}
