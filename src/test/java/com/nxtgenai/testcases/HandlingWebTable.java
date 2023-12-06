package com.nxtgenai.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.NxtGenHomePage;
import com.nxtgenai.pages.NxtGenWebTablePage;

public class HandlingWebTable extends TestBase{

	@Test(priority=1)
	public void displayEmployeeDetails() {
		// Navigate to the webtable
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToWebTable();
		
		// Display the details
		NxtGenWebTablePage empTable = PageFactory.initElements(driver, NxtGenWebTablePage.class);
		empTable.displayEmployeeFirstName();
		empTable.displayEmployeeLastName();		
	}
	
	
	
	
}
