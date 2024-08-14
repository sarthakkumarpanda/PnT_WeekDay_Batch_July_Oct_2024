package com.learning_Java_Day12_13th_Aug_OOPs_Classes_And_Objects;

public class Topic5_Define_Objects {
	// Object - is the collection of all the non-static entities of the class
	//Object - is instance of a Class

	String name;
	static int age;

	public static void main(String[] args) {
		test1();
		Topic5_Define_Objects.age = 10;
		//we have to create Object of this class
		
		Topic5_Define_Objects reference = new Topic5_Define_Objects();
		reference.test2();
		reference.name = "Rahul";	
	}

	public static void test1() {
		System.out.println("This is test1 static method");
	}

	public void test2() {
		System.out.println("This is test2 non-static method");
	}

}
