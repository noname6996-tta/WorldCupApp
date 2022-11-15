package com.example.worldcup2022.data.dto.worldcup

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

/**
 * Created by DucNT on 15/11/2022.
 */
@Parcelize
data class MyPage(
    @Json(name = "size")
    val size: Int? = null,
    @Json(name = "number")
    val number: Int? = null,
    @Json(name = "totalElements")
    val totalElements: Int? = null,
    @Json(name = "totalPages")
    val totalPages: Int? = null
) : Parcelable