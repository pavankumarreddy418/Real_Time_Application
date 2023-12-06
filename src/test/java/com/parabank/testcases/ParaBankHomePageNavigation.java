package com.parabank.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.ParaBankHomePage;

public class ParaBankHomePageNavigation extends TestBase{
	
	
	@Test(priority=1)
	public void validatingHomeIconNavigation() {
		ParaBankHomePage homePage = PageFactory.initElements(driver, ParaBankHomePage.class);
		homePage.clickHomeIconLink();
	}
  
	@Test(priority=2)
	public void validatingAboutUsIconNavigation() {
		ParaBankHomePage homePage = PageFactory.initElements(driver, ParaBankHomePage.class);
		homePage.clickAboutUsIconLink();
	}  
	
	@Test(priority=3)
	public void validatingCustomerCareIconNavigation() {
		ParaBankHomePage homePage = PageFactory.initElements(driver, ParaBankHomePage.class);
		homePage.clickCustomerCareIconLink();
	}
  
	@Test(priority=4)
	public void validatingAboutUsLinkNavigation() {
		ParaBankHomePage homePage = PageFactory.initElements(driver, ParaBankHomePage.class);
		homePage.clickAboutUsLink();
	}
	
	@Test(priority=5)
	public void validatingServicesLinkNavigation() {
		ParaBankHomePage homePage = PageFactory.initElements(driver, ParaBankHomePage.class);
		homePage.clickServicesLink();
	}
  
	@Test(priority=6)
	public void validatingAdminPageLinkNavigation() {
		ParaBankHomePage homePage = PageFactory.initElements(driver, ParaBankHomePage.class);
		homePage.clickAdminPageLink();
	}
	
	@Test(priority=7)
	public void validatingForgotLoginLinkNavigation() {
		ParaBankHomePage homePage = PageFactory.initElements(driver, ParaBankHomePage.class);
		homePage.clickForgotLoginLink();
	}
	
	@Test(priority=8)
	public void validatingRegisterLinkNavigation() {
		ParaBankHomePage homePage = PageFactory.initElements(driver, ParaBankHomePage.class);
		homePage.clickRegisterLink();
	}
	
	@Test(priority=9)
	public void validatingLatestNewsNavigation() {
		ParaBankHomePage homePage = PageFactory.initElements(driver, ParaBankHomePage.class);
		homePage.clickLatestNewsLink();
	}
		
}
