package com.parabank.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.ParaBankHomePage;
import com.nxtgenai.pages.ParaBankUserWelcomePage;

public class ParaBankCustomerPageNavigation extends TestBase{
	
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
	public void validatingOpenNewAccountNavigation() {				
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickOpenNewAccountLink();		
	}
	
	@Test(priority=2)
	public void validatingAccountsOverviewNavigation() {				
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickAccountsOverviewLink();
	}
	
	@Test(priority=3)
	public void validatingTransferFundsNavigation() {				
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickTransferFundsLink();
	}
		
	@Test(priority=4)
	public void validatingBillPayNavigation() {				
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickBillPayLink();
	}
	
	@Test(priority=5)
	public void validatingFindTransactionsNavigation() {				
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickFindTransactionsLink();
	}
	
	@Test(priority=6)
	public void validatingUpdateContactInfoNavigation() {				
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickUpdateContactInfoLink();
	}
	
	@Test(priority=7)
	public void validatingRequestLoanNavigation() {				
		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.clickRequestLoanLink();
	}
	
}
