package com.learning_Java_Day3_10th_July_BasicsOfJava;

public class Topic4_Concatenation_Operators {
	//Concatenation = joining
	// + symbol is known as concatenation operator

	public static void main(String[] args) {
		
		int age = 30;
		int rollNumber = 45;
		
		System.out.println(age + rollNumber);
		
		int i = 10;
		int j = 20;
		String S1 = "Tom";
		String S2 = "Bobby";
		
		System.out.println(i+j+S1+S2); // 10+20+Tom+Bobby = 30TomBobby
		
		System.out.println(S1+S2+i+j);
		System.out.println(S1+S2+(i+j));
		
		
		

	}

}
