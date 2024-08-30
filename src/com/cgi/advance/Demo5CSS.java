package com.cgi.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5CSS {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("#email")).sendKeys("hello12344555656@gmail.com");

		driver.findElement(By.cssSelector("#pass")).sendKeys("welcom133");

		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
