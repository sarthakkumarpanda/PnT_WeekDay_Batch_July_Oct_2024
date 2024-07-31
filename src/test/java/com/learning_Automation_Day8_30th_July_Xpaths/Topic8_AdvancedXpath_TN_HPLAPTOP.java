package com.learning_Automation_Day8_30th_July_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic8_AdvancedXpath_TN_HPLAPTOP {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//input[@name = 'search']")).sendKeys("HP");
		driver.findElement(By.xpath("//i[@class = 'fa fa-search']")).click();
		
		//Xpaths for the laptop
		
		//a[contains(text(), 'HP LP3065')]
		//div[@class = 'caption']/descendant::a[text() = 'HP LP3065']
		//div[@class = 'product-thumb']/descendant::a[text() = 'HP LP3065']
		//div[@id = 'content']/child::*[8]/descendant::a[text() = 'HP LP3065']
		//div[@id = 'content']/child::*[8]/descendant::a[contains(text(), 'HP LP3065')]
		//div[@id = 'content']/child::*[8]/descendant::a[1]

	}

}
