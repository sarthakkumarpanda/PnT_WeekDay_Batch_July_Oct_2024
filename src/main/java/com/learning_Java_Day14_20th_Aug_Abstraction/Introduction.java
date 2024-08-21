package com.learning_Java_Day14_20th_Aug_Abstraction;

public interface Introduction {
	
	//interface is 100% abstraction
		//Blueprint of a class - it tells the class what to do but does not tell how to do
		//methods inside interaface are abstract and public
		//variables inside interface are public, static and final
	
	public void cash();
	public abstract void bonds();
	
	public static final int i = 9;
	public static final int i1 = 10;
	
	default void check() {
		System.out.println("default keyword as a word is allowed in interface");
	}
	
	//protected void checkSum() {
		//you cannot create a protected method in interface
	//}
	
	private void cashOnly() {
		//you can create a private method in interface
	}
	
	
	public static void drum() {
	//you can create a static method in an interface	
	}
	
	//public void tryAgain() {
		//you cannot create a non static public method in an interface
	//}

}
