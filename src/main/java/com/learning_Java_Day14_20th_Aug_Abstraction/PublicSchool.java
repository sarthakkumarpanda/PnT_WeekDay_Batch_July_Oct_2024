package com.learning_Java_Day14_20th_Aug_Abstraction;

public class PublicSchool extends Student{ 	//can a normal/concrete extend an Abstract Class - YES

	@Override
	public void studentMarksheet() {	
	System.out.println("Student's marksheet");	
	}

	@Override
	public void studentChangeRoom() {
		System.out.println("Student's changeroom");		
	}
	
	//can the child class have its own methods
	
	public void hallAssembly() {
		
	}
	
	
	public void publicSchoolPrayerHall() {
		
	}
	


}
