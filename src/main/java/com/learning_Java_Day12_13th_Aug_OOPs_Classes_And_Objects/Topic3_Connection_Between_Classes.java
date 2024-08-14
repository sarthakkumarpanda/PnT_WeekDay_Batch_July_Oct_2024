package com.learning_Java_Day12_13th_Aug_OOPs_Classes_And_Objects;

public class Topic3_Connection_Between_Classes {

	public static void main(String[] args) {
		
        temp.test1();
        temp.test2();
        Topic4_ExternalClass.login1();
        Topic4_ExternalClass.login2();
	}

}

class temp {
	
	public static void test1() {
		System.out.println("This is test1 method of temp class which is an adjacent class");
	}
	
	public static void test2() {
		System.out.println("This is test2 method of temp class which is an adjacent class");
	}
}
