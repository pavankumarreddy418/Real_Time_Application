package com.telus.selenium4features;

import java.util.List;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.performance.Performance;
import org.openqa.selenium.devtools.v102.performance.model.Metric;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingPerformanceMetrics {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Performance.enable(Optional.empty()));
		List<Metric> metricList = devTools.send(Performance.getMetrics());		
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		
		for(Metric m:metricList) {
			System.out.println(m.getName() +"->"+ m.getValue());
		}
		

	}

}
