package com.learning_Java_Day12_13th_Aug_OOPs_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic3_ParamterizedMethods {

	public static void main(String[] args) {
		addTwoNumbers(10, 20);	
		booleanComparison(1<2, 2<3);
		LoginPageInformation("seleniumpanda@gmail.com", "Selenium@123", 123456);
		loginTN("seleniumpanda@gmail.com", "Selenium@123");
	}
	
	
	public static void addTwoNumbers(int i, int j) {
		System.out.println(i + j);
	}
	
	public static void booleanComparison(boolean b1, boolean b2) {
		System.out.println(b1 == b2);
	}
	
	public static void LoginPageInformation(String email, String password, int otp) {
		System.out.println(email);
		System.out.println(password);
		System.out.println(otp);
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
	}

}
