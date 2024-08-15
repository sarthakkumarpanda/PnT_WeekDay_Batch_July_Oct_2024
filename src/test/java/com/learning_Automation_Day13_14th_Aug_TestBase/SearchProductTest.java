package com.learning_Automation_Day13_14th_Aug_TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProductTest extends TestBase{

	public SearchProductTest() throws Exception {
		super();
	}

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = initializeBrowserAndOpenApplication("Edge");
	}
	
	@Test
	public void verifySearchWithValidProduct() {
		driver.findElement(By.cssSelector("input.form-control.input-lg")).sendKeys("HP");
		driver.findElement(By.cssSelector("i.fa.fa-search")).click();
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
		
	}
	
	@Test
	public void verifySearchWithInvalidProduct() {
		driver.findElement(By.cssSelector("input.form-control.input-lg")).sendKeys("DELL");
		driver.findElement(By.cssSelector("i.fa.fa-search")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input#button-search + h2 + p")).isDisplayed());
	}
	
	
	@Test
	public void verifySearchWithNoProduct() {
		driver.findElement(By.cssSelector("i.fa.fa-search")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input#button-search + h2 + p")).isDisplayed());	
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
