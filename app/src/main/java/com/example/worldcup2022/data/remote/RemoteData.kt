package com.example.worldcup2022.data.remote


//import com.example.worldcup2022.data.remote.service.FramesService
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.frames.DataFrames
import com.example.worldcup2022.data.dto.recipes.Recipes
import com.example.worldcup2022.data.dto.recipes.RecipesItem
import com.example.worldcup2022.data.dto.worldcup.*
import com.example.worldcup2022.data.error.NETWORK_ERROR
import com.example.worldcup2022.data.error.NO_INTERNET_CONNECTION
import com.example.worldcup2022.data.remote.service.*
import com.example.worldcup2022.utils.NetworkConnectivity
import okhttp3.RequestBody
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

    /**
     *
     */
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

    /**
     *
     */
    override suspend fun requestMatch(filter: String): Resource<ResponseMatch> {
        val matchsService = serviceGenerator.createService(MatchsService::class.java)
        return when (val response = processCall { matchsService.fetchMatchs(filter, 0, 100, "dateTime") }) {
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

    /**
     *
     */
    override suspend fun requestSound(filter: String): Resource<ResponseSound> {
        val soundsService = serviceGenerator.createService(SoundsService::class.java)
        return when (val response = processCall { soundsService.fetchSounds(filter, 0, 100) }) {
            is ResponseSound -> {
                Resource.Success(data = response as ResponseSound)
            }
            else -> {
                Resource.DataError(errorCode = response as Int)
            }
        }
    }

    override suspend fun requestSquad(filter: String): Resource<ResponseSquad> {
        val squadsService = serviceGenerator.createService(SquadsService::class.java)
        return when (val response = processCall { squadsService.fetchSquads(filter, 0, 100) }) {
            is ResponseSquad -> {
                Resource.Success(data = response as ResponseSquad)
            }
            else -> {
                Resource.DataError(errorCode = response as Int)
            }
        }
    }

    /**
     *
     */
    override suspend fun requestHighlight(filter: String, pageSize: Int): Resource<ResponseHighlight> {
        val highlightsService = serviceGenerator.createService(HighlightsService::class.java)
        return when (val response =
            processCall { highlightsService.fetchHighlights(filter, pageSize, 10) }) {
            is ResponseHighlight -> {
                Resource.Success(data = response as ResponseHighlight)
            }
            else -> {
                Resource.DataError(errorCode = response as Int)
            }
        }
    }


    /**
     *
     */

    override suspend fun registerUser(): Resource<ResponseUser> {
        val highlightsService = serviceGenerator.createService(UserService::class.java)
        return when (val response =
            processCall { highlightsService.registerUser() }) {
            is ResponseUser -> {
                Resource.Success(data = response as ResponseUser)
            }
            else -> {
                Resource.DataError(errorCode = response as Int)
            }
        }
    }

    /**
     *
     */
    override suspend fun getResultGuess(userId: String): Resource<ResponseResultGuess> {

        val highlightsService = serviceGenerator.createService(ResultGuessService::class.java)
        return when (val response =
            processCall { highlightsService.getResultGuess(userId) }) {
            is ResponseResultGuess -> {
                Resource.Success(data = response as ResponseResultGuess)
            }
            else -> {
                Resource.DataError(errorCode = response as Int)
            }
        }
    }

    /**
     *
     */
    override suspend fun postGuess(requestBody: RequestBody): Resource<ResponseGuess> {
        val postGuess = serviceGenerator.createService(GuessService::class.java)
        return when (val response =
            processCall { postGuess.postGuess(requestBody) }) {
            is ResponseGuess -> {
                Resource.Success(data = response as ResponseGuess)
            }
            else -> {
                Resource.DataError(errorCode = response as Int)
            }
        }
    }

    /**
     *
     */
    override suspend fun requestHistoryMatch(id: String, pageSize: Int): Resource<ResponseHistoryMatch> {
        val historyMatchService = serviceGenerator.createService(HistoryMatchService::class.java)
        return when (val response =
            processCall { historyMatchService.fetchHistoryMatchs(id, pageSize, 10) }) {
            is ResponseHistoryMatch -> {
                Resource.Success(data = response as ResponseHistoryMatch)
            }
            else -> {
                Resource.DataError(errorCode = response as Int)
            }
        }
    }

    /**
     *
     */
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
