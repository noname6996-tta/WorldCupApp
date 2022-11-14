package com.example.worldcup2022.data.dto.worldcup

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

/**
 * Created by TruyenDev on 14/11/2022.
 */
@Parcelize
data class Stadium(
    @Json(name = "id")
    val id: String = "",
    @Json(name = "createdAt")
    val createdAt: Long = 0L,
    @Json(name = "importId")
    val importId: Int = 0,
    @Json(name = "name")
    val name: String = "",
    @Json(name = "location")
    val location: String = "",
    @Json(name = "capacity")
    val capacity: String = "",
    @Json(name = "opened")
    val opened: String = "",
    @Json(name = "content")
    val content: String = "",
    @Json(name = "image")
    val image: String = "",

    ) : Parcelable