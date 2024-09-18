package com.learning_Automation_Day15_21st_Aug_Upload_File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UploadFile {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Test
	public void uploadingAFileInSelenium() throws Exception {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=42");
		
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 
		 Thread.sleep(2000);
		driver.findElement(By.id("button-upload222")).sendKeys("C:\\Users\\sarth\\OneDrive\\Desktop\\PnT Batch\\ToUpload.txt");
	
		 
	}

}
