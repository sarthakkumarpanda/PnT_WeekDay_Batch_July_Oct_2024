package com.learning_Automation_Day15_21st_Aug_ChromeOptions;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeBrowser {

	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void ChromeOptionsCheck() {
		 options = new ChromeOptions();
		//controlling speed
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		//maximize the browser
		//options.addArguments("--start-maximized");
		//options.addArguments("--incognito");
		options.addArguments("--headless");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
}
