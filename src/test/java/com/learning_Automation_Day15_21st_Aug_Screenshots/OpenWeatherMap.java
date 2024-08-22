package com.learning_Automation_Day15_21st_Aug_Screenshots;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class OpenWeatherMap {
	
	public WebDriver driver;
	
	@Test
	public void screenshotCode() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org");
		
		//Step 1: Choose the image. That image will act as the WebElement
		
		WebElement logo = driver.findElement(By.cssSelector("div.section.where-to"));
		
		
		//Step 2: using this logo we can call a method known as getScreenshotAs
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		//Step 3: You need to create a folder manually where you want this file from Step 2
		
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\Screenshots\\owm.png");
		
		//Step 4: Use the FileHandler class to copy the source into the destination
		FileHandler.copy(source, destination);
		
		
		
	}

}
