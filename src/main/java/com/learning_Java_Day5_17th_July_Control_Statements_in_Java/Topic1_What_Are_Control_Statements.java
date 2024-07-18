package com.learning_Java_Day5_17th_July_Control_Statements_in_Java;

public class Topic1_What_Are_Control_Statements {

	// There are 3 types of control statements in java

	// 1. Selection or Conditional Statement
	// 2. Iteration or Looping Statement
	// 3. Jump Statement

	public static void main(String[] args) {
		conditionalStatement();

	}

	public static void conditionalStatement() {
		// if
		if (true != false) {
			System.out.println("The Sky is blue");
		}

		// if else
		if(2 < 1) {
			System.out.println("The Rose is Red");
		}else {
			System.out.println("The Grass is Green");
		}
		// if else if
		
		if(true != true) {
			System.out.println("A is the first alphabet");
		}else if(false != false) {
			System.out.println("B is the 2nd alphabet");
		}else {
			System.out.println("C is the 3rd");
		}
		
		//WAP to print the highest of 3 numbers
		
		// nested if
		// switch
	}

	public static void loopingStatement() {
		
		// while
		// for
		//advanced for - for each loop
		// do while
	}

	public static void jumpStatement() {
		// break, continue, return
	}

}
