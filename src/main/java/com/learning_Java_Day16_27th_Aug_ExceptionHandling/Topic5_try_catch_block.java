package com.learning_Java_Day16_27th_Aug_ExceptionHandling;

public class Topic5_try_catch_block {

	public static void main(String[] args) {
		
		example2();
		
		//multiple try catch blocks
	}
	
	
	public static void example2() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);

	}
	
	
	public static void example1() {
		try {
			int a=10, b=0;
			int c = a/b; //risky code
			System.out.println(c);
			System.out.println("The Grass is Green");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("This exception is being handled");
		System.out.println(10 + 20);
	}

}
