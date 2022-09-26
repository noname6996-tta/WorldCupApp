package g3.module.libframemagic.retrofit.api

import g3.module.libframemagic.entities.FrameResponseModel
import io.reactivex.Single
import io.reactivex.subjects.SingleSubject
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
    fun <T> getApiData(@Url name: String): SingleSubject<T>


    @GET
    fun getApiDataFrame(@Url name: String): Single<FrameResponseModel>


}
