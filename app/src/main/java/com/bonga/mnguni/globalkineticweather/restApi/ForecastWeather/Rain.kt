package com.bonga.mnguni.globalkineticweather.restApi.ForecastWeather
import com.google.gson.annotations.SerializedName

data class Rain(
    @SerializedName("3h")
    val h: Double
)