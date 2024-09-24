package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	private WebDriver driver;


	// 1. private By locators:
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	
	}

	// 3. page actions:
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	
	public String getLoginPageUrl() {
		return driver.getCurrentUrl();
	}

	
	public boolean isforgotPWdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public boolean doLogin(String un, String pwd) {
		System.out.println("creds are :" + un + ":" + pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		return driver.findElement(By.linkText("Logout")).isDisplayed();
	}
	
}
