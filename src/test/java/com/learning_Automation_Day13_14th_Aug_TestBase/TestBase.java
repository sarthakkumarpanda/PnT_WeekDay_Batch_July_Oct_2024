package com.learning_Automation_Day13_14th_Aug_TestBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase { //this is acting as Parent class
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	
	public TestBase() throws Exception {
       prop = new Properties();
	   ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\learning_Automation_Day13_14th_Aug_TestBase\\config.properties");
	   prop.load(ip);	
	}
	
	
	public WebDriver initializeBrowserAndOpenApplication(String browserName) {
		
		if(browserName.equals(prop.getProperty("browser"))) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));	
		} else if(browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();	
		}else if(browserName.equals("Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();	
		}
		driver.get("https://tutorialsninja.com/demo");
		return driver;
	}

}
