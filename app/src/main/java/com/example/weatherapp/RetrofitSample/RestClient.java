package com.example.weatherapp.RetrofitSample;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    private static RetroInterface mInterface = null;
    private static OkHttpClient client = null;
    static final String BASE_URL = "https://kclastute.com/api/";

    public static void initializeStetho() {
        if (client == null) {
            client = new OkHttpClient.Builder()
                    .readTimeout(10, TimeUnit.MINUTES)
                    .connectTimeout(10, TimeUnit.MINUTES)
                    .writeTimeout(10, TimeUnit.MINUTES)
//                    .addNetworkInterceptor(new StethoInterceptor())
                    .build();
        }
    }

    public static RetroInterface getRestClient() {
        if (mInterface == null) {
            initializeStetho();
            Retrofit restClient = new Retrofit.Builder()
                    .client(client)
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            mInterface = restClient.create(RetroInterface.class);
        }
        return mInterface;
    }
}