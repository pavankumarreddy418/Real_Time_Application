package com.nxtgenai.testcases;

import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.NxtGenHomePage;
import com.nxtgenai.pages.NxtGenRegisterDemoPage;
import com.nxtgenai.pages.NxtGenSuccessfulMessagePage;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;


public class RegisterDemo extends TestBase{

	@Test(dataProviderClass = com.nxtgenai.utilities.TestUtil.class,dataProvider = "dp")
	public void registerUser(Hashtable<String,String> data) throws InterruptedException{
		
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToRegisterForm();
		
		NxtGenRegisterDemoPage registerUser = PageFactory.initElements(driver, NxtGenRegisterDemoPage.class);
		registerUser.setFirstName(data.get("FirstName"));
		registerUser.setLastName(data.get("LastName"));
		registerUser.selectGenderRadioBtn(data.get("Gender"));
		registerUser.setStreetAddress(data.get("StreetAddress"));
		registerUser.setApartNum(data.get("ApartmentNumber"));
		registerUser.setCity(data.get("City"));
		registerUser.setState(data.get("State"));
		registerUser.setZipCode(data.get("PinCode"));
		registerUser.selectCountryDropDown(data.get("Country"));
		registerUser.setEmailID(data.get("EmailID"));
		registerUser.setDateOfDemo(data.get("DemoDate"));
		registerUser.selectHHDropDown(data.get("HH"));
		registerUser.selectMMDropDown(data.get("MM"));
		// registerUser.selectAMPMDropDown(data.get("AMPM"));
		registerUser.setMobileNum(data.get("MobileNumber"));
		
		registerUser.selectSeleniumWebDriverChkBox(data.get("SeleniumWebDriver"));
		registerUser.selectUFTChkBox(data.get("UFT"));		
		registerUser.selectTestNGChkBox(data.get("TestNG"));
		registerUser.selectCoreJavaChkBox(data.get("CoreJava"));
		registerUser.selectFunctionalTestingChkBox(data.get("FunctionalTesting"));
		registerUser.selectOthersChkBox(data.get("Others"));
		
		registerUser.setEnterYourQuery(data.get("Query"));
		registerUser.setVerificationNum();
		registerUser.clickSubmitBtn();		
		
		NxtGenSuccessfulMessagePage successfulMsg = PageFactory.initElements(driver, NxtGenSuccessfulMessagePage.class);
		successfulMsg.validateSuccessfulMessage(data.get("Expected Successful Message"));
	}

}

