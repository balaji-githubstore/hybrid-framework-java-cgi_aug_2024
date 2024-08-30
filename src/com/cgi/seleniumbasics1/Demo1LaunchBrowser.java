package com.cgi.seleniumbasics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		String browser="ch";
		
		WebDriver driver1;
		
		if(browser.equalsIgnoreCase("edge"))
		{
			 driver1=new EdgeDriver();
		}
		else
		{
			 driver1=new ChromeDriver();
		}
		
		
		//ChromeDriver driver2=new ChromeDriver();
		//driver1=new EdgeDriver();
		
		driver1.get("https://www.facebook.com/");
		
		String actualTitle=driver1.getTitle();
		System.out.println(actualTitle);
		
		
		driver1.quit();
		
		//driver2.quit();
	}
}
