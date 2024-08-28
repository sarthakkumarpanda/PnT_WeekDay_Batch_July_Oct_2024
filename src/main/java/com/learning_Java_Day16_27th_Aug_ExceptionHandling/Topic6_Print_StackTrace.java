package com.learning_Java_Day16_27th_Aug_ExceptionHandling;

public class Topic6_Print_StackTrace {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			System.out.println(e);           //Name of the Exception / Description of Exception
			System.out.println(e.toString());//Name of the Exception / Description of Exception
			System.out.println(e.getMessage()); //Description
			e.printStackTrace();
		}
	

	}

}
