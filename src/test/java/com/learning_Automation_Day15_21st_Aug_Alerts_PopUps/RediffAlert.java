package com.learning_Automation_Day15_21st_Aug_Alerts_PopUps;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RediffAlert {
	
	public WebDriver driver;
	
	@Test
	public void handlingAlert() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("signinbtn")).click();
		
		Alert alert = driver.switchTo().alert(); //Alert is an interface.
		
		//alert.dismiss(); //in case there is a close(x) button then you can dismiss
		alert.accept(); 
		String text = alert.getText(); //gives what is written inside the Alert
		System.out.println("The text inside the alert is : " + text);
		
	}

}
