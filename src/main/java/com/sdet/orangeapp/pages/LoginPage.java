package com.sdet.orangeapp.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	
	private Page page;
	
	public LoginPage(Page page) {
		this.page=page;
	}
	
	private String username = "input[name='username']";
	private String password = "input[name='password']";
	private String loginBtn = "//button[normalize-space()='Login']";
	
	public String getLoginPageTitle() {
		String title = page.title();
		System.out.println("page title: " + title);
		return title;
	}
	
	public String getLoginPageURL() {
		String url = page.url();
		System.out.println("page url: " + url);
		return url;
	}
	
	public DashboardPage loginToOrangeApp(String uname,String pwd) {
		page.fill(username, uname);
		page.fill(password, pwd);
		page.click(loginBtn);
		return new DashboardPage(page);
	}
	
	
}
