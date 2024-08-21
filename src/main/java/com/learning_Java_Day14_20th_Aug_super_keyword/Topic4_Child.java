package com.learning_Java_Day14_20th_Aug_super_keyword;

public class Topic4_Child extends Topic3_Parent{
	
	    //1. super keyword is used to refer immediate parent class instance variable
		//2. to invoke immediate parent class method
		//3. super() can be used to invoke immediate parent class Constructor
	
	int i = 20;

	public static void main(String[] args) {
		
		Topic4_Child child = new Topic4_Child();
	}
	
	
	void show(int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.a);
	}
	
	public Topic4_Child() {
		super();
		//super("hello", "world"); //cannot invoke parent class constructor like this
	}
	
	public Topic4_Child(String S1, String S2) {
		super("hello", "world");
	}

}
