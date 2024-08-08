package com.learning_Java_Day11_7th_Aug_STRINGS;

public class Topic4_More_Things_About_Strings {

	public static void main(String[] args) {
	
		 String S1 = "Hello"; // 1 object will be directly created inside SLP
		 String S2 = "Hello"; // no objects will be created
		 
		 System.out.println(S1 == S2);//true
		 System.out.println(S1.equals(S2));
		 
		 String S3 = new String("World1");
		 String S4 = new String("World");
		 
		 System.out.println(S3.equals(S4));
		 
		 //   == operator is used to compare references (memory addresses) of two objects to check if they point to the same object in memory.

	}

}
