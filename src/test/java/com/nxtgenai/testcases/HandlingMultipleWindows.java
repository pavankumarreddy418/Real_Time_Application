package com.nxtgenai.testcases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.NxtGenHomePage;
import com.nxtgenai.pages.NxtGenMultipleWindowsPage;
import com.nxtgenai.utilities.TestUtil;

public class HandlingMultipleWindows extends TestBase {

	public NxtGenMultipleWindowsPage multiwindow;
	public NxtGenHomePage homePage;

	@BeforeClass
	public void navigateToMultipleWindows() {
		
		homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToMultipleWindows();		
	}

	@Test(priority=1)
	public void handlingMultipleBrowsers() throws IOException{		
		
		multiwindow = PageFactory.initElements(driver, NxtGenMultipleWindowsPage.class);
		multiwindow.clickNewBrowserWindowBtn();
		/* Optional way to take screenshot for a particular step 
		 * This screenshot will be included in the extend report.
		 */
		TestUtil.captureScreenshot();

		// Get the window's ID 
		Set<String> windowId = driver.getWindowHandles();			
		Iterator<String> iterator = windowId.iterator();

		// Storing the window's id to the respective window's
		String homePageWin = iterator.next(); // 1 - Main Window
		String newPageWin = iterator.next(); // 2 - New window 

		driver.switchTo().window(newPageWin);
		homePage.maximizeBrowser();
		homePage.clickPythonForDataScienceLink();
		homePage.closeBrowser();
		driver.switchTo().window(homePageWin);
		homePage.clickHomeLink(); 

	}

	@Test(priority=2)
	public void handlingMultipleTabs(){		
		
		navigateToMultipleWindows();
		multiwindow.clickNewBrowserTabBtn();

		// Get the window's ID 
		Set<String> windowId = driver.getWindowHandles();			
		Iterator<String> iterator = windowId.iterator();

		// Storing the window's id to the respective window's
		String homePageWin = iterator.next(); // 1 - Main Window
		String newTabWin = iterator.next(); // 2 - New window 

		driver.switchTo().window(newTabWin);
		homePage.maximizeBrowser();
		homePage.clickPythonForDataScienceLink();
		homePage.closeBrowser();
		driver.switchTo().window(homePageWin);
		homePage.clickHomeLink();

	}
	
	@Test(priority=3)
	public void handlingMultipleMessageWindow(){		
		
		navigateToMultipleWindows();
		multiwindow.clickNewMessageWindowBtn();

		// Get the window's ID 
		Set<String> windowId = driver.getWindowHandles();			
		Iterator<String> iterator = windowId.iterator();

		// Storing the window's id to the respective window's
		String homePageWin = iterator.next(); // 1 - Main Window
		String newPageWin = iterator.next(); // 2 - New window 

		driver.switchTo().window(newPageWin);
		homePage.closeBrowser();
		driver.switchTo().window(homePageWin);
		homePage.clickHomeLink(); 
	}	

}
