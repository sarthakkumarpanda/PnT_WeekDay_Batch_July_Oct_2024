package com.learning_Automation_Day11_7th_Aug_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Topic4_SoftAssert_vs_HardAssert {
	
	@Test
	public void AssertWay() {
		int i = 20;
		int j = 30;
		Assert.assertTrue(i == j); //it fails here, it will not let u execute other lines of code in the same method
		System.out.println("The Sky is BLUE");
		System.out.println("The Rose is RED");
	}
	
	@Test
	public void softAssertWay() {
		SoftAssert softassert = new SoftAssert();
		int i = 20;
		int j = 30;
		softassert.assertTrue(i == j); //fail
		System.out.println("The Sky is BLUE");
		System.out.println("The Rose is RED");
		String S1 = "JAVA";
		String S2 = "PYTHON";
		softassert.assertTrue(S1.equals(S2)); //fail
		System.out.println("The coal is BLACK");
		
		softassert.assertAll(); //this should be the last statement of that method and above all the assertions should be mentioned
		
	}

}
