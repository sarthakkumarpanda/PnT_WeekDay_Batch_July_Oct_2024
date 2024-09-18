package com.learning_Automation_Day20_10th_Sep_MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CNN_FooterLinks {
	
	public WebDriver driver;
	
	@Test
	public void rediffFooterlinks() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cnn.com");
		
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		List<WebElement> footerlinks = driver.findElements(By.xpath("//nav[@class = 'footer__links']/a"));
		System.out.println("Total number of footerlinks are : " + footerlinks.size());
		
		//print all the names of the footer links in cnn website
		
		for(int i=0 ; i<footerlinks.size() ; i++) {
			System.out.println(footerlinks.get(i).getText() + "---------------> " + footerlinks.get(i).getAttribute("href"));
			
			//click on each link
			footerlinks.get(i).click();
			System.out.println("The title of this page is : " + driver.getTitle());
			driver.get("https://cnn.com");
			Thread.sleep(1000);
			footerlinks = driver.findElements(By.xpath("//nav[@class = 'footer__links']/a"));
			Thread.sleep(1000);
		}
		
	}

}
