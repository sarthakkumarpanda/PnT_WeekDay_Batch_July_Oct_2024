package com.learning_Automation_Day17_28th_Aug_TestNG_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.learning_Automation_Day12_13th_Aug_Relating_to_ReturnType_Methods_in_Automation.Utils;

public class Topic3_RegisterExample {
	
	public WebDriver driver;
	
	@Test(dataProvider = "getRegisterData")
	public void registerTest(String firstname, String lastname, String telephone, String password, String confirmpassword) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(Utils.emailWithDateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirmpassword);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@DataProvider
	public Object[][] getRegisterData() {
		Object[][] getRegTestData = { {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"},
				                      {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"},
				                      {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"},
				                      {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"},
				                      {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"},
				                      {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"} };
		
		return getRegTestData;
		}
	

	
	
@AfterMethod
public void tearDown() {
	driver.quit();
}

}
