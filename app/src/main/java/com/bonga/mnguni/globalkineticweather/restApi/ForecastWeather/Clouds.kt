package com.bonga.mnguni.globalkineticweather.restApi.ForecastWeather
import com.google.gson.annotations.SerializedName

data class Clouds(
    @SerializedName("all")
    val all: Int
)