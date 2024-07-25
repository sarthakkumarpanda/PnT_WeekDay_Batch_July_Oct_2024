package com.learning_Java_Day7_24th_July_For_Loops;

public class Topic5_Pattern3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
