package com.learning_Automation_Day10_6th_Aug_TestNG_BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic9_Assert_in_TestNG {
	
	//Assert is a class in TestNG
	//Assert.assertTrue
	public WebDriver driver;
	
	@Test
	public void loginTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement editAccountInfoLink = driver.findElement(By.xpath("//a[text() = 'Edit your account information']"));
		Assert.assertFalse(editAccountInfoLink.isDisplayed());
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	
	@Test
	public void checkingMathematics() {
		int i = 1;
		int j = 2;
		System.out.println(true == true);
		
		Assert.assertTrue(i == j); //false. So assertion says it is false
		Assert.assertEquals(1<2, 3<4);
		Assert.fail();
		
		
		System.out.println(i + j); //3
		System.out.println(true == true);
		
	}

}
