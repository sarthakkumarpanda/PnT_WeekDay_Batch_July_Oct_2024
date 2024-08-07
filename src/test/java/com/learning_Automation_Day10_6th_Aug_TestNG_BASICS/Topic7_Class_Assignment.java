package com.learning_Automation_Day10_6th_Aug_TestNG_BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic7_Class_Assignment {
	
	//1. Login with valid credentials
	//2. Login with valid email invalid password
	//3. Login with invalid email valid password
	//4. Login with invalid credentials
	//5. Login with no credentials
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();		
	}
	
	@Test(priority=1)
	public void verifyLoginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();	
		Assert.fail("Deliberately Failing");
	}
	
	@Test(priority=2, dependsOnMethods = "verifyLoginWithValidCredentials")
	public void verifyLoginWithValidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();	
		
	}
	
	@Test(priority=3, dependsOnMethods = {"verifyLoginWithValidCredentials" , "verifyLoginWithValidEmailInvalidPassword"})
	public void verifyLoginWithInvalidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmaill.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();	
		
	}
	
	@Test(priority=4, dependsOnMethods = {"verifyLoginWithValidCredentials", "verifyLoginWithValidCredentials", "verifyLoginWithInvalidEmailValidPassword"}, alwaysRun = true)
	public void verifyLoginWithInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmaill.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();	
	}
	
	@Test(priority=5, enabled = false, alwaysRun = true)
	public void verifyLoginWithNoCredentials() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();	
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
