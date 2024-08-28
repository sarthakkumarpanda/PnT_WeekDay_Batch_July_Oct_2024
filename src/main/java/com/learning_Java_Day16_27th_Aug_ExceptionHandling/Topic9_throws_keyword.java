package com.learning_Java_Day16_27th_Aug_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Topic9_throws_keyword {
	//

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			filePresentOrNot();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //main method is acting as the caller method
		//main method is calling a method which has exception in it
		
		//so now it is the responsibility of the caller method to handle the exception
		
		dividebyZero();
		divideByZeroAgain();
	}
	
	
	
	public static void filePresentOrNot() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\PnT Batch\\index.txt");
		//code to read the file
		//code to write into the file
	}
	
	public static void dividebyZero() throws FileNotFoundException{
		try {
			int i=1;
			System.out.println(i/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void divideByZeroAgain() throws ArithmeticException {
		int a = 10, b=0;
		int c = a/b;
		System.out.println(c);
	}

}
