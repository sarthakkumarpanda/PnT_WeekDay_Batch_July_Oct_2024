package com.learning_Java_Day12_13th_Aug_OOPs_Classes_And_Objects;

public class Topic5_What_is_static {
	
	static int age;
	static String name;
	String sport;

	public static void main(String[] args) {
		addition1(100, 200);
		Topic5_What_is_static.age = 30;
		Topic5_What_is_static.name = "Tom";
		Topic5_What_is_static.addition1(500, 1000);
		//Topic5_What_is_static.logicSense(); //static can only call static. Static is nothing but property of the class
		//logicSense();
		//fine then what is non-static? Non static is nothing but Object's property
		
		//Topic5_What_is_static.sport = "Football";
	}
	
	
	public static void addition1(int a, int b) {
		System.out.println("The sum of two numbers is : " + (a+b));
	}
	
	public void logicSense() {
		System.out.println("The Grass is Green");
		//ok static cannot call non-static
		//can non-static call static ?? YES. Non-static can call static
		//Non-static can also call non-static
		addition1(25, 25);
		
	}

}
