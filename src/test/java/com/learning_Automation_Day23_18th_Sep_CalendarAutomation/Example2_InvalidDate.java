package com.learning_Automation_Day23_18th_Sep_CalendarAutomation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Example2_InvalidDate {
	
public WebDriver driver;

//30 Feb 2028

     @Test
     public void pickTheDate() throws InterruptedException {
    	 customizedDateTest("30", "February", "2028");
      }    
	

	public void customizedDateTest(String selectDay, String selectMonth, String selectYear) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		if(Integer.parseInt(selectDay) > 31) {
			System.out.println("Invalid Date");
			return;
		}
		
		if(selectMonth.equals("February") && Integer.parseInt(selectDay) > 29) {
			System.out.println("Invalid Febraury Month");
		}
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear);  
		
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		while(!(month.equals(selectMonth) && year.equals(selectYear))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];	
		}
		
		Thread.sleep(2000);
		String xpathDayText = "//td[@data-handler = 'selectDay']/a[text() = \' " + selectDay + "\']";
		
		driver.findElement(By.xpath(xpathDayText));
		
	}
	

}
