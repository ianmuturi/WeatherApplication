package com.weather.app.utils;

import java.io.Serializable;

public class Weather implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String day;
	private int maxTemperature;
	private int minTemperature;
	private int tempSpread;
	
	// getter and setter methods 
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getMaxTemperature() {
		return maxTemperature;
	}
	public void setMaxTemperature(int maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	public int getMinTemperature() {
		return minTemperature;
	}
	public void setMinTemperature(int minTemperature) {
		this.minTemperature = minTemperature;
	}
	public int getTempSpread() {
		return tempSpread;
	}
	public void setTempSpread(int tempSpread) {
		this.tempSpread = tempSpread;
	}
	
	
	
	

}
