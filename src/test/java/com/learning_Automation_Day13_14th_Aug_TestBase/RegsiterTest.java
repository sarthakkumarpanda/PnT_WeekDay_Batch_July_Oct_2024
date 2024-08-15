package com.learning_Automation_Day13_14th_Aug_TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.learning_Automation_Day12_13th_Aug_Relating_to_ReturnType_Methods_in_Automation.Utils;

public class RegsiterTest extends TestBase{

	public RegsiterTest() throws Exception {
		super();
	}

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = initializeBrowserAndOpenApplication("Firefox");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	@Test(priority=1)
	public void verifyRegisterWithMandatoryDetails() {
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys(Utils.emailWithDateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div#content > p:nth-child(2)")).isDisplayed());	
	}
	
	@Test(priority=2)
	public void verifyRegisterWithAllDetails() {
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys(Utils.emailWithDateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div#content > p:nth-child(2)")).isDisplayed());
	}
	
	@Test(priority=3)
	public void verifyRegisterWithIncorrectConfirmPassword() {
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys(Utils.emailWithDateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123456");
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input#input-confirm + div")).isDisplayed());
	}
	
	@Test(priority=4)
	public void verifyRegisterWithNoDetails() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualPrivacyPolicyWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarningMessage = "Warning: You must agree to the Privacy Policy!";
		Assert.assertTrue(actualPrivacyPolicyWarningMessage.contains(expectedPrivacyPolicyWarningMessage));
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input#input-firstname+div")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("input#input-lastname+div")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("input#input-email+div")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("input#input-telephone+div")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("input#input-password+div")).isDisplayed());
		
	}
	

	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

