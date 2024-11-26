package com.sdet.orangeapp.base;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;
import com.sdet.orangeapp.factory.PlaywrightFactory;
import com.sdet.orangeapp.pages.DashboardPage;
import com.sdet.orangeapp.pages.LoginPage;



public class BaseTest {
	
	Page page;
	PlaywrightFactory pf;
	
	protected Properties prop;
	protected LoginPage loginPage;
	protected DashboardPage dashboardPage;
	
	
	@BeforeTest
	public void setup() {
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
		page = pf.initBrowser(prop);
		loginPage = new LoginPage(page);
	}
	
	@AfterTest
	public void tearDown() {
		//page.context().browser().close();
	}

}
