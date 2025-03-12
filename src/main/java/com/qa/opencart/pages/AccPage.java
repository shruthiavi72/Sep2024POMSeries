package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccPage {
	
	private By search = By.name("search");
	private By searchIcon = By.cssSelector("div#search button");
	private By logoutLink = By.linkText("Logout");
	private By accSecHeaders = By.cssSelector("div#content h2");	

	private WebDriver driver;
	
	public AccPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAccPageTitle() {
		return driver.getTitle();
	}
	
	
	public String getAccPageURL() {
		return driver.getCurrentUrl();
	}
	
	public List<String> getAccountsPageSectionHeader() {
		List<WebElement> secHeadersList =driver.findElements(accSecHeaders);
	    List<String> secHeadersValList = new ArrayList<String>();
		for(WebElement e : secHeadersList) {
	    	String text = e.getText();
	    	System.out.println(text);
	    }
	
	return secHeadersValList;
	}
	
	 
	
}
