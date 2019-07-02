package com.example.weatherapp;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherClient {

    private static WeatherInterface mInterface = null;
    private static OkHttpClient client = null;
    static final String BASE_URL = "https://api.apixu.com/v1/";

    public static void initializeStetho(){
        if (client == null){
            client = new OkHttpClient.Builder()
                    .readTimeout(10, TimeUnit.MINUTES)
                    .writeTimeout(10, TimeUnit.MINUTES)
                    .connectTimeout(10,TimeUnit.MINUTES)
                    .build();
        }
    }

    public static WeatherInterface getWeatherClient() {
        if (mInterface == null) {
            initializeStetho();
            Retrofit weatherClient = new Retrofit.Builder()
                    .client(client)
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            mInterface = weatherClient.create(WeatherInterface.class);
        }
        return mInterface;
    }
}
