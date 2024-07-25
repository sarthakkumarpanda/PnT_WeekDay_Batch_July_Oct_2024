package com.learning_Java_Day7_24th_July_For_Loops;

public class Topic1_What_is_For_Loop {

	public static void main(String[] args) {
		
		/*
		 * for(initialization ; condition ; increment/decrement) { //logic }
		 */
		
		
		//program to print first 10 natural numbers using for loop
		
		//first number is 1
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.print(i + " "); //1 2 3
		}
		
		System.out.println();
		
		//WAP to print first 10 multiples of 2 using for loop
		//2, 4, 6,..........,20
		for(int i=1 ; i<=10 ; i++) {
			System.out.print(2*i + " ");
		}
		
		//100 95 90....................5 - 20 multiples of 5 but in a decreasing way
		System.out.println();
		
		for(int i=20 ; i>=1 ; i--) {
			System.out.print(5*i + " ");
		}
		
		System.out.println();
		
		for(int i=100 ; i>=1 ; i=i-5) {
			System.out.print(1*i + " ");
		}
		
		System.out.println();
		
		//100000,99995, 99990....................................2025
		/*
		 * for(int i=100000 ; i>=2025 ; i=i-5) { System.out.print(i + " "); }
		 */
		//WAP to print first 100 multiples of 2 and print the sum of those multiples
		// 2, 4, 6,..........................................., 200
		//sum = 2 + 4 + 6 +..........................+ 200 = ????
		
	
		int sum=0;
		for(int i=1 ; i<=100 ; i++) {
			System.out.print(i*2 + " ");
			sum = sum + 2*i;
		}
		System.out.println();
		System.out.println("Total sum is : " + sum);
		
		

	}

}
