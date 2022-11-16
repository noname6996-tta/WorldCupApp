package com.example.worldcup2022.data.dto.worldcup

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
class Squad(
    @Json(name = "id")
    val id: String = "",
    @Json(name = "createdAt")
    val createdAt: Long = 0L,
    @Json(name = "countryId")
    val countryId: String = "",
    @Json(name = "name")
    val name: String = "",
    @Json(name = "image")
    val image: String = "",
    @Json(name = "position")
    val position: String = ""
) : Parcelable