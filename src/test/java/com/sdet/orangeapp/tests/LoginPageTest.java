package com.sdet.orangeapp.tests;

import org.testng.Assert;


import org.testng.annotations.Test;

import com.sdet.orangeapp.base.BaseTest;
import com.sdet.orangeapp.constants.AppConstants;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void loginPageTitle() {
		String actualTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, AppConstants.LOGIN_PAGE_TITLE);
	}
	
	@Test
	public void loginPageURL() {
		String actualURL = loginPage.getLoginPageURL();
		Assert.assertEquals(actualURL, prop.getProperty("url"));
	}
	
	@Test
	public void Login() {
		//loginPage.loginToOrangeApp("Admin","admin123");
	}
	
	

}
