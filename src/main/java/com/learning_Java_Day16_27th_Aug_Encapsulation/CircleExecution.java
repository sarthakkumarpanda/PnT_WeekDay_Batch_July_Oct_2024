package com.learning_Java_Day16_27th_Aug_Encapsulation;

class CircleExecution {
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.setAreaOfCircle(20, 3.141);
		System.out.println(circle.getAreaOfCircle());
	}
}