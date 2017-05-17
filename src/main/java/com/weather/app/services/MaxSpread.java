package com.weather.app.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.weather.app.utils.Weather;

@Component
public class MaxSpread {

	
	public int getMax(Weather weather){
		
		// this gives you a 1-dimensional array of integer
		List<Integer> myArrayList = new ArrayList<Integer>();
		
		//Add Temperature object to Arraylist		
		myArrayList.add(weather.getTempSpread());
		
		//return maximum value
		return Collections.max(myArrayList);
	
	     
	}
}
