package com.learning_Automation_Day20_10th_Sep_MultipleWebElements;

import java.io.IOException;
import java.util.List;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Response_Code {
	
	public WebDriver driver;
	
	@Test
	public void rediffFooterlinks() throws InterruptedException, ClientProtocolException, IOException {
		
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
			
			//if the url is returning response code = 200 then only allow click operation
			
			String url = footerlinks.get(i).getAttribute("href");
			boolean result = validateResponseCode(url);
			
			Assert.assertTrue(result, "Invalid Response Code");
			
			
			//click on each link
			footerlinks.get(i).click();
			System.out.println("The title of this page is : " + driver.getTitle());
			System.out.println("The response code for this particular webpage is : " + result);
			driver.get("https://cnn.com");
			Thread.sleep(1000);
			footerlinks = driver.findElements(By.xpath("//nav[@class = 'footer__links']/a"));
			Thread.sleep(1000);
		}
		
	}
	
	
	public boolean validateResponseCode(String url) throws ClientProtocolException, IOException {
		//200 is the response code which is OK status (Success)
		
		int response_code = 0;
		response_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		
		if(response_code == 200) {
			return true;	
		}
		
		return false;
	}
	
	
	
	

}
