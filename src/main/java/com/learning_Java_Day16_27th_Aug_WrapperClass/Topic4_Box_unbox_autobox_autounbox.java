package com.learning_Java_Day16_27th_Aug_WrapperClass;

public class Topic4_Box_unbox_autobox_autounbox {
	
	//Boxing - Conversion of primitive data type to Wrapper Class Object
	//Unboxing - Conversion of Wrapper Class Object to primitive data type

	public static void main(String[] args) {
	
		boxingExample();
		autoboxingExample();
		unboxingExample();
		autounboxingExample();
	}
	
	
	public static void boxingExample() {
		int a = 10;
		Integer b = Integer.valueOf(a);
		System.out.println(b);
	}
	
	public static void autoboxingExample() {
		int a = 10;
		Integer b = a;
		System.out.println(b);	
	}
	
	public static void unboxingExample() {
		Integer result = 100;
		int newResult = result.intValue();
		System.out.println("The primitive data type value is : " + newResult);
	}
	
	public static void autounboxingExample() {
		Integer result = 100;
		int newResult = result;
		System.out.println("The primitive data type value is : " + newResult);
	}

}
