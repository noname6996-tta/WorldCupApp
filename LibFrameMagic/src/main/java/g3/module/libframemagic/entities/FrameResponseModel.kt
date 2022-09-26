package g3.module.libframemagic.entities

import com.google.gson.annotations.SerializedName

class FrameResponseModel(
    @SerializedName("start_link")
    var start_link : String,
    @SerializedName("listPhotoFrames")
    var listPhotoFrames : ArrayList<FolderFrameModel>
)