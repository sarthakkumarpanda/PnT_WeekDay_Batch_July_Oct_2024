package com.learning_Java_Day13_14th_Aug_Objects_in_depth;

public class Topic5_Constructors {

	// Constructors initialize Object
	// Constructors will never create Object
	// Constructors help in optimizing code
	// All the access modifiers will work while designing constructors
	// Constructors are invoked by default when an object is created
	// Constructors do not have a return type not even void
	// Constructor is a block. It looks like a method but it is not a method

	String firstName; // what is the default value of a String ?? null
	String lastName;
	int age; // what is the default value of an int? 0
	int grade;
	int marks;
	boolean graduation; // what is the default value of boolean? false
	
	//5000 students per semester
	//30 entries
	//total entries = 5000*30 = 150000 lines of code
	//total 5000 objects
	
	//150030 lines of code
	
	 
	  
	  public Topic5_Constructors(String firstName, String lastName, int age, int grade, int marks, boolean graduation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.grade = grade;
		this.marks = marks;
		this.graduation = graduation;	
	} 
	

	public static void main(String[] args) {
	 
		Topic5_Constructors student1 = new Topic5_Constructors("Tom", "Alter", 2, 1, 100, true);
		System.out.println(student1.firstName + student1.lastName + student1.age + student1.grade + student1.marks + student1.graduation);
		
		Topic5_Constructors student2 = new Topic5_Constructors("Jack", "Sparrow", 2, 1, 100, true);
		System.out.println(student2.firstName + student2.lastName + student2.age + student2.grade + student2.marks + student2.graduation);

	}
	
	
	public static void crazyWay() {
		/* Topic5_Constructors student1 = new Topic5_Constructors();
        student1.firstName = "Tom";
        student1.lastName = "Alter";
        student1.age = 2;
        student1.grade = 1;
        student1.marks = 100;
        student1.graduation = true;
        
        Topic5_Constructors student2 = new Topic5_Constructors();
        student2.firstName = "Jack";
        student2.lastName = "Sparrow";
        student2.age = 2;
        student2.grade = 1;
        student2.marks = 100;
        student2.graduation = true; 
        */
	}

}
