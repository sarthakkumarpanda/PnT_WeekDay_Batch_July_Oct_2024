package com.learning_Automation_Day10_6th_Aug_TestNG_BASICS;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic5_TriCombo {
	
	@BeforeMethod
	public void setup() {
		System.out.println("Call the browser, maximize the browser, open the url, clear all the cookies");
	}
	
	
	@Test
	public void testCase1() {
	System.out.println("Login Test");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Register Test");
	}
	
	@Test
	public void testCase3() {
		System.out.println("SearchProduct Test");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Quit the browser");
	}

}
