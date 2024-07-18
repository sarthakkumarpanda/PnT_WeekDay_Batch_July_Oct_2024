package com.learning_Java_Day5_17th_July_Control_Statements_in_Java;

public class Topic5_While_loops_in_java {
	//When do we use while loop in java programming
	//1. When the end point is not clear [tends to infinity]
	
	//syntax of while loop
	//1. initialize the variable
	//2. while (condition) {   }
	//3. increment or decrement or apply some brakes
	
	public static void main(String[] args) {
		
		int i = 1;
		while(i > 0) {
			System.out.println("We are learning Java");
			break;
		}
		
		int j = 1;
		while(j<=6) {
			System.out.println("the value of j is : " +  j);
			j++;
		}
		
		

	}

}
