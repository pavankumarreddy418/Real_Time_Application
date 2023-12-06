package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ParaBankUserWelcomePage {

	public WebDriver driver;

	public ParaBankUserWelcomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//p[@class='smallText']") 
	@CacheLookup
	WebElement welcomeUser;

	@FindBy(xpath = "//p[contains(text(),'Your account was created successfully. You are now')]") 
	@CacheLookup
	WebElement successfulMsg;

	@FindBy(xpath = "//a[normalize-space()='Open New Account']") 
	@CacheLookup
	WebElement openNewAccountLink;

	@FindBy(xpath = "//a[normalize-space()='Accounts Overview']") 
	@CacheLookup
	WebElement accountOverviewLink;

	@FindBy(xpath = "//a[normalize-space()='Transfer Funds']") 
	@CacheLookup
	WebElement transferFundLink;

	@FindBy(xpath = "//a[normalize-space()='Bill Pay']") 
	@CacheLookup
	WebElement bilPayLink;

	@FindBy(xpath = "//a[normalize-space()='Find Transactions']") 
	@CacheLookup
	WebElement findTransactionsLink;

	@FindBy(xpath = "//a[normalize-space()='Update Contact Info']") 
	@CacheLookup
	WebElement updateContactInfoLink;

	@FindBy(xpath = "//a[normalize-space()='Request Loan']") 
	@CacheLookup
	WebElement requestLoanLink;

	@FindBy(xpath = "//a[normalize-space()='Log Out']") 
	@CacheLookup
	WebElement logOutLink;

	public void validateWelcomeMsg(String msg) {		

		String actWelcomeMsg = welcomeUser.getText(); 
		String expWelcomeMsg = msg;
		if(actWelcomeMsg.contains(expWelcomeMsg)) {
			System.out.println("The Welcome Message is: " + actWelcomeMsg); 
		} 
		else 
		{
			System.out.println("Actual and Expected Welcome Messages are not same"); 
			System.out.println("Actual Welcome Message is "+actWelcomeMsg);
			System.out.println("Expected Welcome Message is " +expWelcomeMsg); 
		}		
	}
	
	
	public void validateSuccessfulMessage(String msg) {		

		String actSuccessfulMsgText = successfulMsg.getText(); 
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

	public void clickOpenNewAccountLink() {
		openNewAccountLink.click();
	}

	public void clickAccountsOverviewLink() {
		accountOverviewLink.click();
	}

	public void clickTransferFundsLink() {
		transferFundLink.click();
	}
	
	public void clickBillPayLink() {
		bilPayLink.click();
	}
	
	public void clickFindTransactionsLink() {
		findTransactionsLink.click();
	}
	
	public void clickUpdateContactInfoLink() {
		updateContactInfoLink.click();
	}
	
	public void clickRequestLoanLink() {
		requestLoanLink.click();
	}
	
	public void clickLogOutLink() {
		logOutLink.click();
	}

}
