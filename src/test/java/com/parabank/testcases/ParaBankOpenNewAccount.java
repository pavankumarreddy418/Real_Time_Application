package com.parabank.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.ParaBankHomePage;
import com.nxtgenai.pages.ParaBankOpenNewAccountPage;
import com.nxtgenai.pages.ParaBankUserWelcomePage;

public class ParaBankOpenNewAccount extends TestBase{

	public String existingAccount;
	public String checkingAccount;
	public String savingAccount;

	@BeforeClass
	public void loginCustomer() {
		ParaBankHomePage login = PageFactory.initElements(driver, ParaBankHomePage.class);
		login.setUserName(config.getProperty("username"));
		login.setPassword(config.getProperty("password"));
		login.clickLogInBtn();
	}

	@AfterClass
	public void logOff() {
		ParaBankUserWelcomePage user = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		user.clickLogOutLink();
	}

	@Test(priority=1)
	public void getExistingCustomerNumber() {	
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickAccountsOverviewLink();

		WebElement presentAccNum = driver.findElement(By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a"));
		existingAccount = presentAccNum.getText();		
		System.out.println("Present Account Number is "+ existingAccount);

	} 

	@Test(priority=2)
	public void openNewCheckingAccount() {		
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickOpenNewAccountLink();			

		ParaBankOpenNewAccountPage account = PageFactory.initElements(driver, ParaBankOpenNewAccountPage.class);
		account.selectAccountType("CHECKING");
		account.selectAccountNumber(existingAccount); 
		account.clickOpenNewAccountBtn();

		account.validateSuccessfulMessage("Congratulations, your account is now open");
		/*
		 * Have to add the code to export the value to the excel sheet
		 */

		WebElement checkAccNum = driver.findElement(By.xpath("//*[@id=\"newAccountId\"]"));
		checkingAccount = checkAccNum.getText();		
		System.out.println("New Checking Account Number is "+ checkingAccount);
	}

	@Test(priority=3)
	public void openNewSavingAccount() {		
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickOpenNewAccountLink();			

		ParaBankOpenNewAccountPage account = PageFactory.initElements(driver, ParaBankOpenNewAccountPage.class);
		account.selectAccountType("SAVINGS");
		account.selectAccountNumber(existingAccount); 
		account.clickOpenNewAccountBtn();

		account.validateSuccessfulMessage("Congratulations, your account is now open");
		/*
		 * Have to add the code to export the value to the excel sheet
		 */

		WebElement savingAccNum = driver.findElement(By.xpath("//*[@id=\"newAccountId\"]"));
		savingAccount = savingAccNum.getText();		
		System.out.println("New Saving Account Number is "+ savingAccount);
	}

	@Test(priority=4)
	public void saveAccountNumbers(ITestContext context){
		context.setAttribute("Existing_Account", existingAccount);
		context.setAttribute("Checking_Account", checkingAccount);
		context.setAttribute("Saving_Account", savingAccount);
	} 
}
