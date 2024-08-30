package com.cgi.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.DashboardPage;
import com.cgi.pages.LoginPage;
import com.cgi.pages.MainPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {
	
	private MainPage main;
	
	private AutomationWrapper wrapper;
	public EmployeeSteps(AutomationWrapper wrapper)
	{
		this.wrapper=wrapper;
		initPageObjects();
	}
	
	public void initPageObjects()
	{
		main=new MainPage(wrapper.driver);
	}
	
	@When("I click on PIM menu")
	public void i_click_on_pim_menu() {
		main.clickOnPIMMenu();
	}

	@When("I click on Add employee menu")
	public void i_click_on_add_employee_menu() {
		wrapper.driver.findElement(By.linkText("Add Employee")).click();
	}

	@When("I fill the employee details")
	public void i_fill_the_employee_details(DataTable dataTable) {
		
		List<Map<String, String>> lists= dataTable.asMaps();
		
		System.out.println(lists.get(0));
		System.out.println(lists.get(0).get("firstname"));
		System.out.println(lists.get(0).get("middlename"));
		System.out.println(lists.get(0).get("lastname"));
		
		
		wrapper.driver.findElement(By.name("firstName")).sendKeys(lists.get(0).get("firstname"));
		wrapper.driver.findElement(By.name("middleName")).sendKeys(lists.get(0).get("middlename"));
		wrapper.driver.findElement(By.name("lastName")).sendKeys(lists.get(0).get("lastname"));
	}

	@When("I click on save")
	public void i_click_on_save() {
		wrapper.driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	}

	@Then("I should get the profile name as {string}")
	public void i_should_get_the_profile_name_as(String expected_name) {
		String actualName=wrapper.driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-name']/h6")).getText();
		Assert.assertTrue(expected_name.contains(actualName));
				
	}

}
