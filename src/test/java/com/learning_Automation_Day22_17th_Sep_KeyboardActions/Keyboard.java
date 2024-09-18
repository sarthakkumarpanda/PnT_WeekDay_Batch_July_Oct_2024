package com.learning_Automation_Day22_17th_Sep_KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Keyboard {
	
	public WebDriver driver;
	
	@Test
	public void TutotialsNinjaKeyboard() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		WebElement myAccountDropDown = driver.findElement(By.linkText("My Account"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(myAccountDropDown).click().build().perform();
		actions.moveToElement(driver.findElement(By.linkText("Login"))).click().build().perform();
		
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		WebElement LoginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		actions.click(emailTextBox).sendKeys("seleniumpanda@gmail.com").build().perform(); //this will enter the email
		
		//We need to select the email - Ctrl + A
		actions.keyDown(emailTextBox, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//Copying [Ctrl + C]
		actions.keyDown(emailTextBox, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//Press the Tab key to go to password textbox
		actions.keyDown(emailTextBox, Keys.TAB).build().perform();
		
		//Pasting [Ctrl + V]
		actions.keyDown(passwordTextBox, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//Click on Login button
		actions.keyDown(LoginButton, Keys.ENTER).build().perform();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
