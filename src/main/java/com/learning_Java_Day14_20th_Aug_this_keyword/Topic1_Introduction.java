package com.learning_Java_Day14_20th_Aug_this_keyword;

public class Topic1_Introduction {
	
	//this keyword is a reference variable which refers to the Object
	
	int identity; //instance variable. Is instance variable part of the object ?
	
	
	
	void setValues(int identity) { //here the identity is a local variable
		//you want to equate the instance identity with the local identity
		
		this.identity = identity;
		
		//this refers to the Current class instance variable
	}

}
