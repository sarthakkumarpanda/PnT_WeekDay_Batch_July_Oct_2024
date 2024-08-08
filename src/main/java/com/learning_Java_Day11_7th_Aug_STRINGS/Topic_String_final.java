package com.learning_Java_Day11_7th_Aug_STRINGS;

public class Topic_String_final {

	public static void main(String[] args) {
		int i = 10;
		i = 11;
		System.out.println(i);
		
		final int j = 20;
		
		String S1 = new String("Apple");
		S1.concat("Mango");
		
		
		System.out.println(S1);
		
		S1 = S1.concat("Peanuts");
		System.out.println(S1);
	
		
		String Student1 = "Football";
		String Student2 = "Football";
		String Student3 = "Football";
		String Student4 = "Football";
		String Student5 = "Hockey";
		String Student6 = "Football";

	}

}
