package com.bonga.mnguni.globalkineticweather.restApi.CurrentWeather


data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)