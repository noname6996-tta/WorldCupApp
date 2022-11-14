package com.example.worldcup2022.data.dto.worldcup

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

/**
 * Created by TruyenDev on 14/11/2022.
 */
@Parcelize
data class Match(
    @Json(name = "id")
    val id: String = "",
    @Json(name = "createdAt")
    val createdAt: Long = 0L,
    @Json(name = "country1")
    val country1: Country? = null,
    @Json(name = "country1Name")
    val country1Name: String = "",
    @Json(name = "country2")
    val country2: Country? = null,
    @Json(name = "country2Name")
    val country2Name: String = "",
    @Json(name = "group")
    val group: String = "",
    @Json(name = "date")
    val date: String = "",
    @Json(name = "time")
    val time: String = "",
    @Json(name = "stadium")
    val stadium: Stadium = Stadium(),
    @Json(name = "goal")
    val goal: String = "",
    @Json(name = "history")
    val history: String = "",
    @Json(name = "importId")
    val importId: Int = 0,
    @Json(name = "country1Goal")
    val country1Goal: String = "",
    @Json(name = "country2Goal")
    val country2Goal: String = "",


    ) : Parcelable