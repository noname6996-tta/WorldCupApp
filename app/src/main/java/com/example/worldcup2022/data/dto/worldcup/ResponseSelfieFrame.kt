package com.example.worldcup2022.data.dto.worldcup

import com.squareup.moshi.Json

class ResponseSelfieFrame(
    @Json(name = "status")
    val status: String = "",
    @Json(name = "code")
    val code: Int = 0,
    @Json(name = "data")
    val data: List<SelfieFrame> = listOf()
) {
}