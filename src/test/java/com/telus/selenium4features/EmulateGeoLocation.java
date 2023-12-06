package com.telus.selenium4features;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmulateGeoLocation {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		// set the latitude and longitude - London
		devTools.send(Emulation.setGeolocationOverride(Optional.of(51.507351), 
													   Optional.of(-0.127758), 
													   Optional.of(100)));		
		
		driver.get("https://my-location.org/");
		driver.manage().window().maximize();
		

	}

}
