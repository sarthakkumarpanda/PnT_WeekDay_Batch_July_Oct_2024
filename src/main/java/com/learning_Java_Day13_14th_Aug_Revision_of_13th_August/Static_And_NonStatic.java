package com.learning_Java_Day13_14th_Aug_Revision_of_13th_August;

public class Static_And_NonStatic {

	public static void main(String[] args) {
		//main method is the most powerful method in java
		//why is the main method static? why it cannot be non-static ??
		
		//Created 25 packages and there are 4 classes in each package
		//Created 1 package with 1 Class that has the main method
		//
		
		
		
		Logic1.mathematicalAddition();
		Logic2.colorOfGrass();
		
		Logic2 logic2 = new Logic2();
		logic2.printNameOfCandidate();

	}
	
	//when we write code, we will create lot of packages, we will create lot of Classes in those packages
	//We will write the main method in one Class
	//Other classes will have methods that will have logic in them
	//Class with the main method will call other methods inside different classes and all of them will get executed in the main method

}
