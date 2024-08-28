package com.learning_Java_Day16_27th_Aug_Encapsulation;

public class Student_EnclosedEntity {
	
	private String name;
	private int age;
	private double height;
	
	public void setData(String name, int age, double height) {
		this.name = name;
	    this.age = age;
	    this.height = height;
	}
	
	public String getNameOfStudent() {
		return name;
	}
	
	public int getAgeofStudent() {
		return age;
	}
	
	public double getHeightofStudent() {
		return height;
	}

}
