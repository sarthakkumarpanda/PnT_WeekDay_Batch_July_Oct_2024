package com.learning_Java_Day16_27th_Aug_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Topic3_Compile_vs_RunTime_Exceptions {
	
	//What are compile(checked) Exceptions?
	//These are the exceptions which can be handled or warned by the compiler at compile time before execution
	
	
	//What are runtime(unchecked) Exceptions?
	//Exceptions which cannot be handled by the compiler at the compilation

	public static void main(String[] args) {
	

	}
	
	
	public static void filePresentOrNot() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\PnT Batch\\index.txt");
	}
	
	public static void anotherExampleOfRunTimeException() {
		int a = 10, b = 0;
		int c = a/b;
		System.out.println(c);
	}
	
	
	public static void exampleOfRunTimeException() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5/0);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
	}

}
