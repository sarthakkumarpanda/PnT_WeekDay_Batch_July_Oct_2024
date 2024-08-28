package com.learning_Java_Day16_27th_Aug_ScannerClass;

import java.util.Scanner;

public class Concepts {
	//Scanner is pre-defined class in java
	//It takes user input
	//Scanner class - it has a lot of inbuilt methods - next(), nextInt(), nextLong() - you can method chaining

	public static void main(String[] args) {
		
		//Step 1: Create the object of Scanner Class and pass System.in as the input parameter in the constructor
		
		Scanner scan = new Scanner(System.in); //in represents input
		
		//String
		System.out.println("Enter your name : ");
		String name = scan.next();
		
		//Gender - M or F or male or female
		System.out.println("Enter your gender : ");
		char gender = scan.next().charAt(0);
		
		//Age - store as an int
		System.out.println("Enter your age : ");
		int age = scan.nextInt();
		
		//SSN - last 4 digits of SSN
		System.out.println("Enter last four digits of SSN : ");
		int SSN = scan.nextInt();
		
		//MobileNumber
		System.out.println("Enter your contact number");
		long contact = scan.nextLong();
		
		
		System.out.println("The name of the person is : " + name);
		System.out.println("The gender of the person is : " + gender);
		System.out.println("The age of the person is : " + age);
		System.out.println("The last 4 digits of SSN is : " + SSN);
		System.out.println("The contact number of the person is : " + contact);
	

	}

}
