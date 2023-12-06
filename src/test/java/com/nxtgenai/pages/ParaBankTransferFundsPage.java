package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ParaBankTransferFundsPage {
	
	public WebDriver driver;

	public ParaBankTransferFundsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@id='amount']") 
	@CacheLookup
	WebElement amount;
	
	@FindBy(xpath = "//select[@id='fromAccountId']") 
	@CacheLookup
	WebElement fromAccount;
	
	@FindBy(xpath = "//select[@id='toAccountId']") 
	@CacheLookup
	WebElement toAccount;
	
	@FindBy(xpath = "//input[@value='Transfer']") 
	@CacheLookup
	WebElement transfer;
	
	
	@FindBy(xpath = "//span[@id='amount']") 
	@CacheLookup
	WebElement successfulMsg;
	
	public void setAmount(String amt) {
		amount.sendKeys(amt);		
	}
	
	public void selectFromAccount(String accNum) throws InterruptedException {
		Select fromAccDropDown = new Select(fromAccount);
		fromAccDropDown.selectByVisibleText(accNum);
		Thread.sleep(2000);
	}
	
	public void selectToAccount(String accNum) throws InterruptedException {
		Select toAccDropDown = new Select(toAccount);
		toAccDropDown.selectByVisibleText(accNum);
		Thread.sleep(2000);
	}
	
	public void clickTransferBtn() {
		transfer.click();
	}

	public void validateSuccessfulMessage(String msg) {		

		String actSuccessfulMsgText = successfulMsg.getText(); 
		String expSuccessfulMsgText = msg;
		if(actSuccessfulMsgText.contains(expSuccessfulMsgText)) {
			System.out.println(actSuccessfulMsgText + " has been transfered successfully."); 
		} 
		else 
		{
			System.out.println("Actual and Expected Successful Message are not same"); 
			System.out.println("Actual Successful Message is "+actSuccessfulMsgText);
			System.out.println("Expected Successful Message is " +expSuccessfulMsgText); 
		}		
	}
	
}
