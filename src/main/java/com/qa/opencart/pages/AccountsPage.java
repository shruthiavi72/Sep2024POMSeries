package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage {
	
	private WebDriver driver;
	
	private By search = By.name("search");
	private By searchIcon = By.cssSelector("div#search button");
	private By logoutLink = By.linkText("Logout");
	private By accSecHeaders = By.cssSelector("div#content h2");
	
	public AccountsPage(WebDriver driver) {
		this.driver = driver;

}
