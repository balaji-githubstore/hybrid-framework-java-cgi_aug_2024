package com.cgi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.db4free.net/");
		

		driver.findElement(By.partialLinkText("phpMyAdmin")).click();

		
		//switch to 2nd tab
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		for(String win : windows)
		{
			driver.switchTo().window(win);
			if(driver.getTitle().equalsIgnoreCase("phpMyAdmin"))
			{
				break;
			}
			System.out.println("-----------------------");
		}
		
		//driver will point to tab with title Planet MySQL
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
