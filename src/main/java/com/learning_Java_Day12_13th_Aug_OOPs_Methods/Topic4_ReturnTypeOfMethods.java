package com.learning_Java_Day12_13th_Aug_OOPs_Methods;

public class Topic4_ReturnTypeOfMethods {
	
	//Method is like a factory
	//inputs ---> factory(brain)---->Output

	public static void main(String[] args) {
	
		test1();
	}
	
	
	public static int test1() {
		int i = 10;
		int j = 20;
		int k = i+j;
		//What is this logic returning ? it is returning me a value
		System.out.println(k);
		return k; //here the return type is int
		//the last statement in a method should be return
	}
	
	
	public static boolean checkPresentOrAbsent() {
		boolean class9 = true;
		boolean class10 = false;
		System.out.println(class9 == class10);
		return class9==class10; //boolean
	}

}
