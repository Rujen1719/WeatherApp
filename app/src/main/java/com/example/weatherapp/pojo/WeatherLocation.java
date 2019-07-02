package com.example.weatherapp.pojo;

public class WeatherLocation {

    String id;
    String location;

    public WeatherLocation(String id, String location) {
        this.id = id;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }
}
