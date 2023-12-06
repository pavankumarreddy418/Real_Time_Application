package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ParaBankHomePage {

	public WebDriver driver;

	public ParaBankHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath = "//a[normalize-space()='home']") 
	@CacheLookup
	WebElement homeIconLink;
	
	@FindBy(xpath = "//a[normalize-space()='about']") 
	@CacheLookup
	WebElement aboutUsIconLink;
		
	@FindBy(xpath = "//a[normalize-space()='contact']") 
	@CacheLookup
	WebElement customerCareIconLink;
	
	@FindBy(xpath = "//ul[@class='leftmenu']//li//a[@href='about.htm'][normalize-space()='About Us']") 
	@CacheLookup
	WebElement aboutUsLink;	
	
	@FindBy(xpath = "//ul[@class='leftmenu']//li//a[@href='services.htm'][normalize-space()='Services']") 
	@CacheLookup
	WebElement servicesLink;
		
	@FindBy(xpath = "//a[normalize-space()='Admin Page']") 
	@CacheLookup
	WebElement adminPageLink;
	
	@FindBy(xpath = "//a[@href='news.htm']") 
	@CacheLookup
	WebElement readMoreLink;
	
	@FindBy(xpath = "//a[normalize-space()='Forgot login info?']") 
	@CacheLookup
	WebElement forgotLoginLink;
	
	@FindBy(xpath = "//a[normalize-space()='Register']") 
	@CacheLookup
	WebElement registerLink;
	
	@FindBy(xpath = "//input[@name='username']") 
	@CacheLookup
	WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']") 
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//input[@value='Log In']") 
	@CacheLookup
	WebElement loginBtn;
	
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public void closeBrowser() {		
		driver.close();
	}

	public void clickHomeIconLink() {
		homeIconLink.click();
	}
	
	public void clickAboutUsIconLink() {
		aboutUsIconLink.click();
	}
	
	public void clickCustomerCareIconLink() {
		customerCareIconLink.click();
	}
	
	public void clickAboutUsLink() {
		aboutUsLink.click();
	}
	
	public void clickServicesLink() {
		servicesLink.click();
	}
	
	public void clickAdminPageLink() {
		adminPageLink.click();
	}
	
	public void clickLatestNewsLink() {
		clickHomeIconLink();
		readMoreLink.click();
	}
	
	public void clickForgotLoginLink() {
		forgotLoginLink.click();
	}
	
	public void clickRegisterLink() {
		registerLink.click();
	}
		
	public void setUserName(String uname) {
		userName.sendKeys(uname);
	}
	
	public void setPassword(String uname) {
		password.sendKeys(uname);
	}
	
	public void clickLogInBtn() {
		loginBtn.click();
	}
	
}
