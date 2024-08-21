package com.learning_Java_Day14_20th_Aug_Abstraction;

public abstract class Student {
	
	public abstract void studentMarksheet();
	//A method without a body is known as undefined, unimplemented or an abstract method
	
	//can I make an abstract method static ?
	public abstract void studentChangeRoom();
	
	
	public void studentLibrary() {
		System.out.println("This a concrete method");
	}
	
	public static void studentCanteen() {
		System.out.println("This is a static method inside the abstract class");
	}

}
