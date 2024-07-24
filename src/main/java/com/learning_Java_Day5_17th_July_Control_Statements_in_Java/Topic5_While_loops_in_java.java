package com.learning_Java_Day5_17th_July_Control_Statements_in_Java;

public class Topic5_While_loops_in_java {
	// When do we use while loop in java programming
	// 1. When the end point is not clear [tends to infinity]

	// syntax of while loop
	// 1. initialize the variable
	// 2. while (condition) { }
	// 3. increment or decrement or apply some brakes

	public static void main(String[] args) {

		int i = 1;
		while (i > 0) {
			System.out.println("We are learning Java");
			break;
		}

		int j = 1;
		while (j <= 6) {
			System.out.println("the value of j is : " + j);
			j++;
		}

		// printNumbersFrom1to10UsingWhileLoop();
		// printFrom100to1InaReverseWay();
		//first20multiplesof5();
		first20multiplesof5AndSumOfThoseMultiples();
	}

	public static void printNumbersFrom1to10UsingWhileLoop() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void printFrom100to1InaReverseWay() {
		int i = 100;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}
	}

	public static void first20multiplesof5() {
		int i = 1;
		while (i <= 20) {
			System.out.println(i * 5);
			i++;
		}

	}
	
	public static void first20multiplesof5AndSumOfThoseMultiples() {
		//5, 10, 15,........100
		//5 + 10 + 15 + 20 +....+ 100 = sum ??
		int i = 1;
		int sum = 0;
		while(i<=20) {
			System.out.println(i*5);
			sum = sum + (i*5);
			i++;
			
			System.out.println("The step at this place addition value is :" + sum);
		}
		
		System.out.println("the total sum is : " + sum);
		
	}

}
