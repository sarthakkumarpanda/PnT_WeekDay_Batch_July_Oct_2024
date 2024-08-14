package com.learning_Java_Day12_13th_Aug_OOPs_Methods;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Topic5_ClassAssignment {

	//Create a Class and create a main method inside it
	//Create 4 methods and out of those 4 make 2 methods as parameterized methods
	//In the regular 2 methods use simple mathematical logic to return something
	//In the other 2 parameterized methods use one method for TutorialsNinja Login and the other method for TNRegister
	//Create one more method to write the DateTimeStamp for email registration
	
	public static void main(String[] args) {
		test1();
		test2();
		loginTN("seleniumpanda@gmail.com", "Selenium@123");
		verifyRegisterWithMandatoryDetails("Selenium", "Panda", emailWithDateTimeStamp(), "9876543210", "Selenium@123", "Selenium@123");
	}
	
	public static int test1() {
		int i=10;
		int j=20;
		int k=i+j;
		System.out.println(k);
		return k;
	}
	
	public static int test2() {
		int i=10;
		int j=20;
		int k=i*j;
		System.out.println(k);
		return k;
	}
	
	public static void loginTN(String email, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
	
	public static void verifyRegisterWithMandatoryDetails(String firstname, String lastname, String email, String telephone, String password, String confirmPassword) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirmPassword);
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div#content > p:nth-child(2)")).isDisplayed());
		driver.quit();
	}
	
	public static String emailWithDateTimeStamp() {
		Date date = new Date();
		String dateTimeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "seleniumpanda" + dateTimeStamp + "@gmail.com";
	}
	
}
