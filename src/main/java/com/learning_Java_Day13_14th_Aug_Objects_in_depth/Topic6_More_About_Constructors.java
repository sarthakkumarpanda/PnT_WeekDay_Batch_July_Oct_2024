package com.learning_Java_Day13_14th_Aug_Objects_in_depth;

public class Topic6_More_About_Constructors {
	
	String model;
	String color;

	public static void main(String[] args) {
		Topic6_More_About_Constructors ref1 = new Topic6_More_About_Constructors();
		
		Topic6_More_About_Constructors ref2 = new Topic6_More_About_Constructors("BMW", "white");
		ref2.displayInfoOfCar();
	}
	
	//types of constructors
	
	//default constructors
	public Topic6_More_About_Constructors() {
		//this is a default constructor which does not take any arguments
		//technically if the programmer does not define a constructor, java compiler will automatically provide a default constructor	
	}
	
	//parameterized constructors
	public Topic6_More_About_Constructors(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void displayInfoOfCar() {
		System.out.println("the model of the car is : " + model + " , the color of the car is : " + color);
	}
	


}
