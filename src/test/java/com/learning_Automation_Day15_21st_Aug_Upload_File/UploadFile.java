package com.learning_Automation_Day15_21st_Aug_Upload_File;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UploadFile {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Test
	public void uploadingAFileInSelenium() throws Exception {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://imgbb.com/");
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,1000)");
		 */
		WebElement uploadButton = driver.findElement(By.className("home-buttons"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(uploadButton));
		
		uploadButton.sendKeys("C:\\Users\\sarth\\OneDrive\\Desktop\\hello.pdf");
	
		 
	}

}
