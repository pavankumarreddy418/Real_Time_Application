package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import com.nxtgeni.objectrepository.ObjectRepository;

public class NxtGenSuccessfulMessagePage {

	public WebDriver driver;

	public NxtGenSuccessfulMessagePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath =ObjectRepository.successfulMessageXpath) 
	@CacheLookup
	WebElement successfulMessage;
	
	
	public void validateSuccessfulMessage(String msg) {		
		
		String actSuccessfulMsgText = successfulMessage.getText(); 
		String expSuccessfulMsgText = msg;
		if(actSuccessfulMsgText.contains(expSuccessfulMsgText)) {
			System.out.println("The Successful Message Text is: " + actSuccessfulMsgText); 
		} 
		else 
		{
			System.out.println("Actual and Expected Successful Message Text are not same"); 
			System.out.println("Actual Successful Message Text is "+actSuccessfulMsgText);
			System.out.println("Expected Successful Message Text is " +expSuccessfulMsgText); 
		}		
	}
	
}
