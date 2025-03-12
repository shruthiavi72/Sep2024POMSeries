package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccPage;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	protected LoginPage loginPage;
	protected AccPage accpage;
	
	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		driver = df.initDriver("chrome");
		loginPage = new LoginPage(driver);
		
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//		
//	}
	
	
	
	
	

}
