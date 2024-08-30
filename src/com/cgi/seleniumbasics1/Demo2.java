package com.cgi.seleniumbasics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		
		System.out.println(driver.getTitle());
		
		String actualUrl= driver.getCurrentUrl();
		System.out.println(actualUrl);

		String actualPS= driver.getPageSource();
		System.out.println(actualPS);
	}

}
