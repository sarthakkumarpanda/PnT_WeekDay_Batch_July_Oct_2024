package com.learning_Java_Day9_31st_July_Arrays;

public class Topic3_One_Dimensional_Arrays {
	
	//1. Declare an Array
	//2. Create an Array
	//3. Initialize an Array
	//4. Retrieve elements of the Array
	
  // 1-D     []

	public static void main(String[] args) {
		//Declaration
		
		int a[];
		int[] b;
		int[]c;
		
		int[] b1, c1; //b1 is a 1-D array, c1 is also a 1-D array
		int b2[], c2; //b2 is a 1-D array, c1 is just an int variable
		int b3[], c3[]; //b3 and c3 are both 1-D arrays
		int[] b4[], c4[];  //b4 and c4 are both 2-D arrays
		int[] b5, c5[]; //b5 is 1-D and c5 is 2-D
		
		//Creation is done using new keyword
		
		int[] d; //declaration of int array d
		d = new int[5];  //creation of that array
		
		int[] d1 = new int[5]; //declaration + creation together
		//what is the size of array d1 ???
		System.out.println("The size of d1 array is : " + d1.length);
		
		//initialization
		d1[0] = 121;
		d1[1] = 122;
		d1[2] = 123;
		d1[3] = 145;
		d1[4] = 150;
		//d1[5] = 156;
		
		//can you retrieve all these 5 values/elements of d1 array ??
		
		for(int i=0 ; i<d1.length ; i++) {
			System.out.println(d1[i]);
		}
		
		
		//determine the 4th element of this array
		System.out.println("The 4th element of d1 array is : " + d1[3]);
		
		//System.out.println("The 6th element of d1 array is : " +d1[5]);
		
		
		declare_create_initialize_together();
	}
	
	
	
	
	
	
	public static void declare_create_initialize_together() {
		
		//int[] m = new int[5];
		
		//int[] m = new int[]{1, 2, 3, 4 , 5};
		
		int[] m = {11, 22, 33, 44, 55};
		
		System.out.println("the 3rd element is : " + m[2]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
