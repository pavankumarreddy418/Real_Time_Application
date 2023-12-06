package com.nxtgenai.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import com.nxtgeni.objectrepository.ObjectRepository;

public class NxtGenMultipleWindowsPage {
	
	public WebDriver driver;

	public NxtGenMultipleWindowsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath=ObjectRepository.browserWindowXpath) 
	@CacheLookup
	WebElement browserWindow;
	
	@FindBy(xpath=ObjectRepository.messageWindowXpath) 
	@CacheLookup
	WebElement messageWindow;
	
	@FindBy(xpath=ObjectRepository.browserTabXpath) 
	@CacheLookup
	WebElement browserTab;
	
	public void clickNewBrowserWindowBtn() {
		browserWindow.click();
		System.out.println("New Browser Window Button is clicked");	
	}
	
	public void clickNewMessageWindowBtn() {
		messageWindow.click();
		System.out.println("New Message Window Button is clicked");	
	}
	
	public void clickNewBrowserTabBtn() {
		browserTab.click();
		System.out.println("New Browser Tab Button is clicked");	
	}	

}
