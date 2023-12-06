package com.telus.selenium4features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshotFullPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://nxtgenaiacademy.com/atozautomationtraining/");
		driver.manage().window().maximize();
		
		File screenshot = driver.getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//Screenshot//syllbus.jpg"));
		
		
	}

}
