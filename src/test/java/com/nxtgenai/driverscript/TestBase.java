package com.nxtgenai.driverscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.nxtgenai.utilities.ExcelReader;


public class TestBase {

	public static WebDriver driver;
	public static FileInputStream fis;
	public static ExcelReader excel = new ExcelReader(".\\TestData\\RegisterDemoTestData.xlsx");
	public static WebDriverWait wait;	
	public static Properties config = new Properties();

	@BeforeSuite
	public WebDriver setUp() throws IOException{

		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\nxtgenai\\driverscript\\configuration.properties");
			config.load(fis);
			System.out.println("Configuration File Loaded Successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if(config.getProperty("browser").equalsIgnoreCase("firefox"))			
		{
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}			
		else if(config.getProperty("browser").equalsIgnoreCase("chrome"))	
		{
			System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
			driver = new ChromeDriver();
		}

		else if(config.getProperty("browser").equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver",".\\Drivers\\msedgedriver.exe");	
			driver = new EdgeDriver();
		}

		// implicit wait statement - selenium 3
		// driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitWait")), TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitWait")), TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// selenium 4 code
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicitWait"))));
		
		// Choose the module as per the configuration file
		if(config.getProperty("module").equalsIgnoreCase("nxtgenai")) {
			driver.get(config.getProperty("urlnxtgen"));
			System.out.println("NxtGenAI Module Loaded Successfully");
		}
		else if(config.getProperty("module").equalsIgnoreCase("parabank")) {
			driver.get(config.getProperty("urlpara"));
			System.out.println("ParaBank Module Loaded Successfully");
		}		

		driver.manage().window().maximize();
		return driver;				
	}

	@AfterSuite
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}

	}
}
