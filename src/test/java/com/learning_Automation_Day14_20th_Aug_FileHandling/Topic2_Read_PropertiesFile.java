package com.learning_Automation_Day14_20th_Aug_FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic2_Read_PropertiesFile {
	
	//Step 1. Create the .properties file
	//Step 2. Inside the properties file store your data in the form of key=value
	//Step 3. You have to create the Object of Properties Class
	//Step 4. You have to create the Object of FileInputStream Class and pass the path of the .properties file in the constructor
	//Step 5. You load the file
	//Step 6: In your automation code, use the reference of Properties class and utilize the key in the code
	
	//Why is this done and where is it used in Automation
	//To make your code look more readable and not hard-coded
	//When you do not want to hardcode - Configurable data
	
	public Properties prop;
	public FileInputStream ip;
	public WebDriver driver;
	
	
	public Topic2_Read_PropertiesFile() throws IOException {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\java\\com\\learning_Automation_Day14_21st_Aug_FileHandling\\config.properties");
		prop.load(ip);
	}
	
	@Test
	public void determineUserDirectoryPath() {
		System.out.println(System.getProperty("user.dir"));
	}
	
	@Test
	public void openApplication() {
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
