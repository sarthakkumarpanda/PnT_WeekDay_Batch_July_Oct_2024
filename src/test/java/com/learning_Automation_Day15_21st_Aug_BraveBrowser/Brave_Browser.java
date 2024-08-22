package com.learning_Automation_Day15_21st_Aug_BraveBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Brave_Browser {
	//Step 1: Download and install Brave browser in your laptop
	//Step 2: You will need the path of brave.exe file
	//Step 3: You have to use ChromeOptions and with options reference call the setBinary method and pass the path mentioned in step2
	
	public WebDriver driver;
	
	@Test
	public void validateBraveBrowserAutomation() {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://google.com");
		
	}

}
