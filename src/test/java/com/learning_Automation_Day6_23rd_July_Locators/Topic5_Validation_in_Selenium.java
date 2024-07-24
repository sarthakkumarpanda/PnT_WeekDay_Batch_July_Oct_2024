package com.learning_Automation_Day6_23rd_July_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic5_Validation_in_Selenium {
	
	//Validation in Selenium occurs at 2 levels
	//1. WebPage level
	//2. WebElement level

	public static void main(String[] args) {
		
		//validationAtWebPageLevel();
		validateAtWebElementLevel();
	}
	
	
	public static void validateAtWebElementLevel() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		//how to determine that the WebElement I am taking action on is correct
		//isEnabled or not
		//isDisplayed or not
		//isSelected or not
		
		WebElement myaccountlink = driver.findElement(By.linkText("My Account"));
		
		if(myaccountlink.isDisplayed() && myaccountlink.isEnabled()) {
			driver.findElement(By.linkText("My Account")).click();
		}else {
			System.out.println("The My Account link is not working");
		}
		
		WebElement loginlink = driver.findElement(By.linkText("Login"));
		
		if(loginlink.isDisplayed() && loginlink.isEnabled()) {
			driver.findElement(By.linkText("Login")).click();
		}else {
			System.out.println("The Login link is not working");
		}
		
	}
	
	public static void validationAtWebPageLevel() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		//5 environments (QA)
		//environment 1
		//https://amazon.com/electronic/sample_env_1
		//get the title of that page
		//get the current url of that page
		//get the pagesource of that page
		
		//how to determine the title of the page
		System.out.println(driver.getTitle()); //Your Store - this is what is expected
		
		//how to determine the current url of this page
		System.out.println(driver.getCurrentUrl()); //https://tutorialsninja.com/demo/index.php?route=common/home
		
		String expectedTitle = "Your Store";
		String actualTitle = driver.getTitle();
		
		String expectedCurrentUrl = "https://tutorialsninja.com/demo/index.php?route=common/home";
		String actualCurrenturl = driver.getCurrentUrl();
		
		if(expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrenturl)) {
			System.out.println("The url that I have entered is correct");
			driver.findElement(By.linkText("My Account")).click();
		}else {
			System.out.println("Something is not right");
		}
	}

}
