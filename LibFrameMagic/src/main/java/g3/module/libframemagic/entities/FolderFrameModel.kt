package g3.module.libframemagic.entities

import com.google.gson.annotations.SerializedName

class FolderFrameModel(
    @SerializedName("name")
    var name: String,
    @SerializedName("name_vi")
    var name_vi: String,
    @SerializedName("folder")
    var folder: String,
    @SerializedName("icon")
    var icon: String,
    @SerializedName("cover")
    var cover: String,
    @SerializedName("totalImage")
    var totalImage: Int,
    @SerializedName("lock")
    var lock: Boolean,
    @SerializedName("openPackageName")
    var openPackageName: String,
    @SerializedName("defines")
    var defines: ArrayList<DefinesFrameModel>,
    var linkCoverFull : String

)