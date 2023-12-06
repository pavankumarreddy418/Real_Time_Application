package com.telus.selenium4features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorsExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		
		// Relative Locator - below 
		// First name is below the title 
		WebElement title = driver.findElement(By.xpath("//*[@id=\"item-vfb-1\"]/div/h3"));
		
		// First Name
		WebElement firstName = driver.findElement(RelativeLocator.with(By.id("vfb-5")).below(title));
		firstName.sendKeys("vinoth");
		
		// Relative Locator - above
		//  City is above the postal code 
		WebElement postal = driver.findElement(By.id("vfb-13-zip"));
		
		// City
		WebElement city = driver.findElement(RelativeLocator.with(By.id("vfb-13-city")).above(postal));
		city.sendKeys("Chennai");
		
		// Relative Locator -toLeftOf
		// UFT checkbox is to the left of TestNG checkbox
		WebElement testNG = driver.findElement(By.id("vfb-20-2"));
		
		// UFT checkbox
		WebElement uft = driver.findElement(RelativeLocator.with(By.id("vfb-20-1")).toLeftOf(testNG));
		uft.click();
		
		// Relative Locator - toRightOf
		// Others checkbox is to the right of functional testing checkbox
		WebElement funcTesting = driver.findElement(By.id("vfb-20-4"));
		
		// Others checkbox 
		WebElement others = driver.findElement(RelativeLocator.with(By.id("vfb-20-5"))
							.toRightOf(funcTesting));
		
		others.click();
		
		// Relative Locator - near (50px away from the element)
		WebElement enterYourQueryLabel = driver.findElement(By.xpath("//label[@for='vfb-23']"));
		
		// Enter your query box
		WebElement enterYourQuery = driver.findElement(RelativeLocator.with(By.id("vfb-23"))
										.near(enterYourQueryLabel));
		
		enterYourQuery.sendKeys("hello");
		
	}

}
