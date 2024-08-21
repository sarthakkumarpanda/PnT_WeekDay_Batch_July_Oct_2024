package com.learning_Automation_Day14_20th_Aug_Understanding_Abstraction_in_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic1 {
	
	@Test
	public void openApplication() {
		WebDriver driver = new ChromeDriver();
		//WebDriver is the interface
		//driver is the reference of the interface
		//ChromeDriver is the implementing class of WebDriver
		driver.manage().window().maximize();
		//manage() is an abstract method. You are using it...Do you know the logic of manage()
	}

}
