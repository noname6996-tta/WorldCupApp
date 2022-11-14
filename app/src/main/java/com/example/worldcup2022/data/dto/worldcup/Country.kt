package com.example.worldcup2022.data.dto.worldcup

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

/**
 * Created by TruyenDev on 14/11/2022.
 */
@Parcelize
class Country(
    @Json(name = "id")
    val id: String = "",
    @Json(name = "createdAt")
    val createdAt: Long = 0L,
    @Json(name = "name")
    val name: String = "",
    @Json(name = "group")
    val group: String = "",
    @Json(name = "image")
    val image: String = "",
    @Json(name = "played")
    val played: Int = 0,
    @Json(name = "won")
    val won: Int = 0,
    @Json(name = "lost")
    val lost: Int = 0,
    @Json(name = "draw")
    val draw: Int = 0,
    @Json(name = "goalDifference")
    val goalDifference: Int = 0,
    @Json(name = "point")
    val point: Int = 0,
    @Json(name = "order")
    val order: Int = 0,
) : Parcelable