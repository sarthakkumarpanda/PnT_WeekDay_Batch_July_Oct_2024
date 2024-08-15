package com.learning_Java_Day13_14th_Aug_Polymorphism;

public class Topic2_Method_Overloading {
	
	//How to achieve method overloading
	//Rule 1: Method name should be same
	//Rule 2: Class name should be same
	//Rule 3: Parameters/arguments should be different

	public static void main(String[] args) {
		Topic2_Method_Overloading ref = new Topic2_Method_Overloading();
		ref.name();
		ref.name(10);
		ref.name("Hello");
		ref.name("Hello", "World");

	}
	
	
	public void name() {
		System.out.println("this is a no argument method");
	}
	
	public void name(String S1) {
		System.out.println("This is a single argument method");
	}
	
	public void name(String S1, String S2) {
		System.out.println("This is a two arguments method");
	}
	
	public void name(int i) {
		System.out.println("This is a single argument method but int parameter/argument");
	}

}
