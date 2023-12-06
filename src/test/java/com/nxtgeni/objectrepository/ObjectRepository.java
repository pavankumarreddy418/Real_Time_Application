package com.nxtgeni.objectrepository;

/*
 * All the locators values are mentioned here
 * 
 * Naming Rule:
 * For link and partial link text locator => add Link as suffix 
 * For id locator  => add Id as suffix 
 * For name locator  => add Name as suffix 
 * For xpath locator  => add Xpath as suffix 
 * For css selector locator  => add CSS as suffix 
 * 
 */

public class ObjectRepository {	

	// Object Repository of NxtGenAI Module

	// Home Page OR
	public static final String homeLink= "HOME";
	public static final String qaAutomationLink= "QA AUTOMATION";
	public static final String certificateLink= "Completion Certificate";
	public static final String onlineTrainingLink= "Online Training";
	public static final String practiceAutomationLink= "Practice Automation";
	public static final String registrationFormLink= "Registration Form";
	public static final String alertPopUpLink= "Popup";
	public static final String multipleWindowsLink= "Multiple Windows";
	public static final String webTableLink= "WebTable";
	public static final String aboutMeLink= "ABOUT ME";
	public static final String techTalkLink= "TechTalk";
	public static final String testimonialsLink= "Testimonials";
	public static final String pythonForDataScienceLink= "DATA SCIENCE";
	public static final String pythonLibrariesLink= "PYTHON LIBRARIES";
	public static final String numpyLink= "NumPy";
	public static final String pandasLink= "Pandas";
	public static final String automationTrainingLink = "Automation Training";
	


	// Register Demo Page OR
	public static final String firstNameId = "vfb-5";
	public static final String lastNameId = "vfb-7";
	public static final String genderMaleId = "vfb-8-1";
	public static final String genderFemaleId = "vfb-8-2";
	public static final String streetAddressId = "vfb-13-address";
	public static final String apartmentNumberId = "vfb-13-address-2";
	public static final String stateId = "vfb-13-state";
	public static final String cityId = "vfb-13-city";
	public static final String zipcodeId = "vfb-13-zip";
	public static final String countryId = "vfb-13-country";
	public static final String emailIDId = "vfb-14";
	public static final String dateOfDemoId = "vfb-18";
	public static final String hourId = "vfb-16-hour";
	public static final String minuteId = "vfb-16-min";
	public static final String ampmId = "vfb-16-ampm";
	public static final String mobileNumberId = "vfb-19";
	public static final String seleniumWebDriverId = "vfb-20-0";
	public static final String uftId = "vfb-20-1";
	public static final String testNGId = "vfb-20-2";
	public static final String coreJavaId = "vfb-20-3";
	public static final String functionalTestingId = "vfb-20-4";
	public static final String othersId = "vfb-20-5";
	public static final String enterYourQueryId = "vfb-23";
	public static final String verificationTextXpath = "//*[contains(text(),'Example:')]";
	public static final String verificationNumberId = "vfb-3";
	public static final String submitId = "vfb-4";


	// Successful Message Page OR
	public static final String successfulMessageXpath = "//div[contains(text(),'Registration Form is Successfully Submitted.')]";

	// Alert Popup Page OR
	public static final String alertBoxName = "alertbox";
	public static final String confirmAlertBoxName = "confirmalertbox";
	public static final String promptAlertBoxXpath = "//button[contains(@name,'promptalertbox')]";
	
	// Multiple Windows Page OR	
	public static final String browserWindowXpath = "//button[contains(@name,'newbrowserwindow')]";
	public static final String messageWindowXpath = "//button[contains(@name,'newmessagewindow')]";
	public static final String browserTabXpath = "//button[contains(@name,'newbrowsertab')]";
	
	
	// Employee WebTable Page OR
	public static final String employeeFirstNameXpath = "//*/table/tbody/tr[1]/td[2]";
	public static final String employeeLastNameXpath = "//*/table/tbody/tr[2]/td[2]";
	
	
}
