package com.learning_Java_Day13_14th_Aug_Understanding_Main_method;

public class Execution {

	public static void main(String[] args) {
		
		Method1.test2();
		
		Method1 method1 = new Method1();
		method1.test1();
		
		Method2 method2 = new Method2();
		method2.test2();
		
		Method3 method3 = new Method3();
		method3.test3();
		
	

	}
	

	
	//Why we need to create Object of a particular Class ?
	//because that Class does not have main method. 

}
