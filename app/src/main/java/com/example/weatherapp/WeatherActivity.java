package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.bumptech.glide.Glide;
import com.example.weatherapp.RetrofitSample.MainActivity;
import com.example.weatherapp.pojo.Location;
import com.example.weatherapp.pojo.Response;
import com.example.weatherapp.pojo.WeatherLocation;
import com.example.weatherapp.pojo.WeatherModel;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;

public class WeatherActivity extends AppCompatActivity {

    private TextView mLocationName;
    private TextView mConditionText;
    private TextView mTemperatureC;
    private TextView mDescription;
    private TextView mUVindex;
    private TextView mHumidity;
    private TextView mWind;
    private TextView mPressure;

    private ImageView mSearchIcon;
    private ImageView mConditionGif;

    private NestedScrollView mWeatherBackground;

    private LinearLayout mCardViewWeatherDescription;
    private LinearLayout mCardViewWeatherUvIndex;
    private LinearLayout mCardViewWeatherHumidity;
    private LinearLayout mCardViewWeatherWind;
    private LinearLayout mCardViewWeatherPressure;

    private MaterialDialog weatherMaterialDialog;
    private RecyclerView weatherRecyclerView;
    private WeatherSearchAdapter weatherAdapter;
    private ArrayList<String> weatherList = new ArrayList<>();
    private AppCompatEditText weatherParam;
    int weatherPosition;
    String weather;
    HashMap<String, String> weatherHashMap = new HashMap<>();

    ArrayList<WeatherLocation> weatherLocations = new ArrayList<WeatherLocation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        weatherLocations.add(new WeatherLocation("1", "Kathmandu"));
        weatherLocations.add(new WeatherLocation("2", "Tokyo"));
        weatherLocations.add(new WeatherLocation("3", "Paris"));
        weatherLocations.add(new WeatherLocation("4", "Boston"));
        weatherLocations.add(new WeatherLocation("5", "Beijing"));
        weatherLocations.add(new WeatherLocation("6", "Accra"));
        weatherLocations.add(new WeatherLocation("7", "Adelaide"));
        weatherLocations.add(new WeatherLocation("8", "Algiers"));
        weatherLocations.add(new WeatherLocation("9", "Almaty"));
        weatherLocations.add(new WeatherLocation("10", "Amman"));
        weatherLocations.add(new WeatherLocation("11", "Amsterdam"));
        weatherLocations.add(new WeatherLocation("12", "Anchorage"));
        weatherLocations.add(new WeatherLocation("13", "Ankara"));
        weatherLocations.add(new WeatherLocation("14", "Antananarivo"));
        weatherLocations.add(new WeatherLocation("15", "Asuncion"));
        weatherLocations.add(new WeatherLocation("16", "Athens"));
        weatherLocations.add(new WeatherLocation("17", "Atlanta"));
        weatherLocations.add(new WeatherLocation("18", "Auckland"));
        weatherLocations.add(new WeatherLocation("19", "Baghdad"));
        weatherLocations.add(new WeatherLocation("20", "Bangalore"));
        weatherLocations.add(new WeatherLocation("21", "Bangkok"));
        weatherLocations.add(new WeatherLocation("22", "Barcelona"));
        weatherLocations.add(new WeatherLocation("23", "Beirut"));
        weatherLocations.add(new WeatherLocation("24", "Belgrade"));
        weatherLocations.add(new WeatherLocation("25", "Berlin"));
        weatherLocations.add(new WeatherLocation("26", "Bogota"));
        weatherLocations.add(new WeatherLocation("27", "Brasilia"));
        weatherLocations.add(new WeatherLocation("28", "Canberra"));
        weatherLocations.add(new WeatherLocation("29", "Brisbane"));
        weatherLocations.add(new WeatherLocation("30", "Brussels"));
        weatherLocations.add(new WeatherLocation("31", "Bucharest"));
        weatherLocations.add(new WeatherLocation("32", "Budapest"));
        weatherLocations.add(new WeatherLocation("33", "Buenos Aires"));
        weatherLocations.add(new WeatherLocation("34", "Cairo"));
        weatherLocations.add(new WeatherLocation("35", "Calgary"));
        weatherLocations.add(new WeatherLocation("36", "Canberra"));
        weatherLocations.add(new WeatherLocation("37", "Cape Town"));
        weatherLocations.add(new WeatherLocation("38", "Caracas"));
        weatherLocations.add(new WeatherLocation("39", "Casablanca"));
        weatherLocations.add(new WeatherLocation("40", "Chicago"));
        weatherLocations.add(new WeatherLocation("41", "Copenhagen"));
        weatherLocations.add(new WeatherLocation("42", "Dallas"));
        weatherLocations.add(new WeatherLocation("43", "Dar es Salaam"));
        weatherLocations.add(new WeatherLocation("44", "Darwin"));
        weatherLocations.add(new WeatherLocation("45", "Denver"));
        weatherLocations.add(new WeatherLocation("46", "Detroit"));
        weatherLocations.add(new WeatherLocation("47", "Dhaka"));
        weatherLocations.add(new WeatherLocation("48", "Doha"));
        weatherLocations.add(new WeatherLocation("49", "Dubai"));
        weatherLocations.add(new WeatherLocation("50", "Dublin"));

