package com.learning_Java_Day13_14th_Aug_Polymorphism;

public class Topic6_Student_Child extends Topic5_School_Parent{
	
	//How to achieve method overriding
	//Rule 1: Method name should be same
	//Rule 2: Class has to be different
	//Rule 3: Parameters/arguments should be the same
    //Rule 4: Inheritance has to be there

	public static void main(String[] args) {
		Topic6_Student_Child child = new Topic6_Student_Child();
		child.education();
		child.mandatoryFee(100);
		child.annualFunction("Halloween", "Diwali", "Prom Night");

	}
	
	//access modifier of the over-ridden method inside the child class should be equal or higher than the Parent class
	
	public void education() {
		System.out.println("Student's education");
	}

	public void mandatoryFee(int fee) {
		System.out.println("Student's mandatory fee");
	}
}
