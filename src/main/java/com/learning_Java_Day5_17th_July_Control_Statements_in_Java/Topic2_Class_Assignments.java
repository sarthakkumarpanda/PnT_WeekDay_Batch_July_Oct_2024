package com.learning_Java_Day5_17th_July_Control_Statements_in_Java;

public class Topic2_Class_Assignments {

	public static void main(String[] args) {
		
		//greatestOfThreeNumbers();
		determineLeapYear();
	}
	
	public static void greatestOfThreeNumbers() {
		int i = 1;
		int j = 2;
		int k = 3;
		
		if(i>j && i>k) {
			System.out.println("i is the greatest : " + i);
		}else if (j>i && j>k) {
			System.out.println("j is the greatest : " + j);
		}else {
			System.out.println("k is the greatest : " + k);
		}
	}
	
	public static void determineLeapYearUsingNestedIf() {
		int year1 = 1996;
		int year2 = 2000;
	}
	
	
	
	public static void determineLeapYear() {
		int year1 = 1900;
		int year2 = 1996;
		int year3 = 2002;
		int year4 = 2000;
		
		//Logic of a leap year
		
		//divided by 400
		
//		 OR
		 
		//divided by 4 but not divided by 100
		
		// if a year is exactly divisible by 400 then it is definitely a leap year
		// if a year is exactly divisible by 4 then it can be a leap year but that same year should not be divisible by 100
	
		if((year1 % 400 == 0) || (year1%4 == 0 && year1%100 !=0)) {
			System.out.println("year1 is a leap year : " + year1);
		}else {
			System.out.println("year1 is not a leap year");
		}
		
		if((year2 % 400 == 0) || (year2%4 == 0 && year2%100 !=0)) {
			System.out.println("year2 is a leap year : " + year2);
		}else {
			System.out.println("year2 is not a leap year");
		}
		
		if((year3 % 400 == 0) || (year3%4 == 0 && year3%100 !=0)) {
			System.out.println("year3 is a leap year : " + year3);
		}else {
			System.out.println("year3 is not a leap year");
		}
		
		if((year4 % 400 == 0) || (year4%4 == 0 && year4%100 !=0)) {
			System.out.println("year4 is a leap year : " + year4);
		}else {
			System.out.println("year4 is not a leap year");
		}
		
		
		
	}

}
