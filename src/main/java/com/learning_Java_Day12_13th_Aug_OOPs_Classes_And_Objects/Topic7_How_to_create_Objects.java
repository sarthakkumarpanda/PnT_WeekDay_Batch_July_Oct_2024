package com.learning_Java_Day12_13th_Aug_OOPs_Classes_And_Objects;

public class Topic7_How_to_create_Objects {
	//1. new keyword[99.99% to create object]
	//2. newInstance() method
	//3. clone() method
	//4. Deserialization
	//5. factory methods
	
	String name;
	int age;
	double height;
	int rollNumber;

	public static void main(String[] args) {
		Topic7_How_to_create_Objects ref1 = new Topic7_How_to_create_Objects();
		Topic7_How_to_create_Objects ref2 = new Topic7_How_to_create_Objects();
		Topic7_How_to_create_Objects ref3 = new Topic7_How_to_create_Objects();
		
		ref1.name = "Rahul";
		ref1.age = 5;
		ref1.height = 100;
		ref1.rollNumber = 1;
		
		ref2.name = "Tom";
		ref2.age = 6;
		ref2.height = 101;
		ref2.rollNumber = 2;
		
		ref3.name = "Harry";
		ref3.age = 7;
		ref3.height = 102;
		ref3.rollNumber = 3;
		
		ref1.test();

	}
	
	public void test() {
		System.out.println("Learning Objects in java");
	}

}
