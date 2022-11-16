package com.example.worldcup2022.data.dto.worldcup

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

/**
 * Created by DucNT on 16/11/2022.
 */
@Parcelize
data class HistoryMatch(
    @Json(name = "id")
    var id: String? = null,
    @Json(name = "createdAt")
    var createdAt: Long? = null,
    @Json(name = "userId")
    var userId: String? = null,
    @Json(name = "matchId")
    var matchId: String? = null,
    @Json(name = "isRight")
    var isRight: Boolean? = null,
    @Json(name = "teamWin")
    var teamWin: String? = null,
    @Json(name = "time")
    var time: String? = null,
    @Json(name = "goal")
    var goal: String? = null
) : Parcelable