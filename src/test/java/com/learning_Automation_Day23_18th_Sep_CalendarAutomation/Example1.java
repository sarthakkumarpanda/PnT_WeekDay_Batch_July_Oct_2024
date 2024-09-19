package com.learning_Automation_Day23_18th_Sep_CalendarAutomation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Example1 {
	
	public WebDriver driver;
	
	@Test
	public void datePickerFutureDateTest() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		//you want this date - 01/21/2025
		//driver.findElement(By.id("datepicker")).sendKeys("01/21/2025"); //this is not what we are looking for. 
		
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		//Next step is deciding the month and year - January 2025
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear); // September 2024 - this is monthYear 
		
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		while(!(month.equals("January") && year.equals("2029"))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];	
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@data-handler = 'selectDay']/a[text() = '10']")).click();
		
	}
	
	@Test
	public void datePickerPastDateTest() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		//you want this date - 01/21/2025
		//driver.findElement(By.id("datepicker")).sendKeys("01/21/2025"); //this is not what we are looking for. 
		
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		//Next step is deciding the month and year - January 2025
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear); // September 2024 - this is monthYear 
		
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		while(!(month.equals("May") && year.equals("2017"))) {
			driver.findElement(By.xpath("//a[@title = 'Prev']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];	
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@data-handler = 'selectDay']/a[text() = '10']")).click();
		
	}

}
