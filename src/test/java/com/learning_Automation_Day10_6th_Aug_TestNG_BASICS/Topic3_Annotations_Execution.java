package com.learning_Automation_Day10_6th_Aug_TestNG_BASICS;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Topic3_Annotations_Execution {
	
	@BeforeSuite        
	public void tryingCodeinBeforeSuite() {
		System.out.println("This is Before Suite and it will execute first");	
	}
	
	@BeforeTest
	public void tryingCodeinBeforeTest() {
		System.out.println("This is Before Test and it will execute second");	
	}
	
	@BeforeClass
	public void tryingCodeinBeforeClass() {
		System.out.println("This is Before Class and it will execute third");
	}
	
	@BeforeMethod
	public void tryingCodeinBeforeMethod() {
		System.out.println("This is Before Method and it will execute fourth");
	}
	
	@Test
	public void testCase1() {
		System.out.println("This is Login Test");
	}
	
	@AfterMethod
	public void tryingCodeinAfterMethod() {
		System.out.println("This is After Method and it will execute after Test Case");
	}
	
	@AfterClass
	public void tryingCodeinAfterClass() {
		System.out.println("This is After Class and it will execute after AfterMethod");
	}
	
	@AfterTest
	public void tryingCodeinAfterTest() {
		System.out.println("This is After Test and it will execute after AfterClass");
	}
	
	@AfterSuite
	public void tryingCodeinAfterSuite() {
		System.out.println("This  will be executed in the last");
	}

}
