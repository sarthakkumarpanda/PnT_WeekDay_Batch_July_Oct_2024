package com.learning_Java_Day16_27th_Aug_ExceptionHandling;

public class Topic7_finally_Block {

	public static void main(String[] args) {
		
		example1();
	}
	
	
	public static void example1() {
		try {
			int a=10, b=0;
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				int j = 1, k = 0;
				int l = j/k;
				System.out.println(l);
				System.out.println("I want this to be printed no matter what");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("there is exception inside finally block");
			}
		}
	}

}
