package com.parabank.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.ParaBankHomePage;
import com.nxtgenai.pages.ParaBankUserWelcomePage;

public class ParaBankCustomerLogin extends TestBase{

	@Test
	public void loginCustomer() {		
		ParaBankHomePage login = PageFactory.initElements(driver, ParaBankHomePage.class);
		login.setUserName(config.getProperty("username"));
		login.setPassword(config.getProperty("password"));
		login.clickLogInBtn();

		ParaBankUserWelcomePage user = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		user.validateWelcomeMsg("Welcome");
		user.clickLogOutLink();

	}	
}
