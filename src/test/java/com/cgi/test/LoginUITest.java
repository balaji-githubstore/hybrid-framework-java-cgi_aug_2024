package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {

	@Test
	public void titleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@Test
	public void loginHeaderTest() {
		String actualHeader = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		Assert.assertEquals(actualHeader, "Login");
	}
}
