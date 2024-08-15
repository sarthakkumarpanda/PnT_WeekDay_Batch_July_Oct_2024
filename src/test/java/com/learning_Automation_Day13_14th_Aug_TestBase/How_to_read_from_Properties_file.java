package com.learning_Automation_Day13_14th_Aug_TestBase;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_to_read_from_Properties_file {
	public static Properties prop;
	public static FileInputStream ip;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		//Step 1: Create the object of Properties class
		prop = new Properties();
		
		//Step 2: Create the object of FileInputStream Class and pass the path of the properties file inside the constructor
		          //constructor of FileInputStream Class cannot remain by empty
		 ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\learning_Automation_Day13_14th_Aug_TestBase\\config.properties");

		//Step 3: Load the file
		prop.load(ip);
		
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	

	
	

	

	

}
