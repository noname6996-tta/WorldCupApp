package com.example.worldcup2022.data.dto.worldcup

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
class SelfieFrame(
    @Json(name = "id")
    var id: String = "",

    @Json(name = "createAt")
    var createAt: Long = 0L,

    @Json(name = "name")
    var name: String = "",

    @Json(name = "group")
    var group: String = "",

    @Json(name = "image")
    var linkImage: String = ""
) : Parcelable {
}