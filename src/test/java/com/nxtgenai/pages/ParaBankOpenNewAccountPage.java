package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.nxtgenai.utilities.ExcelReader;

public class ParaBankOpenNewAccountPage {

	public WebDriver driver;
	public static ExcelReader excel = new ExcelReader(".\\TestData\\RegisterDemoTestData.xlsx");
	
	public ParaBankOpenNewAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//select[@id='type']") 
	@CacheLookup
	WebElement accountType;

	@FindBy(xpath = "//select[@id='fromAccountId']") 
	@CacheLookup
	WebElement accountNumber;

	@FindBy(xpath = "//input[@value='Open New Account']") 
	@CacheLookup
	WebElement openNewAccount;

	@FindBy(xpath = "//p[normalize-space()='Congratulations, your account is now open.']") 
	@CacheLookup
	WebElement successfulMsg;

	public void selectAccountType(String accType) {
		Select accTypeDropDown = new Select(accountType);
		accTypeDropDown.selectByVisibleText(accType);
	}

	public void selectAccountNumber(String accNum) {
		Select accNumDropDown = new Select(accountNumber);
		accNumDropDown.selectByVisibleText(accNum);
	}

	public void clickOpenNewAccountBtn() {
		openNewAccount.click();
	}

	public void validateSuccessfulMessage(String msg) {		

		String actSuccessfulMsgText = successfulMsg.getText(); 
		String expSuccessfulMsgText = msg;
		if(actSuccessfulMsgText.contains(expSuccessfulMsgText)) {
			System.out.println("The Successful Message is: " + actSuccessfulMsgText); 
		} 
		else 
		{
			System.out.println("Actual and Expected Successful Message are not same"); 
			System.out.println("Actual Successful Message is "+actSuccessfulMsgText);
			System.out.println("Expected Successful Message is " +expSuccessfulMsgText); 
		}		
	}

}
