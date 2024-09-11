package com.learning_Automation_Day20_10th_Sep_MouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse {
	
	//ClickAndHold
	//ClickAndRelease
	//RightClick - ContextClick
	//BackClick
	//ForwardClick
	//DoubleClick
	//MoveToElement
	//MoveByOffset
	//DragAndDrop
	
	public WebDriver driver;
	
	@Test
	public void mouseOperations() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");
		
		//Step 1 - Create the object of Actions Class
		Actions actions = new Actions(driver);
		
		//Step 2 - Move your mouse and hover over the Login Or Signup button
		WebElement loginOrSignUpButton = driver.findElement(By.cssSelector("a._btnclick > span"));
		actions.moveToElement(loginOrSignUpButton).build().perform();
		
		//Step 3 - Click on Login option
		WebElement loginOption = driver.findElement(By.id("shwlogn"));
		actions.moveToElement(loginOption).click().build().perform();
		
	}
	
	@Test
	public void dragAndDropOperation() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		Actions actions = new Actions(driver);
		
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames is : " + totalFrames.size());
		
		driver.switchTo().frame(0);
		WebElement dragElement = driver.findElement(By.id("draggable"));
		
		
		WebElement dropElement = driver.findElement(By.id("droppable"));
		
		
		
		actions.dragAndDrop(dragElement, dropElement).build().perform();
		
		
		//actions.dragAndDropBy(dragElement, 400, 100).build().perform();
		
		
	}

}
