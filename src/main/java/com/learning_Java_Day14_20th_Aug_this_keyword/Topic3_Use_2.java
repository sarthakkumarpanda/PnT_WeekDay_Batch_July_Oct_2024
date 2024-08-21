package com.learning_Java_Day14_20th_Aug_this_keyword;

public class Topic3_Use_2 {
	
	//Use 2: can be used to invoke current class method(implicitly)
	
	public static void main(String[] args) {
		Topic3_Use_2 ref = new Topic3_Use_2();
		ref.show();
	}
	
	
	void display() {
		System.out.println("Hello World");
	}
	
	void show() {
		this.display();
	}

}
