package com.learning_Automation_Day9_31st_July_cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic1_Introduction_to_cssSelectors {
	
	//cssSelectors are faster than xpaths
	//cssSelectors are easier to write
	//cssSelectors can only come from parent to child

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//driver.findElement(By.cssSelector("a[class = signin]")).click();
		driver.findElement(By.cssSelector("a.signin")).click();
		//driver.findElement(By.cssSelector(".signin")).click();
		//driver.findElement(By.cssSelector("input[id = login1]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");

	}

}
