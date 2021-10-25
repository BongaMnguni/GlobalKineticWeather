package com.bonga.mnguni.globalkineticweather.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.bonga.mnguni.globalkineticweather.database.CurrentWeather
import com.bonga.mnguni.globalkineticweather.database.Forecast
import com.bonga.mnguni.globalkineticweather.database.ForecastDao


class ForecastRepository(private val forecastDao: ForecastDao) {

    fun getForecast(): LiveData<List<Forecast>> {
        return forecastDao.getAllForecast()
    }
    fun getCurrent(): LiveData<List<CurrentWeather>> {
        return forecastDao.getCurrent()
    }

    suspend fun insertForecast(forecast: Forecast) {
        forecastDao.insertAllForecast(forecast)
    }
    suspend fun insertCurrentWeather(currentWeather: CurrentWeather){
        forecastDao.insertCurrentWeather(currentWeather)
    }
    fun DeleteAll(forecastDao: ForecastDao) {

        forecastDao.deleteAll()
        forecastDao.deleteAllCurrent()

        Log.d("DeletedAllData", "prePopulateDatabase: ")
    }




}