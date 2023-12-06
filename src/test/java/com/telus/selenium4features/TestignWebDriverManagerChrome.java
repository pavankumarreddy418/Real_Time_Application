package com.telus.selenium4features;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestignWebDriverManagerChrome {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		

	}

}
