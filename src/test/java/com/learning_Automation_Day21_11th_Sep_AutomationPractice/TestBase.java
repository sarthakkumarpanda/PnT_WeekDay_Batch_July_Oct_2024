package com.learning_Automation_Day21_11th_Sep_AutomationPractice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;
	public FileInputStream ip;
	public Properties prop;
	public ChromeOptions options;
	
	public TestBase() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\learning_Automation_Day21_11th_Sep_AutomationPractice\\config.properties");
		prop.load(ip);
	}
	
	public WebDriver initalizeBrowserAndOpenApplication(String browserName) {
		
		if(browserName.equals("chrome")) {
			options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);	
		}else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		driver.get("https://tutorialsninja.com/demo");
		
		return driver;
	}
}
