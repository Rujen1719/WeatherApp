package com.example.weatherapp;

import com.example.weatherapp.pojo.Location;
import com.example.weatherapp.pojo.Response;
import com.example.weatherapp.pojo.WeatherModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherInterface {

    @GET("current.json?key=0bc8b1d1c8e048cabc363331192205")
    Call<WeatherModel> getWeatherData(
            @Query("q") String location
    );
}