package com.learning_Automation_Day16_27th_Aug_ValidatingExceptions_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic1 {
	
	public WebDriver driver;	
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	@Test
	public void loginTest() throws Exception {
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Login")).click();
	}

}
