package com.nxtgenai.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


import com.nxtgeni.objectrepository.ObjectRepository;

public class NxtGenRegisterDemoPage {

	WebDriver driver;	

	public NxtGenRegisterDemoPage(WebDriver driver) {
		this.driver = driver;
	}	
	
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(id=ObjectRepository.firstNameId) 
	@CacheLookup
	WebElement firstName;

	@FindBy(id=ObjectRepository.lastNameId)
	@CacheLookup
	WebElement lastName;

	@FindBy(id=ObjectRepository.genderMaleId)
	@CacheLookup
	WebElement genderMale;	

	@FindBy(id=ObjectRepository.genderFemaleId)
	@CacheLookup
	WebElement genderFemale;	

	@FindBy(id=ObjectRepository.streetAddressId)
	@CacheLookup
	WebElement streetAddress;	

	@FindBy(id=ObjectRepository.apartmentNumberId)
	@CacheLookup
	WebElement apartmentNumber;	

	@FindBy(id=ObjectRepository.stateId)
	@CacheLookup
	WebElement state;	

	@FindBy(id=ObjectRepository.cityId)
	@CacheLookup
	WebElement city;	

	@FindBy(id=ObjectRepository.zipcodeId)
	@CacheLookup
	WebElement zipcode;		

	@FindBy(id=ObjectRepository.countryId)
	@CacheLookup
	WebElement country;		

	@FindBy(id=ObjectRepository.emailIDId)
	@CacheLookup
	WebElement emailID;	

	@FindBy(id=ObjectRepository.dateOfDemoId)
	@CacheLookup
	WebElement dateOfDemo;	

	@FindBy(id=ObjectRepository.hourId)
	@CacheLookup
	WebElement hour;	

	@FindBy(id=ObjectRepository.minuteId)
	@CacheLookup
	WebElement minute;	

	@FindBy(id=ObjectRepository.ampmId)
	@CacheLookup
	WebElement ampm;	

	@FindBy(id=ObjectRepository.mobileNumberId)
	@CacheLookup
	WebElement mobileNumber;	

	@FindBy(id=ObjectRepository.seleniumWebDriverId)
	@CacheLookup
	WebElement seleniumWebDriver;	

	@FindBy(id=ObjectRepository.uftId)
	@CacheLookup
	WebElement uft;	

	@FindBy(id=ObjectRepository.testNGId)
	@CacheLookup
	WebElement testNG;	

	@FindBy(id=ObjectRepository.coreJavaId)
	@CacheLookup
	WebElement coreJava;	

	@FindBy(id=ObjectRepository.functionalTestingId)
	@CacheLookup
	WebElement functionalTesting;	

	@FindBy(id=ObjectRepository.othersId)
	@CacheLookup
	WebElement others;	

	@FindBy(id=ObjectRepository.enterYourQueryId)
	@CacheLookup
	WebElement enterYourQuery;	
	
	@FindBy(xpath =ObjectRepository.verificationTextXpath)
	@CacheLookup
	WebElement verificationText;	

	@FindBy(id=ObjectRepository.verificationNumberId)
	@CacheLookup
	WebElement verificationNumber;	

	@FindBy(id=ObjectRepository.submitId)
	@CacheLookup
	WebElement submit;	
	
	

	public void setFirstName(String fname) {
		firstName.sendKeys(fname);
		System.out.println("First Name is " + fname);
	}

	public void setLastName(String lname) {
		lastName.sendKeys(lname);
		System.out.println("Last Name is " + lname);
	}

	public void selectGenderRadioBtn(String gender) {
		if (gender.equalsIgnoreCase("Male")) {
			genderMale.click();
			System.out.println("Male Radio Button is Selected");
		}
		else if (gender.equalsIgnoreCase("Female")) {
			genderFemale.click();
			System.out.println("Female Radio Button is Selected");
		}
	}

	public void setStreetAddress(String strAdd) {
		streetAddress.sendKeys(strAdd);
		System.out.println("Street Address is " + strAdd);
	}

	public void setApartNum(String aptNum) {
		apartmentNumber.sendKeys(aptNum);
		System.out.println("Apartment Number is " + aptNum);	
	}

	public void setCity(String cityVal) {
		city.sendKeys(cityVal);
		System.out.println("City Name is " + cityVal);
	}

	public void setState(String stateVal) {
		state.sendKeys(stateVal);
		System.out.println("State is " + stateVal);
	}

	public void setZipCode(String zipcodeVal) {
		zipcode.sendKeys(zipcodeVal);
		System.out.println("Postal Code is " + zipcodeVal);
	}

