package com.learning_Automation_Day7_24th_July_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic1_What_is_xpath {
	
	//What is Xpath
	//Address of a WebElement 
	
	//xpath is basically divided into 2 types
	
	//1. Absolute xpath
	//2. Relative xpath/ Dynamic/Customized
	//which one is more accurate - Absolute xpath is more accurate
	//which xpath is recommended to be used in Automation code - Relative xpath
	//SelectorHub - this is a tool 

	public static void main(String[] args) {
		
		understandingAbsoluteXpath();

	}
	
	public static void understandingRelativeXpath() {
		//There are 8 different forms(syntaxes) which are important to remember
		
		//Syntax 1:
		
		//html[@attribute = 'value']
		
		//Xpath Assignment
		
		//emailtextbox -  //input[@id = 'input-email']
		//passwordtextbox - //input[@id = 'input-password']
		//loginbutton - //input[@class = 'btn btn-primary']
		
		//firstname - //input[@id = 'input-firstname']
		//lastname -  //input[@id = 'input-lastname']
		//email -  //input[@id = 'input-email']
		//telephone - //input[@id = 'input-telephone']
		//password - //input[@id = 'input-password']
		//confirmpassword - //input[@id = 'input-confirm']
		//privacypolicycheckbox - //input[@name = 'agree']
		//continue - //input[@class = 'btn btn-primary']
		
	
	}
	
	
	
	
	
	
	
	
	
	public static void understandingAbsoluteXpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	
	
	

}
