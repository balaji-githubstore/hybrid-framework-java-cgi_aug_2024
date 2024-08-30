package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * WebElement for all common items like menu and profile handling section
 */
public class MainPage {

	private By pimMenuLocator = By.xpath("//span[text()='PIM']");

	private WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnPIMMenu() {
		driver.findElement(pimMenuLocator).click();
	}
}
