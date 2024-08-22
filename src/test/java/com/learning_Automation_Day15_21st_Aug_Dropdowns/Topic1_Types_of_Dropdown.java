package com.learning_Automation_Day15_21st_Aug_Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Topic1_Types_of_Dropdown {
	
	//Select Class dropdown
	//Bootstrap dropdown
	//Dynamic dropdown
	
	public WebDriver driver;
	public Select select;
	
	@Test
	public void facebookDateOfBirthDropdown() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Panda");		driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Selenium@123");
		//Create the object of Select class
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		select = new Select(monthDropdown); //the constructor of Select class cannot remain empty.  What parameter needs to be passed in the Select class constructor
		//Select class has 3 methods which is also asked in interview
		//selectByIndex()
		//selectByValue()
		//selectByVisibleText()
		select.selectByVisibleText("Nov");
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		select = new Select(dayDropdown);
		select.selectByVisibleText("25");
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		select = new Select(yearDropdown);
		select.selectByVisibleText("1996");
	}

}
