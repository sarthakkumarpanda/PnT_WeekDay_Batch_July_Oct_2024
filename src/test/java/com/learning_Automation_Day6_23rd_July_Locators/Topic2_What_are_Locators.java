package com.learning_Automation_Day6_23rd_July_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic2_What_are_Locators {

	//Selenium2 had 8 locators
	//Selenium3 got 11 locators
	//Selenium4 has 16 locators
	public static void main(String[] args) {
		
		//1. id - gets the highest priority. But make sure id attribute is unique and it not dynamic in nature
		//2. className - 2nd priority, it should not be compounded
		//3. name
		// 4. linkText
		// 5. partiallinkText
		//6. xpath
		//7. cssSelector
		//8. tagname
		
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 * //driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com"
		 * );
		 * driver.findElement(By.name("login")).sendKeys("seleniumpanda@rediffmail.com")
		 * ; driver.findElement(By.id("password")).sendKeys("Selenium@123");
		 * driver.findElement(By.className("signinbtn")).click();
		 */
		
		//what is a compounded value ?
		//something which is more than one
		
		//signinbtn - this is a single value and it is fine to use
		//bmailicon relative - this one is a compounded value
		
		//showingHowCompoundClassDoesNotWorkDirectly();
		linkTextAndPartiallinkText();

	}
	
	public static void showingHowCompoundClassDoesNotWorkDirectly() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.className("bmailicon relative")).click();
	}
	
	public static void linkTextAndPartiallinkText() {
		//these are related to links
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//driver.findElement(By.linkText("Business Email")).click();
		driver.findElement(By.partialLinkText("Business Em")).click();
	}
	
	


}
