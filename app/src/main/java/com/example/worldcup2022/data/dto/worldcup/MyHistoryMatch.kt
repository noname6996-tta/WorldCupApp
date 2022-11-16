package com.example.worldcup2022.data.dto.worldcup

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

/**
 * Created by DucNT on 16/11/2022.
 */
@Parcelize
data class MyHistoryMatch(
    val historyMatch: HistoryMatch = HistoryMatch(),
    val match: Match = Match()
) : Parcelable {
    override fun equals(other: Any?): Boolean {
        return this.historyMatch.time == (other as MyHistoryMatch?)?.historyMatch?.time
    }
}