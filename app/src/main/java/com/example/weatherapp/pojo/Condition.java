package com.example.weatherapp.pojo;

import com.google.gson.annotations.SerializedName;

public class Condition{

	@SerializedName("code")
	private int code;

	@SerializedName("icon")
	private String icon;

	@SerializedName("text")
	private String text;

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	@Override
 	public String toString(){
		return 
			"Condition{" + 
			"code = '" + code + '\'' + 
			",icon = '" + icon + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}