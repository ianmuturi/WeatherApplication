package com.weather.app.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import com.weather.app.utils.Weather;


@Component
public class ReadFile {

	@Autowired
	MaxSpread maxSpread;
	
	@Autowired
	private ResourceLoader resourceLoader;
	
	Weather weather = new Weather();
	
	
	@EventListener(ContextRefreshedEvent.class)
	public void readWeatherFile() throws IOException 
	{
		Scanner inputStream;		 
		
        try{
        	//Scanner will read from file
            inputStream = new Scanner(resourceLoader.getResource("classpath:weather.dat").getInputStream());
            
            //Read header lines
            inputStream.nextLine();
            inputStream.nextLine();
            
            //Read body lines from the file
            while(inputStream.hasNextLine()){
            	            	
            	//Store line in a variable
                String line= inputStream.nextLine();
                
                //Skip footer line
            	if (line.contains("mo")) {
  			      continue;
  			    }
                
                //Format line to remove spaces
                line = line.replace("  "," ");
                line = line.replace("  "," ");
                line = line.replace("  "," ");                
                line = line.trim();
                
                //Replace single space with comma
                line = line.replace(" ",",");
                
                
                //Split the line into parts
                String []values = line.split(",");
                
                //Get components of the parts
                String strDay = values[0];
                String strMaxTemp = values[1];
                String strMinTemp = values[2];
            	
                //set values of file to weather object
                weather.setDay(strDay);
                
                //find integer within a string
                Pattern p = Pattern.compile("[0-9]+");
                Matcher m = p.matcher(strMinTemp);
                while (m.find()) {
                    int n = Integer.parseInt(m.group());
                  // set integer to weather
                    weather.setMinTemperature(n);
                }
                
               //find integer within a string
                Pattern p1 = Pattern.compile("[0-9]+");
                Matcher m1 = p1.matcher(strMaxTemp);
                while (m1.find()) {
                    int n = Integer.parseInt(m1.group());
                    // set integer to weather
                    weather.setMaxTemperature(n);
                }
                
                //set temperature spread
                weather.setTempSpread(weather.getMaxTemperature()-weather.getMinTemperature());
                
                
            }

            System.out.println("*******************   Start Reading   ******************");
            //Print the maximum temperature spread and day
            System.out.println("Day: "+weather.getDay()+"  Maximum Temperature Spread:  "+maxSpread.getMax(weather));
            System.out.println("******************* Finished Reading *******************");
            inputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
	}
	
}
