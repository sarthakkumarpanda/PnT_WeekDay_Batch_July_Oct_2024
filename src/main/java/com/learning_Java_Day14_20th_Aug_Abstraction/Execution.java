package com.learning_Java_Day14_20th_Aug_Abstraction;

public class Execution extends Student{
	
	public static void main(String[] args) {
		Execution execution = new Execution(); //Child class is referring it's own object
		execution.studentChangeRoom();
		execution.studentMarksheet();
		
		Student student = new Execution(); //Parent class is referring to Clild class Object
		student.studentLibrary();
		student.studentCanteen();
		
		
	}

	@Override
	public void studentMarksheet() {
		System.out.println("Unimplemnted method is implemented here");
		
	}

	@Override
	public void studentChangeRoom() {
		System.out.println("Unimplemnted method is implemented here again ");
		
	}

}
