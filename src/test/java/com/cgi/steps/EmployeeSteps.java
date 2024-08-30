package com.cgi.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.cgi.base.AutomationWrapper;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {
	
	private AutomationWrapper wrapper;
	public EmployeeSteps(AutomationWrapper wrapper)
	{
		this.wrapper=wrapper;
	}
	
	@When("I click on PIM menu")
	public void i_click_on_pim_menu() {
		wrapper.driver.findElement(By.xpath("//span[text()='PIM']")).click();
	}

	@When("I click on Add employee menu")
	public void i_click_on_add_employee_menu() {

	}

	@When("I fill the employee details")
	public void i_fill_the_employee_details(DataTable dataTable) {
		
		List<Map<String, String>> lists= dataTable.asMaps();
		
		System.out.println(lists.get(0));
		System.out.println(lists.get(0).get("firstname"));
		System.out.println(lists.get(0).get("middlename"));
		System.out.println(lists.get(0).get("lastname"));
	}

	@When("I click on save")
	public void i_click_on_save() {

	}

	@Then("I should get the profile name as {string}")
	public void i_should_get_the_profile_name_as(String expected_name) {

	}

}
