package com.learning_Automation_Day14_20th_Aug_FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.learning_Automation_Day12_13th_Aug_Relating_to_ReturnType_Methods_in_Automation.Utils;

public class Topic4_RegisterTest {
	
	public Properties prop;
	public FileInputStream ip;
	public WebDriver driver;
	
	public Topic4_RegisterTest() throws IOException {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\java\\com\\learning_Automation_Day14_21st_Aug_FileHandling\\RegisterPage.properties");
		prop.load(ip);
	}
	
	@Test
	public void registerAccountWithAllDetails() throws Exception {
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.id("input-lastname")).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.id("input-email")).sendKeys(Utils.emailWithDateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys(prop.getProperty("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("confirmPassword"));
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div#content > p:nth-child(2)")).isDisplayed());
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
