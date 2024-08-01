package com.learning_Java_Day9_31st_July_Arrays;

public class Topic5_Two_Dimensional_Arrays {
	// 2-D [][]

	public static void main(String[] args) {

		int[][] a;
		int a1[][];
		int[][] a2;
		int[] a3[];
		int[] a4[];

		int[][] b1, c1; // both b1 and c1 are 2-D arrays
		int[] b2, c2[]; // b2 is 1-D and c2 is 2-D
		int[] b3[], c3[]; // b3 and c3 are both 2-D
		int[][] b4, c4[]; // b4 is 2-D, c4 is 3-D
		// int[][]b5, []c5; b//b5 is 2-D. Here []c5 is represented wrongly as c5 is 2nd
		// variable and it cannot have a dimension before it
		// the law of array in java says that the 2nd variable cannot have a dimension
		// before it

		declare_create_initialize_individually_2D_array();
	}

	public static void declare_create_initialize_individually_2D_array() {

		// int[][] a;
		// a = new int[3][4]; //it is 3 X 4 = 12

		/*
		 * a[0][0] = 1001; a[0][1] = 1200; a[0][2] = 1203; a[0][3] = 1300;
		 * 
		 * a[1][0] = 1001; a[1][1] = 1200; a[1][2] = 1203; a[1][3] = 1300;
		 * 
		 * a[2][0] = 1001; a[2][1] = 1200; a[2][2] = 1203; a[2][3] = 1300;
		 * 
		 */

		/*
		 * int[][] a = new int[][] { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		 */

		int[][] a = { { 1, 2, 3, 4 }, 
				      { 5, 6, 7, 8 }, 
				      { 9, 10, 11, 12 } };

		// retrieve an element which is in 2nd row 4th col. Here (n-1)th concept will be
		// used

		System.out.println(a[1][3]);
		
		//print all the elements of the 2-D array
		
		for(int i=0 ; i<a.length ; i++) {
			
			     for(int j=0 ; j<a[i].length ; j++) {
			    	 System.out.print(a[i][j] + " ");
			     }
			     System.out.println();
		}

	}

}
