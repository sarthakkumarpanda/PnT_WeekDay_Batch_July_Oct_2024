package com.learning_Java_Day5_17th_July_Control_Statements_in_Java;

public class Topic4_Nested_If {

	// nested if is if loop inside if loop

	public static void main(String[] args) {

		if (true == true) {

			                 if (45 == 45) {
				                    System.out.println("The Sky is Blue");
			                  }

			System.out.println("The Rose is Red");
		}
		
		
		if (true != true) {

            if (45 != 45) {
                   System.out.println("Hello World");
                      }

              System.out.println("Learning Java");
       }

	}

}
