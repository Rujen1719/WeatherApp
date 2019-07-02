package com.example.weatherapp.RetrofitSample;

import com.example.weatherapp.RetrofitSample.Model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetroInterface {

    @GET("insights")
    Call<Model> getApiData();

}
