package com.bonga.mnguni.globalkineticweather.restApi.CurrentWeather


import com.google.gson.annotations.SerializedName

data class Wind(
    val deg: Int,
    val speed: Double
)