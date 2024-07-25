package com.learning_Java_Day7_24th_July_For_Loops;

public class Topic2_Nested_For_Loop {
	// For loop inside for loop
	// outer for loop
	// inner for loop
	// for every 1 iteration of the outer for loop, inner for loop executes for all
	// the iterations

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("This is the outer for loop");

			for (int j = 1; j <= 5; j++) {
				System.out.println("This is the inner for loop");
			}

		}

	}

}
