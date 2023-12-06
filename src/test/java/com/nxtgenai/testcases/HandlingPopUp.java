package com.nxtgenai.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.NxtGenAlertPopupPage;
import com.nxtgenai.pages.NxtGenHomePage;

public class HandlingPopUp extends TestBase{
	
	public NxtGenAlertPopupPage alertPage ;

	@BeforeClass
	public void navigateToAlertPopUp() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToAlertPopUp();
	}
	
	@Test(priority=1)
	public void validateAlertPopUp(){		
		alertPage = PageFactory.initElements(driver, NxtGenAlertPopupPage.class);
		alertPage.clickAlertBoxButton();		
		alertPage.captureAlertMessage();
		alertPage.clickOkAlertButton();
	}
	
	@Test(priority=2)
	public void validateConfirmAlertPopUp() {
		alertPage.clickConfirmAlertBoxButton();
		alertPage.captureAlertMessage();
		alertPage.clickOkAlertButton();
		
		alertPage.clickConfirmAlertBoxButton();
		alertPage.clickCancelAlertButton();
	}
	
	@Test(priority=3)
	public void validatePromptAlertPopUp() {
		alertPage.clickPromptAlertBoxButton();
		alertPage.captureAlertMessage();
		alertPage.setAlertMessage("Yes");
		alertPage.clickOkAlertButton();
		
		alertPage.clickPromptAlertBoxButton();
		alertPage.setAlertMessage("No");
		alertPage.clickOkAlertButton();
		
		alertPage.clickPromptAlertBoxButton();
		alertPage.clickCancelAlertButton();	
		
	}
	
	
}
