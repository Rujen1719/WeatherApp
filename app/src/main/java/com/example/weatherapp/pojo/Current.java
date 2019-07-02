package com.example.weatherapp.pojo;

import com.google.gson.annotations.SerializedName;

public class Current{

	@SerializedName("feelslike_c")
	private double feelslikeC;

	@SerializedName("uv")
	private int uv;

	@SerializedName("last_updated")
	private String lastUpdated;

	@SerializedName("feelslike_f")
	private int feelslikeF;

	@SerializedName("wind_degree")
	private int windDegree;

	@SerializedName("last_updated_epoch")
	private int lastUpdatedEpoch;

	@SerializedName("is_day")
	private int isDay;

	@SerializedName("precip_in")
	private int precipIn;

	@SerializedName("wind_dir")
	private String windDir;

	@SerializedName("gust_mph")
	private double gustMph;

	@SerializedName("temp_c")
	private int tempC;

	@SerializedName("pressure_in")
	private double pressureIn;

	@SerializedName("gust_kph")
	private double gustKph;

	@SerializedName("temp_f")
	private double tempF;

	@SerializedName("precip_mm")
	private int precipMm;

	@SerializedName("cloud")
	private int cloud;

	@SerializedName("wind_kph")
	private double windKph;

	@SerializedName("condition")
	private Condition condition;

	@SerializedName("wind_mph")
	private double windMph;

	@SerializedName("vis_km")
	private int visKm;

	@SerializedName("humidity")
	private int humidity;

	@SerializedName("pressure_mb")
	private int pressureMb;

	@SerializedName("vis_miles")
	private int visMiles;

	public void setFeelslikeC(double feelslikeC){
		this.feelslikeC = feelslikeC;
	}

	public double getFeelslikeC(){
		return feelslikeC;
	}

	public void setUv(int uv){
		this.uv = uv;
	}

	public int getUv(){
		return uv;
	}

	public void setLastUpdated(String lastUpdated){
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public void setFeelslikeF(int feelslikeF){
		this.feelslikeF = feelslikeF;
	}

	public int getFeelslikeF(){
		return feelslikeF;
	}

	public void setWindDegree(int windDegree){
		this.windDegree = windDegree;
	}

	public int getWindDegree(){
		return windDegree;
	}

	public void setLastUpdatedEpoch(int lastUpdatedEpoch){
		this.lastUpdatedEpoch = lastUpdatedEpoch;
	}

	public int getLastUpdatedEpoch(){
		return lastUpdatedEpoch;
	}

	public void setIsDay(int isDay){
		this.isDay = isDay;
	}

	public int getIsDay(){
		return isDay;
	}

	public void setPrecipIn(int precipIn){
		this.precipIn = precipIn;
	}

	public int getPrecipIn(){
		return precipIn;
	}

	public void setWindDir(String windDir){
		this.windDir = windDir;
	}

	public String getWindDir(){
		return windDir;
	}

	public void setGustMph(double gustMph){
		this.gustMph = gustMph;
	}

	public double getGustMph(){
		return gustMph;
	}

	public void setTempC(int tempC){
		this.tempC = tempC;
	}

	public int getTempC(){
		return tempC;
	}

	public void setPressureIn(double pressureIn){
		this.pressureIn = pressureIn;
	}

	public double getPressureIn(){
		return pressureIn;
	}

	public void setGustKph(double gustKph){
		this.gustKph = gustKph;
	}

	public double getGustKph(){
		return gustKph;
	}

	public void setTempF(double tempF){
		this.tempF = tempF;
	}

	public double getTempF(){
		return tempF;
	}

	public void setPrecipMm(int precipMm){
		this.precipMm = precipMm;
	}

	public int getPrecipMm(){
		return precipMm;
	}

	public void setCloud(int cloud){
		this.cloud = cloud;
	}

	public int getCloud(){
		return cloud;
	}

	public void setWindKph(double windKph){
		this.windKph = windKph;
	}

	public double getWindKph(){
		return windKph;
	}

	public void setCondition(Condition condition){
		this.condition = condition;
	}

	public Condition getCondition(){
		return condition;
	}

	public void setWindMph(double windMph){
		this.windMph = windMph;
	}

	public double getWindMph(){
		return windMph;
	}

	public void setVisKm(int visKm){
		this.visKm = visKm;
	}

	public int getVisKm(){
		return visKm;
	}

	public void setHumidity(int humidity){
		this.humidity = humidity;
	}

	public int getHumidity(){
		return humidity;
	}

	public void setPressureMb(int pressureMb){
		this.pressureMb = pressureMb;
	}

	public int getPressureMb(){
		return pressureMb;
	}

	public void setVisMiles(int visMiles){
		this.visMiles = visMiles;
	}

	public int getVisMiles(){
		return visMiles;
	}

	@Override
 	public String toString(){
		return 
			"Current{" + 
			"feelslike_c = '" + feelslikeC + '\'' + 
			",uv = '" + uv + '\'' + 
			",last_updated = '" + lastUpdated + '\'' + 
			",feelslike_f = '" + feelslikeF + '\'' + 
			",wind_degree = '" + windDegree + '\'' + 
			",last_updated_epoch = '" + lastUpdatedEpoch + '\'' + 
			",is_day = '" + isDay + '\'' + 
			",precip_in = '" + precipIn + '\'' + 
			",wind_dir = '" + windDir + '\'' + 
			",gust_mph = '" + gustMph + '\'' + 
			",temp_c = '" + tempC + '\'' + 
			",pressure_in = '" + pressureIn + '\'' + 
			",gust_kph = '" + gustKph + '\'' + 
			",temp_f = '" + tempF + '\'' + 
			",precip_mm = '" + precipMm + '\'' + 
			",cloud = '" + cloud + '\'' + 
			",wind_kph = '" + windKph + '\'' + 
			",condition = '" + condition + '\'' + 
			",wind_mph = '" + windMph + '\'' + 
			",vis_km = '" + visKm + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",pressure_mb = '" + pressureMb + '\'' + 
			",vis_miles = '" + visMiles + '\'' + 
			"}";
		}
}