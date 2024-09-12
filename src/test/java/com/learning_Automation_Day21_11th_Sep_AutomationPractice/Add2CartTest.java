package com.learning_Automation_Day21_11th_Sep_AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Add2CartTest extends TestBase{

	public Add2CartTest() throws Exception {
		super();
	}
	
	public WebDriver driver;
	
	@BeforeClass
	public void add2CartSetup() throws Exception {
	      driver = initalizeBrowserAndOpenApplication("chrome");
	}
	
	@Test(priority=1)
	public void verifyLoginWithValidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
	}
	
	@Test(priority=2)
	public void clickOnHomeIcon() {
		driver.findElement(By.linkText("Qafox.com")).click();
	}
	
	@Test(priority=3)
	public void mouseHoverToLaptops_NotedpadsTab() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement LapNoteTab = driver.findElement(By.linkText("Laptops & Notebooks"));
		actions.moveToElement(LapNoteTab).build().perform();
		Thread.sleep(1000);
	}
	
	@Test(priority=4)
	public void clickOnShowAllLaptops_NotebooksOption() {
		driver.findElement(By.linkText("Show AllLaptops & Notebooks")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text() = 'Laptops & Notebooks']")).isDisplayed());
	}
	
	@Test(priority=5)
	public void scrollDownTheWebPageAndClickOnAddToCartButton() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='content']/child::div[4]/descendant::button[1]")).click();
	}
	
	@Test(priority=6)
	public void scrollDownTheHPLaptoPage() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)"); //scrolling to the bottom most 
		Thread.sleep(2000);
	}
	
	@Test(priority=7)
	public void increaseQuantityAndAddToCartButton() {
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("2");
		driver.findElement(By.id("button-cart")).click();
		
		String actualSuccessMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedSuccessMessage = "Success: You have added HP LP3065 to your shopping cart!";
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage));
	}
	
	@Test(priority=8)
	public void clickOnShoppingCart() {
		driver.findElement(By.linkText("Shopping Cart")).click();
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	}
	
	@Test(priority=9)
	public void updateQuantity() throws Exception {
		driver.findElement(By.cssSelector("div.input-group.btn-block input")).clear();
		driver.findElement(By.cssSelector("div.input-group.btn-block input")).sendKeys("5");
		driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
		
		String changedPrice = driver.findElement(By.xpath("//div[@id = 'content']/descendant::table[1]/child::tbody/tr/td[6]")).getText();
		String expectedPrice = "$500.00";
		Assert.assertTrue(changedPrice.equals(expectedPrice));
		
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-payment-address")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("button-shipping-address")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("comment")).sendKeys("Ordered 5 HP Laptops");
		Thread.sleep(2000);
		driver.findElement(By.id("button-shipping-method")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-payment-method")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-confirm")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Your order has been successfully processed!']")).isDisplayed());
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	
    	
	
	


}
