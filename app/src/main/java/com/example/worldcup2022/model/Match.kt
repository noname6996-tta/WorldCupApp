package com.example.worldcup2022.model

import java.io.Serializable

data class Match(
    var id: Int,
    var idcountry1: Int,
    var idcountry2: Int,
    var group: String,
    var date: String,
    var idStadium: Int,
    var goal: String,
    var history: String
) : Serializable
