package com.cgi.advance;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo2Options {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("start-maximized");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:\\Mine\\Demo");
		opt.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(opt);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.ilovepdf.com/pdf_to_word");

		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Mine\\Balaji Dinakaran Profile.pdf");

		driver.findElement(By.id("processTaskTextBtn")).click();
		driver.findElement(By.id("pickfiles")).click();

	}

}
