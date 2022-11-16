package com.example.worldcup2022.data.dto.worldcup

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

/**
 * Created by TruyenDev on 16/11/2022.
 */
@Parcelize
data class ResultGuess(
    @Json(name = "userId")
    val userId: String = "",
    @Json(name = "total")
    val total: Int = 0,
    @Json(name = "rightCount")
    val rightCount: Int = 0,
    @Json(name = "wrongCount")
    val wrongCount: Int = 0,
) : Parcelable