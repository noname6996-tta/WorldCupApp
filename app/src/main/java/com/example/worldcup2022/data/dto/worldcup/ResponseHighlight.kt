package com.example.worldcup2022.data.dto.worldcup

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

/**
 * Created by DucNT on 15/11/2022.
 */
@Parcelize
data class ResponseHighlight(
    @Json(name = "status")
    val status: String? = null,
    @Json(name = "code")
    val code: Int? = null,
    @Json(name = "data")
    val data: List<Highlight>? = null,
    @Json(name = "myPage")
    val myPage: MyPage? = null
) : Parcelable
