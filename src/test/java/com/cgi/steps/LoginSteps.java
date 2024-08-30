package com.cgi.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("I have browser with orange HRM application")
	public void i_have_browser_with_orange_hrm_application() {
	    System.out.println("given");
	}
	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		System.out.println("@When"+username);
	}
	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		System.out.println("@When"+password);
	}
	@When("I click on login")
	public void i_click_on_login() {
		System.out.println("@When");
	}
	@Then("I should get access to portal with dashboard page header as {string}")
	public void i_should_get_access_to_portal_with_dashboard_page_header_as(String expectedValue) {
		System.out.println("then "+expectedValue);
	}
	
	@Then("I should not get access to portal with error {string}")
	public void i_should_not_get_access_to_portal_with_error(String expectedError) {
		System.out.println("then "+expectedError);
	}


}
