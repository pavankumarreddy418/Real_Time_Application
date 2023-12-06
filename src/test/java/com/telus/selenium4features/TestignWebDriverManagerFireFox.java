package com.telus.selenium4features;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestignWebDriverManagerFireFox {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();		
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		

	}

}
