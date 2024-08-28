package com.learning_Java_Day16_27th_Aug_Encapsulation;

public class Circle {
	
	private double radius;
	private double pivalue;
	
	//get me the area of the circle
	//pi*r*r
	
	public void setAreaOfCircle(double radius, double pivalue) {
		this.radius = radius;
		this.pivalue = pivalue;
	}
	
	
	public double getAreaOfCircle() {
		double area = pivalue * (radius * radius);
		System.out.println("The area of the circle is : " + area);
		return area;
	}

}


