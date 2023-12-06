package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.nxtgeni.objectrepository.ObjectRepository;



public class NxtGenAlertPopupPage {

	public WebDriver driver;

	public NxtGenAlertPopupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(name=ObjectRepository.alertBoxName) 
	@CacheLookup
	WebElement alertBox;
	
	@FindBy(name=ObjectRepository.confirmAlertBoxName) 
	@CacheLookup
	WebElement confirmAlertBox;
	
	@FindBy(xpath=ObjectRepository.promptAlertBoxXpath) 
	@CacheLookup
	WebElement promptAlertBox;
	
	public void clickAlertBoxButton() {
		alertBox.click();	
		System.out.println("Alert Button is clicked");		
	}
	

	public void clickConfirmAlertBoxButton() {
		confirmAlertBox.click();
		System.out.println("Confirm Alert Button is clicked");		
	}
	
	public void clickPromptAlertBoxButton() {
		promptAlertBox.click();
		System.out.println("Prompt Alert Button is clicked");		
	}
	
	public void captureAlertMessage() {
		String alertBoxMsg = driver.switchTo().alert().getText();
		System.out.println("Captured Alert Message is "+alertBoxMsg);

	}
	
	public void setAlertMessage(String msg) {
		driver.switchTo().alert().sendKeys(msg);
		System.out.println("Alert Message entered is "+msg);
	}
	
	public void clickOkAlertButton() {
		driver.switchTo().alert().accept();
		System.out.println("Ok Button is clicked");	
	}
	
	public void clickCancelAlertButton() {
		driver.switchTo().alert().dismiss();
		System.out.println("Cancel Button is clicked");	
	}
		
}
