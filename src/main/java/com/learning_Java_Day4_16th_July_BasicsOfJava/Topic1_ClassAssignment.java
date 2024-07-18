package com.learning_Java_Day4_16th_July_BasicsOfJava;

public class Topic1_ClassAssignment {
	
	//Create a new package and create a Class inside the package
	//Do not forget to include the main method inside the class
	//Create a new method in which you need to add 4 numbers
	//Create another method in which you need to print multiplication of 3 numbers
	//Create another method in which you need to print The Sky is Blue
	//                                                 The Grass is Green The Roses are Red
	
	//Make sure you call the methods in the main method and execute it

	public static void main(String[] args) {
		add4Numbers();
		multiply3Numbers();
		printStatements();

	}
	
	
	public static void add4Numbers() {
		int i=1;
		int j=2;
		int k=3;
		int l=4;
		System.out.println("The sum of four numbers are : " + (i+j+k+l) );
	}
	
	public static void multiply3Numbers() {
		int i=1;
		int j=2;
		int k=3;
		System.out.println("The multiplication value of three numbers are : " + (i*j*k));
	}
	
	public static void printStatements() {
		System.out.println("The Sky is Blue");
		System.out.print("The Grass is Green ");
		System.out.println("The Roses are Red");
	}

}
