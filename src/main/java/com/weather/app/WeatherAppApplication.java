package com.weather.app;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherAppApplication {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		SpringApplication.run(WeatherAppApplication.class, args);

		
	}

}
