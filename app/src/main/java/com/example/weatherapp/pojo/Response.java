package com.example.weatherapp.pojo;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("current")
	private Current current;

	@SerializedName("location")
	private Location location;

	public void setCurrent(Current current){
		this.current = current;
	}

	public Current getCurrent(){
		return current;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"current = '" + current + '\'' +
			",location = '" + location + '\'' + 
			"}";
		}
}