package com.example.worldcup2022.data.dto.worldcup

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

/**
 * Created by DucNT on 15/11/2022.
 */
@Parcelize
data class Highlight(
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "createdAt")
    val createdAt: Long? = null,
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "group")
    val group: String? = null,
    @Json(name = "image")
    val image: String? = null
) : Parcelable