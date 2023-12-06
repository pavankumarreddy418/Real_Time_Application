package com.nxtgenai.testcases;

import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.NxtGenHomePage;
import org.openqa.selenium.support.PageFactory;

public class ScreenNavigation extends TestBase{

	@Test(priority=1,enabled=false)
	public void validatingPythonForDataScienceNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.clickPythonForDataScienceLink();		
	}
	
	@Test(priority=2,enabled=false)
	public void validatingCourseCompletionCertificateNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToCourseCompletionCertificate();
	}

	@Test(priority=3,enabled=false)
	public void validatingSeleniumOnlineTrainingNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToSeleniumOnlineTraining();
	}
	
	@Test(priority = 3)
	public void validatingAutomationTrainingNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToAutomationTraining();
	}
	
	
	@Test(priority=4)
	public void validatingRegistrationFormNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToRegisterForm();
	}
	
	@Test(priority=5)
	public void validatingAlertPopUpNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToAlertPopUp();
	}
	
	@Test(priority=6)
	public void validatingMultipleWindowsNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToMultipleWindows();
	}
	
	@Test(priority=7)
	public void validatingWebTableNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToWebTable();
	}
	
	@Test(priority=8)
	public void validatingTechTalkNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToTechTalk();
	}
	
	@Test(priority=9)
	public void validatingTestimonialsNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToTestimonials();
	}
	
	@Test(priority=10)
	public void validatingNumPyNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToNumPy();
	}
	
	@Test(priority=11)
	public void validatingPandasNavigation() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToPandas();
	}

}

