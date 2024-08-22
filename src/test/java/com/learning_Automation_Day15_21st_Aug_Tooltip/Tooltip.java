package com.learning_Automation_Day15_21st_Aug_Tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tooltip {
	
	public WebDriver driver;
	
	@Test
	public void toolTip() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		WebElement signInLink = driver.findElement(By.className("signin"));
		String titleText = signInLink.getAttribute("title");
		
		System.out.println("The tool tip of this WebElement is : " + titleText);
		
	}

}
