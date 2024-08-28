package com.learning_Automation_Day16_27th_Aug_ScreenRecording;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.learning_Automation_Day16_27th_Aug_ScreenRecording.ScreenRecorderUtil;

public class LoginTest {
	
public WebDriver driver;
	
	@Test
	public void recordingLoginTest() throws Exception {
		
		ScreenRecorderUtil.startRecord("recordingLoginTest");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		ScreenRecorderUtil.stopRecord();
	}

}
