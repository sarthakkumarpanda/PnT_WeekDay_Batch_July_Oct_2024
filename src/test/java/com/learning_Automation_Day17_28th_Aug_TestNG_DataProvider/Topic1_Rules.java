package com.learning_Automation_Day17_28th_Aug_TestNG_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Topic1_Rules {
	
	//@DataProvider
	
	//Rule 1- It will return a 2-D Object Array
	//Rule 2- Pass the data in rows and cols of this 2-D Array
	//Rule 3- Connect the @Test case with the @DataProvider in 2 ways
	//          1st way - By providing a TestNG annotation known as dataProvider = nameOfTheMethod inside the @DataProvider
	//          2nd way - By passing a TestNG annotation known as name = nameOfTheMethod inside the @DataProvider
	//Rule 4 - Need to parameterize the method in @Test with all the cols declared in the 2-D Array
	
	@Test(dataProvider = "getData")
	public void checkResult(String username, String password, int mobileNumber, String browser) {
		System.out.println(username + "----" + password + "-----" + mobileNumber + "----" + browser);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		//Step 1 - Create a 2-D Object Array
		Object[][] data = new Object[3][4];
		
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = 987654321;
		data[0][3] = "chrome";
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = 987654322;
		data[1][3] = "firefox";
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = 987654323;
		data[2][3] = "edge";
		
		return data;
	}

}
