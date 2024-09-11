package com.learning_Automation_Day20_10th_Sep_MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic1_Handling_Multiple_WebElements {
	
	public WebDriver driver;
	
	@Test
	public void bbc() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		
		//Find out total number of links present in this webpage as on 10thSep2024_20:37hours_EST
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links right now is : " + allLinks.size());
		//136
		
		//Determine the 101st link ??
		
		WebElement link101 = allLinks.get(100);
		System.out.println("The 101st link is : " + link101);
		System.out.println("The text of the 101st link is : " + link101.getText());
		WebElement link81 = allLinks.get(80);
		System.out.println("The 81st link is : " + link81);
		System.out.println("The text of the 81st link is : " + link81.getText());
		
		//how to determine the url present in a particular link
		System.out.println("The url present in 101st link is : " + link101.getAttribute("href"));
		
		//find out the x and y coordinate of the 101st link
		System.out.println(link101.getLocation().x + "------------" + link101.getLocation().y);
		
		//total links are 136
		
		//print their respective names and also check whether the link is displayed or hidden
		
		for(int i=0 ; i<allLinks.size() ; i++) {
			System.out.println(allLinks.get(i).getText() + "------------------" + allLinks.get(i).getAttribute("href") + 
					"------------------" + allLinks.get(i).isDisplayed());
		}
	}

}
