package com.learning_Java_Day16_27th_Aug_ExceptionHandling;

public class Topic8_throw_keyword {
	
	//throw keyword is basically used for Customer/user-defined Exceptions
	//if there is a pre-defined Exception - please avoid using throw keyword

	public static void main(String[] args) {
		
		divideByZero();
	}
	
	
	public static void divideByZero() {
		int a=10, b=0;
		int c = a/b;
		System.out.println(c);
		throw new ArithmeticException(); //this has to be the last statement in a method
		// System.out.println("Hello World"); - unreachable code
	}

}
