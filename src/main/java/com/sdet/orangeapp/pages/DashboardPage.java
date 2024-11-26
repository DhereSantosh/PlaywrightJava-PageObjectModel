package com.sdet.orangeapp.pages;

import com.microsoft.playwright.Page;





public class DashboardPage {
	
	private Page dashboard_page;
	
	private String PIMOption = "//span[normalize-space()='PIM']";
	
	private String add_emp = "//a[normalize-space()='Add Employee']";
	private String empFname = "//input[@placeholder='First Name']";
	private String empLname = "//input[@placeholder='Last Name']";
	//private String empId = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']";
	private String saveBtn = "//button[normalize-space()='Save']";
	private String personalDetails = "//h6[normalize-space()='Personal Details']";
	private String suceessPop = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]";
	
	public DashboardPage(Page page) {
		this.dashboard_page=page;
	}
	
	public String getDashboardPageTitle() {
		return dashboard_page.title();
	}
	
	public void clickPIM() {
		dashboard_page.click(PIMOption);
		//return new PIMPage(dashboard_page);
	}
	
	public String addEmpDetails(String fristName, String lastName) {
		dashboard_page.click(add_emp);
		dashboard_page.fill(empFname, fristName);
		dashboard_page.fill(empLname, lastName);
		//String Employee_ID = dashboard_page.textContent(empId);
		System.out.println("F_Name: " + fristName + "L_Name: " + lastName);
		dashboard_page.click(saveBtn);
		String successMsg=dashboard_page.innerText(suceessPop);
		return successMsg;
	}

}
