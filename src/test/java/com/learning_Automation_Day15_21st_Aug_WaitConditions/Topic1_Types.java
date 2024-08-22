package com.learning_Automation_Day15_21st_Aug_WaitConditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Topic1_Types {

	//implicitWait - it is smart form of wait
	//ExplicitWait 
	//fluentWait - homework
	
	public WebDriver driver;
	public Select select;
	public WebDriverWait wait;
	
	@Test
	public void understandingImplicitWait() throws Exception {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.id("fname")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("lname")).sendKeys("Panda");
		Thread.sleep(2000);
		driver.findElement(By.id("male")).click();
		Thread.sleep(2000);
		select = new Select(driver.findElement(By.id("option")));
		select.selectByVisibleText("option 1");
	}
	
	@Test
	public void explicitWaitOfSeleniumWhichActsLikeImplicit() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(myAccountLink)).click();
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
		
		WebElement emailIDTextBox = driver.findElement(By.id("input-email"));
		wait.until(ExpectedConditions.visibilityOf(emailIDTextBox)).sendKeys("seleniumpanda@gmail.com");
		
		WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		wait.until(ExpectedConditions.visibilityOf(passwordTextBox)).sendKeys("Selenium@123");
		
		WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	}
	
	
}
