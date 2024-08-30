package com.cgi.seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		//click on create new account
		//findelement --> check for presence of element within 0.5 sec/500ms
		driver.findElement(By.linkText("Create new account")).click();
		
		//enter firstname
		driver.findElement(By.name("firstname")).sendKeys("john");
		
		//enter lastname
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		//enter password 
		
		//17-06-1992
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("17");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Jun");
		
		//select year as 1992
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//click on sign up
		driver.findElement(By.name("websubmit")).click();
		
	}
}
