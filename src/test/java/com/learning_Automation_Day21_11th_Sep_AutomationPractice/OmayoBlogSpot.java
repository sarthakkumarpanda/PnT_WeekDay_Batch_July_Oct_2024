package com.learning_Automation_Day21_11th_Sep_AutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OmayoBlogSpot {
	
	public ChromeOptions options;
	public WebDriver driver;
	public Select select;
	
	@BeforeMethod
	public void launchWebsite() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(200));
		
	}
	
	@Test(priority = 1)
	public void mouseHoveringOverBlogsTab() throws Exception {
		WebElement blogsMenu = driver.findElement(By.id("blogsmenu"));
		Actions actions = new Actions(driver);
		actions.moveToElement(blogsMenu).build().perform();
		Thread.sleep(2000);
		//Screenshot code
	}
	
	@Test(priority = 2)
	public void olderNewsLetterDropdown() {
		select = new Select(driver.findElement(By.id("drop1")));
		select.selectByVisibleText("doc 3");
			
	}
	
	@Test
	public void sampleText() {
		String expectedSampleText = "This is a sample Text on this page. This is a sample Text on this page. This is a sample Text on this page.";
		
		
	}
	
	@Test
	public void textBoxWithPreLoadedText() {
		WebElement textBox = driver.findElement(By.id("textbox1"));
		
		System.out.println(textBox.getText());
		textBox.clear();
		System.out.println("Now the note inside the textbox is :" + textBox.getText());
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
