package com.learning_Java_Day14_20th_Aug_super_keyword;

public class Topic3_Parent {

	int a = 10;

	public Topic3_Parent() {
		System.out.println("This parent class constructor has a mathematical logic of addition of two numbers : " + (10 + 20));
	}
	
	public Topic3_Parent(String S1, String S2) {
		S1 = "Green";
		S2 = "Red";
		System.out.println(S1 + S2);
	}
	
	public void takeAway() {
		System.out.println("This is a method inside parent class constructor");
	}

}
