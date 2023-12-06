package com.telus.selenium4features;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestignWebDriverManagerChromeSpecificVersion {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().driverVersion("102.0.5005.63").setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		

	}

}
