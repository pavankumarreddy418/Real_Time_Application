package com.parabank.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.ParaBankHomePage;
import com.nxtgenai.pages.ParaBankTransferFundsPage;
import com.nxtgenai.pages.ParaBankUserWelcomePage;

public class ParaBankTransferFunds extends TestBase {
	
	@BeforeClass
	public void loginCustomer() {
		ParaBankHomePage login = PageFactory.initElements(driver, ParaBankHomePage.class);
		login.setUserName(config.getProperty("username"));
		login.setPassword(config.getProperty("password"));
		login.clickLogInBtn();
	}

	//@AfterClass
	public void logOff() {
		ParaBankUserWelcomePage user = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		user.clickLogOutLink();
	}

	@Test(priority=1)
	public void fundTransferCheckingToSavingAccount(ITestContext context) throws InterruptedException {
		
		String checkingAccount = (String) context.getAttribute("Checking_Account");
		String savingAccount = (String) context.getAttribute("Saving_Account");
		
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickTransferFundsLink();
		
		Thread.sleep(3000);
		
		ParaBankTransferFundsPage transfer = PageFactory.initElements(driver, ParaBankTransferFundsPage.class);
		transfer.setAmount("5");

		transfer.selectFromAccount(checkingAccount);
		Thread.sleep(3000);
		transfer.selectToAccount(savingAccount);
		Thread.sleep(3000);
		transfer.clickTransferBtn();
		
		transfer.validateSuccessfulMessage("$5");		
	}
	
	@Test(priority=2)
	public void fundTransferSavingToCheckingAccount(ITestContext context) throws InterruptedException {
		
		String checkingAccount = (String) context.getAttribute("Checking_Account");
		String savingAccount = (String) context.getAttribute("Saving_Account");
		
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickTransferFundsLink();
		
		Thread.sleep(3000);
		
		ParaBankTransferFundsPage transfer = PageFactory.initElements(driver, ParaBankTransferFundsPage.class);
		transfer.setAmount("5");

		transfer.selectFromAccount(savingAccount);
		Thread.sleep(3000);
		transfer.selectToAccount(checkingAccount);
		Thread.sleep(3000);
		transfer.clickTransferBtn();
		
		transfer.validateSuccessfulMessage("$5");	
		
	}
	
	@Test(priority=3)
	public void fundTransferCheckingToExistingAccount(ITestContext context) throws InterruptedException {
		
		String checkingAccount = (String) context.getAttribute("Checking_Account");
		String existingAccount = (String) context.getAttribute("Existing_Account");
		
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickTransferFundsLink();
		
		Thread.sleep(3000);
		
		ParaBankTransferFundsPage transfer = PageFactory.initElements(driver, ParaBankTransferFundsPage.class);
		transfer.setAmount("5");

		transfer.selectFromAccount(checkingAccount);
		Thread.sleep(3000);
		transfer.selectToAccount(existingAccount);
		Thread.sleep(3000);
		transfer.clickTransferBtn();
		
		transfer.validateSuccessfulMessage("$5");	
		
	}
	
	@Test(priority=4)
	public void fundTransferExistingtoCheckingAccount(ITestContext context) throws InterruptedException {
		
		String checkingAccount = (String) context.getAttribute("Checking_Account");
		String existingAccount = (String) context.getAttribute("Existing_Account");
		
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickTransferFundsLink();
		
		Thread.sleep(3000);
		
		ParaBankTransferFundsPage transfer = PageFactory.initElements(driver, ParaBankTransferFundsPage.class);
		transfer.setAmount("5");

		transfer.selectFromAccount(existingAccount);
		Thread.sleep(3000);
		transfer.selectToAccount(checkingAccount);
		Thread.sleep(3000);
		transfer.clickTransferBtn();
		
		transfer.validateSuccessfulMessage("$5");	
		
	} 


}
