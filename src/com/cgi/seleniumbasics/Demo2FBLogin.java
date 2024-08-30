package com.cgi.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//1
		//By locator=By.id("email");
		//WebElement element= driver.findElement(locator);
		//element.sendKeys("hello12344555656@gmail.com");
		
		//2
		WebElement element= driver.findElement(By.id("email"));
		element.sendKeys("hello12344555656@gmail.com");
		
		//3
		driver.findElement(By.id("email")).sendKeys("hello12344555656@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("welcom133");
		
		driver.findElement(By.name("login")).click();
	}
}
