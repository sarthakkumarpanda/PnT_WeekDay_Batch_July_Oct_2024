package com.learning_Java_Day14_20th_Aug_this_keyword;

public class Topic4_Use_3 {

	// Use 3: this() can be used to invoke current class constructor

	public static void main(String[] args) {
		Topic4_Use_3 ref = new Topic4_Use_3();
		Topic4_Use_3 ref2 = new Topic4_Use_3(100);
		Topic4_Use_3 ref3 = new Topic4_Use_3(100, 200);
	}

	public Topic4_Use_3() {
		
		System.out.println("This is the current class constructor");
		
	}
	
	public Topic4_Use_3(int i) {
		this();
		System.out.println("Parameterized Constructor");
	}
	
	public Topic4_Use_3(int i, int j) {
		this(2);
		System.out.println("I want this constructor too which has two parameters");
	}
}
