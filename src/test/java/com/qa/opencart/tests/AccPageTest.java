package com.qa.opencart.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.util.AppConstants;

public class AccPageTest extends BaseTest{
 @BeforeClass
	public void accSetup() {
		accpage = loginPage.doLogin("shruthi.avi72@gmail.com", "Anusha@123");
	}
	
 @Test
public void accPageTitleTest() {
		String actTitle = accpage.getAccPageTitle();
		System.out.println("acc page title : " + actTitle);
		Assert.assertEquals(actTitle, AppConstants.ACCOUNTS_PAGE_TITLE);
	}
 
 @Test
	public void accPageURLTest() {
		String actURL = accpage.getAccPageURL();
		System.out.println("Acc page url : " + actURL);
		Assert.assertTrue(actURL.contains(AppConstants.ACC_PAGE_FRACTION_URL));
	}
 
 @Test
 public void accPageHeadersTest() {
	List<String> actHeadersList = accpage.getAccountsPageSectionHeader();
	Assert.assertEquals(actHeadersList, AppConstants.Expected_Acc_Headers_List);
 }


 
}
