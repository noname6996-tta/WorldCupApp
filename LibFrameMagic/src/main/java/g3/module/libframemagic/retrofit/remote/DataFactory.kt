package g3.module.libframemagic.retrofit.remote


import g3.module.libframemagic.entities.FolderFrameModel
import g3.module.libframemagic.entities.FrameResponseModel
import g3.module.libframemagic.entities.ItemFrameModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import g3.module.libframemagic.retrofit.api.ApiService
import g3.module.libframemagic.retrofit.api.DataClient

class DataFactory {
    private var mIsStart = false
    private var mIsEnd = false
    private var mListItemSky = ArrayList<ItemFrameModel>()

    /**
     *
     */
    fun getDataApiSkyResponse(
        compositeDisposable: CompositeDisposable,
        urlApi: String,
        parameterName: String,
        onDataSuccess: (mListFolder: ArrayList<FolderFrameModel>, mListItemSky: ArrayList<ItemFrameModel>) -> Unit,
        onDataError: (err: Throwable) -> Unit
    ) {
        val apiService: ApiService = DataClient.getClient(urlApi)
        compositeDisposable.add(
            apiService.getApiDataFrame(parameterName)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        createData(it) { mListFolder, mListItemSky ->
                            onDataSuccess(mListFolder, mListItemSky)
                        }

                    },
                    {
                        onDataError(it)
                    }
                )
        )
    }

    /**
     *
     */
    private fun createData(data: FrameResponseModel, onSuccess: (mListFolder: ArrayList<FolderFrameModel>, mListItemSky: ArrayList<ItemFrameModel>) -> Unit) {
        mListItemSky.clear()
        val start_link = data.start_link

        for (k in 0 until data.listPhotoFrames.size) {
            var itemFolder = data.listPhotoFrames[k]
            for (i in itemFolder.defines[0].start..itemFolder.defines[0].end) {
                var urlImage = start_link + itemFolder.folder + "%2Fframe_"+i+".png"
                var itemFrameModel = ItemFrameModel(k,urlImage)
                mListItemSky.add(itemFrameModel)
            }

        }
        onSuccess(data.listPhotoFrames, mListItemSky)
    }

}