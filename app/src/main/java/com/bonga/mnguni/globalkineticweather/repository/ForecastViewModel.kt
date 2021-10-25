package com.bonga.mnguni.globalkineticweather.repository

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.bonga.mnguni.globalkineticweather.database.CurrentWeather
import com.bonga.mnguni.globalkineticweather.database.Forecast
import com.bonga.mnguni.globalkineticweather.database.ForecastDatabase

import kotlinx.coroutines.launch


open class ForecastViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: ForecastRepository

    init {
        val forecastDao = ForecastDatabase
            .getDatabase(application, viewModelScope)
            .forestDao()
        repository = ForecastRepository(forecastDao)
    }

    fun getForecast(): LiveData<List<Forecast>> {
        return repository.getForecast()
    }
    fun getCurrent(): LiveData<List<CurrentWeather>> {
        return repository.getCurrent()
    }

    fun insertForecast(forecast: Forecast) = viewModelScope.launch {
        repository.insertForecast(forecast)
    }
    fun insertCurrent(currentWeather: CurrentWeather) = viewModelScope.launch {
        repository.insertCurrentWeather(currentWeather)
    }


}