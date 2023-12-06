package com.telus.selenium4features;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmulateDeviceMode {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		// iPhone 11 Pro
		devTools.send(Emulation.setDeviceMetricsOverride(375, 
					  812, 
					  50, 
					  true, 
					  Optional.empty(), 
					  Optional.empty(), 
					  Optional.empty(), 
					  Optional.empty(), 
					  Optional.empty(), 
					  Optional.empty(), 
					  Optional.empty(), 
					  Optional.empty()));
		
		driver.get("https://nxtgenaiacademy.com/");
		driver.manage().window().maximize();
		
		
	}

}
