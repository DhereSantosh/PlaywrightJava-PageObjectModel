package com.sdet.orangeapp.tests;

import org.testng.Assert;


import org.testng.annotations.Test;

import com.sdet.orangeapp.base.BaseTest;
import com.sdet.orangeapp.constants.AppConstants;

public class DashboardPageTest extends BaseTest {
	
	@Test(priority = 1)
	public void LoginToOrangeAPP() {
		dashboardPage = loginPage.loginToOrangeApp("Admin", "admin123");
	}
	
	@Test(priority = 2)
	public void dashboardPageNameTest() {
		String actualDashboardPageTitle = dashboardPage.getDashboardPageTitle();
		System.out.println("Actual Dashboard Page Title is: " + actualDashboardPageTitle);
		Assert.assertEquals(actualDashboardPageTitle, AppConstants.LOGIN_PAGE_TITLE);
	}
	
	@Test(priority = 3)
	public void PIMPageTest() {
		dashboardPage.clickPIM();
		
	}
	@Test(priority = 4)
	public void VerifyAddEmployee() {
		String actualMsg = dashboardPage.addEmpDetails("Test1234", "Test1234");
		System.out.println("Message popup: " + actualMsg);
		Assert.assertEquals(actualMsg,"Successfull Saved");
	}
	
	

}
