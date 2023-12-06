package com.telus.selenium4features;


import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestignWebDriverManagerEdge {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();	
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		

	}

}