        weatherDialog();
        loadLocation(weatherLocations);


        mLocationName = findViewById(R.id.weather_place);
        mConditionText = findViewById(R.id.weather_condition);
        mTemperatureC = findViewById(R.id.weather_temperature);
        mDescription = findViewById(R.id.weather_description);
        mUVindex = findViewById(R.id.weather_uv_index);
        mHumidity = findViewById(R.id.weather_humidity);
        mWind = findViewById(R.id.weather_wind);
        mPressure = findViewById(R.id.weather_pressure);

        mSearchIcon = findViewById(R.id.weather_search_icon);
        mConditionGif = findViewById(R.id.weather_condition_gif);

        mWeatherBackground = findViewById(R.id.activity_weather_background);

        mCardViewWeatherDescription = findViewById(R.id.card_view_weather_description);
        mCardViewWeatherUvIndex = findViewById(R.id.card_view_weather_uv_index);
        mCardViewWeatherHumidity = findViewById(R.id.card_view_weather_humidity);
        mCardViewWeatherWind = findViewById(R.id.card_view_weather_wind);
        mCardViewWeatherPressure = findViewById(R.id.card_view_weather_pressure);

        mSearchIcon.setOnClickListener(v -> weatherMaterialDialog.show());
    }

    private void loadLocation(ArrayList<WeatherLocation> data) {
        weatherHashMap.clear();
        weatherList.clear();
        try {
            for (int i = 0; i < data.size(); i++) {
                weatherHashMap.put(data.get(i).getLocation(), data.get(i).getId());
                weatherList.add(i, data.get(i).getLocation());
            }
            weatherAdapter = new WeatherSearchAdapter(weatherList, (weather, weatherPosition) -> {
                this.weatherPosition = weatherPosition;
                weatherLoad(weather);
                weatherMaterialDialog.dismiss();
            });
            weatherRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            weatherRecyclerView.setAdapter(weatherAdapter);
        } catch (Exception e) {
            Toast.makeText(this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void weatherDialog() {
        weatherMaterialDialog = new MaterialDialog.Builder(this)
                .title("Select Location")
                .customView(R.layout.item_searchable_spinner, true)
                .build();

        View weatherDialog = weatherMaterialDialog.getCustomView();

        weatherRecyclerView = weatherDialog.findViewById(R.id.item_searchable_recyclerview);
        weatherParam = weatherDialog.findViewById(R.id.item_searchable_edittext);
        weatherParam.setInputType(InputType.TYPE_CLASS_TEXT);

        weatherParam.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                weatherAdapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public void weatherLoad(String location) {
        WeatherClient.getWeatherClient().getWeatherData(location).enqueue(new Callback<WeatherModel>() {
            @Override
            public void onResponse(Call<WeatherModel> call, retrofit2.Response<WeatherModel> response) {

                Log.d("dada", new Gson().toJson(response.body()));
                WeatherModel response1 = response.body();
                mLocationName.setText(response1.getLocation().getName());
                mConditionText.setText(response1.getCurrent().getCondition().getText());
                mTemperatureC.setText(response1.getCurrent().getTemp_c() + "°");
                mDescription.setText("Today: " + response1.getCurrent().getCondition().getText() + " currently.");
                mUVindex.setText(response1.getCurrent().getUv());
                mHumidity.setText(response1.getCurrent().getHumidity() + "%");
                mWind.setText(response1.getCurrent().getWind_dir() + " " + response1.getCurrent().getWind_kph() + "km/h");
                mPressure.setText(response1.getCurrent().getPressure_mb() + " mb");

                if (response1.getCurrent().getCondition().getText().equals("Partly cloudy")){
                    Glide.with(WeatherActivity.this).load(R.drawable.partly_cloudy).into(mConditionGif);
                    mWeatherBackground.setBackgroundColor(getResources().getColor(R.color.colorPartlyCloudy));
                    mCardViewWeatherDescription.setBackgroundColor(getResources().getColor(R.color.colorCard));
                    mCardViewWeatherUvIndex.setBackgroundColor(getResources().getColor(R.color.colorCard));
                    mCardViewWeatherHumidity.setBackgroundColor(getResources().getColor(R.color.colorCard));
                    mCardViewWeatherWind.setBackgroundColor(getResources().getColor(R.color.colorCard));
                    mCardViewWeatherPressure.setBackgroundColor(getResources().getColor(R.color.colorCard));
                }
            }

            @Override
            public void onFailure(Call<WeatherModel> call, Throwable t) {
                Toast.makeText(WeatherActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
