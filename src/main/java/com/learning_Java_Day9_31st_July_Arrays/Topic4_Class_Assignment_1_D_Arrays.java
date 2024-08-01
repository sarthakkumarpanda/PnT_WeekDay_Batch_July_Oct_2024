package com.learning_Java_Day9_31st_July_Arrays;

public class Topic4_Class_Assignment_1_D_Arrays {
	
	//Declare, create, initialize a 1-D String array which represents 6 car companies
	//determine the name of the car company which is in the 5th index
	//Retrieve names of all the car companies

	public static void main(String[] args) {
		
		String[] carCompanies = {"Mercedes", "Audi", "BMW", "Toyota", "Ford", "RAM"};
		
		System.out.println("The car company name in the 5th index is : " + carCompanies[5]);
		
		for(int i=0 ; i<carCompanies.length ; i++) {
			System.out.println(carCompanies[i]);
		}
		

	}
	
	
	public static void explainingRetrieval() {
		int[] numbers = {11, 43, 56, 78, 34, 29, 20, 12, 10, 22};

		//size of the array
		System.out.println("The size of the array is : " + numbers.length);
		
		//retrieve all the elements of this array
		

		
		//indexing starts from 0

		for(int j=0 ; j< numbers.length ; j++){
		System.out.println(numbers[j]);
		}
		
		System.out.println("retrieve the element in the 5th position - " + numbers[4]);
	}

}
