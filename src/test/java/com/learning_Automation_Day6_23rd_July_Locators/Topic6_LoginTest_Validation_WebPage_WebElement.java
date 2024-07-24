package com.learning_Automation_Day6_23rd_July_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic6_LoginTest_Validation_WebPage_WebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		// getTitle and getCurrentUrl
		System.out.println(driver.getCurrentUrl()); // https://tutorialsninja.com/demo/
		System.out.println(driver.getTitle()); // Your Store

		String expectedTitle = "Your Store";
		String actualTitle = driver.getTitle();

		String expectedCurrentUrl = "https://tutorialsninja.com/demo/";
		String actualCurrentUrl = driver.getCurrentUrl();

		if (expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			System.out.println("My url is correct");
		} else {
			System.out.println("Something is wrong with the url");
		}

		WebElement myaccountlink = driver.findElement(By.linkText("My Account"));
		if (myaccountlink.isDisplayed()) {
			myaccountlink.click();
		} else {
			     System.out.println("myaccount link is not working");
			     
			     
	  

		WebElement loginlink = driver.findElement(By.linkText("Login"));
		if (loginlink.isDisplayed() && loginlink.isEnabled()) {
			loginlink.click();
		} else {
			System.out.println("login link is not working");
		}

		
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		if (emailTextBox.isDisplayed() && emailTextBox.isEnabled()) {
			emailTextBox.sendKeys("seleniumpanda@gmail.com");
		} else {
			System.out.println("emailk textbox is not working");
		}

			
	    WebElement passwordTextbBox = driver.findElement(By.id("input-password"));
	    if (passwordTextbBox.isDisplayed() && passwordTextbBox.isEnabled()) {
			passwordTextbBox.sendKeys("Selenium@123");
		} else {
			System.out.println("password textbox is not working");
		}

			
	   
	    WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
	    if (loginButton.isDisplayed() && loginButton.isEnabled()) {
			loginButton.click();
		} else {
			System.out.println("login button is not working");
		}
			

			

			

			

		}
	}

}
