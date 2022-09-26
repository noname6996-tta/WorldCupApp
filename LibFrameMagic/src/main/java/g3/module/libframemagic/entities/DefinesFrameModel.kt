package g3.module.libframemagic.entities

import com.google.gson.annotations.SerializedName

class DefinesFrameModel(
    @SerializedName("start")
    var start: Int,
    @SerializedName("end")
    var end: Int,
    @SerializedName("totalCollageItemContainer")
    var totalCollageItemContainer: Int,
    @SerializedName("indexDefineCollage")
    var indexDefineCollage: Int

    )
