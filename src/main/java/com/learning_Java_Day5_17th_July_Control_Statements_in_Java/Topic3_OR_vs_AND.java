package com.learning_Java_Day5_17th_July_Control_Statements_in_Java;

public class Topic3_OR_vs_AND {
	
	public static void main(String[] args) {
		// OR means you have an option. This or that
		//AND means both or more have to be taken into consideration
		
		
		int i=1;
		int j=2;
		int k=3;
//           true	            OR          false          =   true
		if((i<j    &&    i<k)   ||    (j>k    &&    j<i)) {
			System.out.println("Hello World");
		}
		
//		    true               AND           false        = false
		if((i<j    &&    i<k)   &&    (j>k    &&    j<i)) {
			System.out.println("Bye World");
		}
	}

}
