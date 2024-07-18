package com.learning_Automation_Day4_16th_July_BasicsOfAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic1_FirstCodeInAutomation {
	
	//Open a Chrome Browser
	//Maximize the browser
	//Enter the url [website]
	//close the browser
	
	//is to write a statement - comments do not execute just represent

	public static void main(String[] args) {
		
		
		  WebDriver driver = new ChromeDriver(); //Ctrl + Shift + O, Cmd + Shift + O
		  driver.manage().deleteAllCookies(); 
		  driver.manage().window().maximize();
		  driver.get("https://google.com"); 
		  driver.close();
		  
		  WebDriver driver1 = new FirefoxDriver(); //Ctrl + Shift + O
		  driver1.manage().window().maximize(); 
		  driver1.get("https://amazon.com");
		  driver1.close();
		  
		  WebDriver driver2 = new EdgeDriver(); 
		  driver2.manage().window().maximize();
		  driver2.get("https://costco.com"); 
		  driver2.close();
		 
		
		//showingExample();

	}
	
	
	public static void showingExample() {
		WebDriver driver = new ChromeDriver(); //browser is open
		driver.manage().window().maximize(); //browser is maximized
		driver.get("https://tutorialsninja.com/demo"); //url is entered
		driver.findElement(By.linkText("My Account")).click(); //My Account link is getting clicked
		driver.findElement(By.linkText("Login")).click(); //Login link is getting clicked
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
