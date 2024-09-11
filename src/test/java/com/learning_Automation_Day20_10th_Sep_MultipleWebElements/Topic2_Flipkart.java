package com.learning_Automation_Day20_10th_Sep_MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic2_Flipkart {

	//go to men's fashion
	
	//name of the brand
	//what kind of t shirt it is
	//price
	//discount percentage
	
	public WebDriver driver;
	
	@Test
	public void flipkartMensFashion() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&fm=neo%2Fmerchandising&iid=M_5430f50b-b7d1-4f5e-85f8-0d1b0aa8831f_1_372UD5BXDFYS_MC.IF56C41VGEYS&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%27s%2BTop%2BWear~Men%27s%2BT-Shirts_IF56C41VGEYS&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=IF56C41VGEYS");
	    
		List<WebElement> names = driver.findElements(By.className("syl9yP"));
		List<WebElement> prices = driver.findElements(By.className("Nx9bqj"));
		List<WebElement> discount = driver.findElements(By.className("UkUFwK"));
		
		for(int i=0 ; i<names.size() ; i++) {
			System.out.println(names.get(i).getText() + "-----" + prices.get(i).getText() + "-----" + discount.get(i).getText());
		}
		
	}
}
