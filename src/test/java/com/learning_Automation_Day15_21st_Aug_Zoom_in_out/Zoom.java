package com.learning_Automation_Day15_21st_Aug_Zoom_in_out;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zoom {
	
	public WebDriver driver;
	
	@Test
	public void shaadiCom() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shaadi.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom = '300%' ;");
		
		Thread.sleep(1000);
		
		js.executeScript("document.body.style.zoom = '30%' ;");
		
		Thread.sleep(1000);
		js.executeScript("document.body.style.zoom = '100%' ;");
	}

}
