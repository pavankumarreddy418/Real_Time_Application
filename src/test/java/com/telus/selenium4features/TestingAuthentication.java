package com.telus.selenium4features;

import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingAuthentication {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.register(UsernameAndPassword.of("admin", "admin"));
				
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();

	}

}
