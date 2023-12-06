package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.nxtgeni.objectrepository.ObjectRepository;

public class NxtGenWebTablePage {

	public WebDriver driver;
	
	public NxtGenWebTablePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath = ObjectRepository.employeeFirstNameXpath)
	@CacheLookup
	WebElement firstName;	
		
	@FindBy(xpath = ObjectRepository.employeeLastNameXpath)
	@CacheLookup
	WebElement lastName;			

	
	public void displayEmployeeFirstName() {		
		String firstNameValue = firstName.getText();
		System.out.println("Employee First Name is "+ firstNameValue);		
	}
	
	public void displayEmployeeLastName() {		
		String lastNameValue = lastName.getText();
		System.out.println("Employee Last Name is "+ lastNameValue);		
	}
	
	
}
