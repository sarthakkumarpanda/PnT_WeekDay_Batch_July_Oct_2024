package com.learning_Java_Day12_13th_Aug_OOPs_Classes_And_Objects;

public class Topic8_Calling_static_and_nonstatic_Entities {
	// static can call themselves directly or with the help of Class
	// static can call each other
	// static cannot call non-static
	// non-static can call each other
	// non-static can also call static entities
	// non static reference variable can call non-static entities
	// non static reference variable can also call static entities

	// Assignment
	// Create 5 static variables and 5 non-static variables
	// Create 3 static methods
	// Create 3 non-static methods
	// All the 3 non-static methods should be parameterized
	// Call all the static entities within the main method and use 1 static method to also call all the static entities
	// Create an Object of this class and using the object reference call all the non-static methods and variables
	// Use one non-static method to call all the static entities inside it

	static String firstname;
	static String lastname;
	static String email;
	static int telephoneNumber;
	static int age;

	String password;
	String confirmPassword;
	String accountPassword;
	int accountNumber;
	int OTP;

	public static void logic1() {
       System.out.println("This is static method logic1");
       logic2();
		logic3();
		Topic8_Calling_static_and_nonstatic_Entities.firstname = "Selenium";
		Topic8_Calling_static_and_nonstatic_Entities.lastname = "Panda";
		Topic8_Calling_static_and_nonstatic_Entities.email = "seleniumpanda@gmail.com";
		Topic8_Calling_static_and_nonstatic_Entities.telephoneNumber = 123456;
		Topic8_Calling_static_and_nonstatic_Entities.age = 20;
	}

	public static void logic2() {
		System.out.println("This is static method logic2");
	}

	public static void logic3() {
		System.out.println("This is static method logic3");
	}

	public void logic4(String password, String confirmPassword) {
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public void logic5(String password, String accountPassword) {
		this.password = password;
		this.accountPassword = accountPassword;
	}

	public void logic6(int accountNumber, int OTP) {
		this.accountNumber = accountNumber;
		this.OTP = OTP;
		logic1();
		logic2();
		logic3();
		Topic8_Calling_static_and_nonstatic_Entities.firstname = "Selenium";
		Topic8_Calling_static_and_nonstatic_Entities.lastname = "Panda";
		Topic8_Calling_static_and_nonstatic_Entities.email = "seleniumpanda@gmail.com";
		Topic8_Calling_static_and_nonstatic_Entities.telephoneNumber = 123456;
		Topic8_Calling_static_and_nonstatic_Entities.age = 20;
		
	}

	public static void main(String[] args) {
		logic1();
		logic2();
		logic3();
		Topic8_Calling_static_and_nonstatic_Entities.firstname = "Selenium";
		Topic8_Calling_static_and_nonstatic_Entities.lastname = "Panda";
		Topic8_Calling_static_and_nonstatic_Entities.email = "seleniumpanda@gmail.com";
		Topic8_Calling_static_and_nonstatic_Entities.telephoneNumber = 123456;
		Topic8_Calling_static_and_nonstatic_Entities.age = 20;
		
		Topic8_Calling_static_and_nonstatic_Entities ref = new Topic8_Calling_static_and_nonstatic_Entities();
		ref.logic4("Selenium@123", "Selenium@123");
		ref.logic5("Selenium@123", "Selenium@123456");
		ref.logic6(12345, 20);
		ref.password = "Selenium@123";
		ref.accountNumber = 123456789;
        ref.accountPassword = "Selenium@123456";
        ref.confirmPassword = "Selenium@123";
        ref.OTP = 1001;
	}

}
