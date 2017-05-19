# WeatherApplication
The application reads a weather.dat file and loads the Minimum Temperature ,Maximum Temperature and Day to a weather object. It gets the difference between Maximum Temperature and Minimum Temperature and returns the maximum value from the array.

Features

  Reads minimum temperature and maximum temperature and gets the difference
  
  Loops through weather array and returns maximum value which is the difference of maximum temperature and minimum temperature.


Compatibility

  Java 1.70 and above
  Maven 3 or later

Preferred IDE

Spring Tool Suite(STS) 3.8.4

  Download from http://download.springsource.com/release/STS/3.8.4.RELEASE/dist/e4.6/spring-tool-suite-3.8.4.RELEASE-e4.6.3-win32-x86_64.zip for windows
  Download from http://download.springsource.com/release/STS/3.8.4.RELEASE/dist/e4.6/spring-tool-suite-3.8.4.RELEASE-e4.6.3-macosx-cocoa-x86_64.tar.gz for mac or
  Download from http://download.springsource.com/release/STS/3.8.4.RELEASE/dist/e4.6/spring-tool-suite-3.8.4.RELEASE-e4.6.3-linux-gtk-x86_64.tar.gz for linux 64bit
  Download from http://download.springsource.com/release/STS/3.8.4.RELEASE/dist/e4.6/spring-tool-suite-3.8.4.RELEASE-e4.6.3-linux-gtk.tar.gz for linux 32bit

Walkthrough

  The app is built by java spring boot framework. It has spring boot starter version 2.0.0 it can run on java 1.70 and above

Structure
 
 Application Structure on Spring Tool Suite(STS) 3.8.4
 
    src/main/java

    com.weather.app

      WeatherAppApplication.java

    com.weather.app.services

      ReadFile.java    
      MaxSpread.java

    com.weather.app.utils

      Weather.java

    src/main/java

      File
      application.properties      
      Weather.dat

     src/test/java

     JRE System Library

     Maven Dependancies

     src

     target

     mvnw

     mvnw.cmd

     pom.xml

Usage

Open in IDE

  To open app on sts(spring tool suite) IDE go to File click import then select an import source choose Existing Maven projects. Then go to the directory of
  the application and import. Right click on the project and Select Maven then click on Maven Install menu to get all dependancies. Finally now right click on the app and choose run as spring boot app.
  
Run App

Open the folder where the app is located and open target folder. Open command line inside the target folder then key in 
java -jar "weather-Version 1.0.0.jar" in linux or windows
