package com.learning_Automation_Day17_28th_Aug_TestNG_Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic1 {

	//Parameterization - will be done using testng.xml file
	
	public WebDriver driver;
	
	@Test
	@Parameters({"url", "email", "password"})
	public void loginTest(String url, String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
}
