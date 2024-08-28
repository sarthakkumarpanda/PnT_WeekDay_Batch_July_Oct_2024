package com.learning_Java_Day16_27th_Aug_Encapsulation;

public class Student_Execution_OutsideEntity {
	
	public static void main(String[] args) {
		
		
		Student_EnclosedEntity student = new Student_EnclosedEntity();
		
		student.setData("Tom", 10, 4.9);
		
		System.out.println(student.getNameOfStudent());
		System.out.println(student.getAgeofStudent());
		System.out.println(student.getHeightofStudent());
	}

}
