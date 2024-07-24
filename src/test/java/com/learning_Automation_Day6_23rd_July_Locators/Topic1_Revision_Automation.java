package com.learning_Automation_Day6_23rd_July_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic1_Revision_Automation {

	// WebDriver - Browser Drivers
	// Open a browser
	// Maximize the browser
	// Enter the url
	// Quit the browser

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//driver is a reference. So this reference will be used everywhere
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo/");
		//first I have to click on My Account link
		//I have select the Login option
		//I have to enter the username
		//I have to enter the password
		//I have to click on the Login button
		
		//how to identify a WebElement - by Locators
		

	}

}