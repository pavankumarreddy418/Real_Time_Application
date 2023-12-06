package com.nxtgenai.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.nxtgeni.objectrepository.ObjectRepository;



public class NxtGenHomePage {

	public WebDriver driver;
	public Actions mouseHover;	

	public NxtGenHomePage(WebDriver driver) {
		this.driver = driver;
	}

	
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(linkText=ObjectRepository.homeLink) 
	@CacheLookup
	WebElement home;

	@FindBy(linkText=ObjectRepository.qaAutomationLink) 
	@CacheLookup
	WebElement qaAutomation;

	@FindBy(partialLinkText = ObjectRepository.certificateLink) 
	@CacheLookup
	WebElement certificate;

	@FindBy(partialLinkText = ObjectRepository.onlineTrainingLink) 
	@CacheLookup
	WebElement onlineTraining;

	@FindBy(linkText = ObjectRepository.practiceAutomationLink) 
	@CacheLookup
	WebElement practiceAutomation;

	@FindBy(partialLinkText = ObjectRepository.registrationFormLink) 
	@CacheLookup
	WebElement registrationForm;

	@FindBy(partialLinkText = ObjectRepository.alertPopUpLink) 
	@CacheLookup
	WebElement alertPopUp;

	@FindBy(partialLinkText = ObjectRepository.multipleWindowsLink) 
	@CacheLookup
	WebElement multipleWindows;

	@FindBy(partialLinkText = ObjectRepository.webTableLink) 
	@CacheLookup
	WebElement webTable;

	@FindBy(linkText = ObjectRepository.aboutMeLink) 
	@CacheLookup
	WebElement aboutMe;

	@FindBy(linkText = ObjectRepository.techTalkLink) 
	@CacheLookup
	WebElement techTalk;

	@FindBy(linkText = ObjectRepository.testimonialsLink) 
	@CacheLookup
	WebElement testimonials;

	@FindBy(partialLinkText = ObjectRepository.pythonForDataScienceLink) 
	@CacheLookup
	WebElement pythonForDataScience;

	@FindBy(linkText = ObjectRepository.pythonLibrariesLink) 
	@CacheLookup
	WebElement pythonLibraries;

	@FindBy(linkText = ObjectRepository.numpyLink) 
	@CacheLookup
	WebElement numpy;

	@FindBy(linkText = ObjectRepository.pandasLink) 
	@CacheLookup
	WebElement pandas;
	
	@FindBy(partialLinkText = ObjectRepository.automationTrainingLink)
	@CacheLookup
	WebElement automationTraining;

		
	public void maximizeBrowser() {
		driver.manage().window().maximize();
		System.out.println("Browser is Maximized");	
	}

	public void closeBrowser() {		
		driver.close();
		System.out.println("Browser is Closed");	
	}

	public void clickHomeLink() {
		home.click();
		System.out.println("Home Link is clicked");	
	}

	public void clickPythonForDataScienceLink() {
		pythonForDataScience.click();
		// page load wait statement - selenium 3 
		// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		// selenium 4 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		System.out.println("Python for data science link is clicked");	
	}

	public void navigateToCourseCompletionCertificate() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(qaAutomation).perform();	
		certificate.click();
		System.out.println("Page Navigated to Course Completion Certificate");	
	}


	public void navigateToSeleniumOnlineTraining() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(qaAutomation).perform();	
		onlineTraining.click();		
		System.out.println("Page Navigated to Selenium Online Training");	

	}

	public void navigateToRegisterForm() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(qaAutomation).perform();		
		mouseHover.moveToElement(practiceAutomation).perform();	
		registrationForm.click();	
		System.out.println("Page Navigated to Register Form");	
		
	}

	public void navigateToAlertPopUp() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(qaAutomation).perform();		
		mouseHover.moveToElement(practiceAutomation).perform();	
		alertPopUp.click();		
		System.out.println("Page Navigated to Alert PopUp");	
	}

	public void navigateToMultipleWindows() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(qaAutomation).perform();		
		mouseHover.moveToElement(practiceAutomation).perform();	
		multipleWindows.click();	
		System.out.println("Page Navigated to Multiple Windows");	
	}

	public void navigateToWebTable() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(qaAutomation).perform();		
		mouseHover.moveToElement(practiceAutomation).perform();	
		webTable.click();		
		System.out.println("Page Navigated to Web Table");	
	}

	public void navigateToTechTalk() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(aboutMe).perform();		
		techTalk.click();		
		System.out.println("Page Navigated to Tech Talk");	
	}

	public void navigateToTestimonials() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(aboutMe).perform();		
		testimonials.click();	
		System.out.println("Page Navigated to Testimonials");	
	}

	public void navigateToPythonForDataScience() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		pythonForDataScience.click();	
		System.out.println("Page Navigated to Python For DataScience");	
	}	

	public void navigateToNumPy() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(pythonLibraries).perform();		
		numpy.click();		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		System.out.println("Page Navigated to NumPy");	
	}

	public void navigateToPandas() {		
		// Create an instance in Actions class by Passing WebDriver Instance
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(pythonLibraries).perform();		
		pandas.click();		
		System.out.println("Page Navigated to Pandas");	
	}
	
	public void navigateToAutomationTraining() {
		mouseHover = new Actions(driver);
		mouseHover.moveToElement(qaAutomation).perform();
		automationTraining.click();
		System.out.println("Page Navigated to A to Z Automation Training");
	}
	
	

}
