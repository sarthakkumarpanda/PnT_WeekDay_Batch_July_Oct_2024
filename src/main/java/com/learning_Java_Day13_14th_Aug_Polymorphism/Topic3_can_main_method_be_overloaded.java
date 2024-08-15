package com.learning_Java_Day13_14th_Aug_Polymorphism;

public class Topic3_can_main_method_be_overloaded {

	public static void main(String[] args) {
		main(10, 20);
		main(args = new String[3], args = new String[4]);
	}

	public static void main(String[] args1, String[] args2) {
		System.out.println("This is the main method being overloaded with 2 String arrays as arguments");
	}

	public static void main(int i, int j) {
		int k = i + j;
		System.out.println(k);
	}

}
