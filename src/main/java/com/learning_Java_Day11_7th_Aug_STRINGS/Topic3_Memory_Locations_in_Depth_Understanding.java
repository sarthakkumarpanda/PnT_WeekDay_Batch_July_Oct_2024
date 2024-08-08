package com.learning_Java_Day11_7th_Aug_STRINGS;

public class Topic3_Memory_Locations_in_Depth_Understanding {

	public static void main(String[] args) {
		
          // syntax of creating an object in java - 		
		//ClassName referencevariable = new ClassName();
		
		  String S1 = new String(); //1 object will be created in the heap memory
		  
		  String S2 = new String("Java"); //whenever new keyword is used - 1 object will be created in heap memory
		                                  //2nd object will be created inside the String Literal Pool memory
		  
		  String S3 = "Python"; //here 1 object will be directly created inside the SLP memory
		  
		  String S4 = "Java"; //object will not be created
		  
		  //Let's say you are working on a project. Creation of lot of String Objects
		  
		  String S10 = new String("email1"); //2 
		  String S11 = new String("password1"); //2 
		  String S200 = new String("email 210"); //2
		  
		  String S21 = "Email1"; //1
		  String S22 = "Password2"; //1
		  
		  
		  

	}

}