	public void selectCountryDropDown(String countryVal) {
		Select countryDrpDn = new Select(country);
		countryDrpDn.selectByVisibleText(countryVal);
		System.out.println(countryVal + " is selected in Country drop down");
	}

	public void setEmailID(String eid) {
		emailID.sendKeys(eid);
		System.out.println("Email Id is " + eid);
	}

	public void setDateOfDemo(String dod) {
		dateOfDemo.sendKeys(dod);
		System.out.println("Date of Demo is " + dod);
	}

	public void selectHHDropDown(String hh) {
		Select hourDropDown = new Select (hour);
		hourDropDown.selectByVisibleText(hh);
		System.out.println(hh + " is selected in HH Dropdown");
	}

	public void selectMMDropDown(String mm) {
		Select minuteDropDown = new Select (minute);
		minuteDropDown.selectByVisibleText(mm);
		System.out.println(mm + " is selected in MM Dropdown");
	}

/*	public void selectAMPMDropDown(String ampmVal) {
		Select ampmDropDown = new Select (ampm);
		ampmDropDown.selectByVisibleText(ampmVal);
		System.out.println(ampmVal + " is selected in AM/PM Dropdown");
	} */

	public void setMobileNum(String mobileNum) {
		mobileNumber.sendKeys(mobileNum);
		System.out.println("Mobile Number is " + mobileNum);
	}

	public void selectSeleniumWebDriverChkBox(String status) {		
		if(seleniumWebDriver.isSelected() && status.equalsIgnoreCase("OFF")) {
			// Code to uncheck the check box
			seleniumWebDriver.click();
			System.out.println("Selenium WebDriver Check Box is unchecked");
		}
		else if(status.equalsIgnoreCase("ON")) {
			// Code to check the check box
			seleniumWebDriver.click();
			System.out.println("Selenium WebDriver Check Box is checked");
		}
	}

	public void selectUFTChkBox(String status) {
		if(uft.isSelected() && status.equalsIgnoreCase("OFF")) {
			// Code to uncheck the check box
			uft.click();
			System.out.println("UFT Check Box is unchecked");
		}
		else if(status.equalsIgnoreCase("ON")) {
			// Code to check the check box
			uft.click();
			System.out.println("UFT Check Box is checked");
		}
	}

	public void selectTestNGChkBox(String status) {
		if(testNG.isSelected() && status.equalsIgnoreCase("OFF")) {
			// Code to uncheck the check box
			testNG.click();
			System.out.println("TestNG Check Box is unchecked");
		}
		else if(status.equalsIgnoreCase("ON")) {
			// Code to check the check box
			testNG.click();
			System.out.println("TestNG Check Box is checked");
		}
	}

	public void selectCoreJavaChkBox(String status) {
		if(coreJava.isSelected() && status.equalsIgnoreCase("OFF")) {
			// Code to uncheck the check box
			coreJava.click();
			System.out.println("Core Java Check Box is unchecked");
		}
		else if(status.equalsIgnoreCase("ON")) {
			// Code to check the check box
			coreJava.click();
			System.out.println("Core Java Check Box is checked");
		}
	}

	public void selectFunctionalTestingChkBox(String status) {
		if(functionalTesting.isSelected() && status.equalsIgnoreCase("OFF")) {
			// Code to uncheck the check box
			functionalTesting.click();
			System.out.println("Functional Testing Check Box is unchecked");
		}
		else if(status.equalsIgnoreCase("ON")) {
			// Code to check the check box
			functionalTesting.click();
			System.out.println("Functional Testing Check Box is checked");
		}
	}

	public void selectOthersChkBox(String status) {
		if(others.isSelected() && status.equalsIgnoreCase("OFF")) {
			// Code to uncheck the check box
			others.click();
			System.out.println("Others Check Box is unchecked");
		}
		else if(status.equalsIgnoreCase("ON")) {
			// Code to check the check box
			others.click();
			System.out.println("Others Check Box is checked");
		}
	}

	public void setEnterYourQuery(String query) {
		enterYourQuery.sendKeys(query);
		System.out.println("The Query Enter is " + query);
	}

	public void setVerificationNum() {	
		// Example 84
		String verificationVal = verificationText.getText();
		String num[]=verificationVal.split(":");    //Example: 84
		verificationNumber.sendKeys(num[1].trim());
		System.out.println("Enter Any Two Digits is: " + num[1].trim());
	}

	public void clickSubmitBtn() {
		submit.click();
		System.out.println("Submit Button is Clicked");
	}

}
