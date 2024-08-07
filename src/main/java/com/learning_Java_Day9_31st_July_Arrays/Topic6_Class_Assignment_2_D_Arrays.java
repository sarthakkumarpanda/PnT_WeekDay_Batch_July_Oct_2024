package com.learning_Java_Day9_31st_July_Arrays;

public class Topic6_Class_Assignment_2_D_Arrays {
	
	//Create a 2-D String array which has 4X5 which list alphabets
	//Determine the length/size of this 2-d Array
	//Print all the names
	//Print the name in the 3rd row 4th column
	//Print the name in the 4th row 5th column

	public static void main(String[] args) {
		
		String[][] array = {      {"aa" , "bb" , "cc" , "dd" , "ee"},
				                  {"ff" , "gg" , "hh" , "ii" , "jj"},
				                  {"kk" , "ll" , "mm" , "nn" , "oo"},
				                  {"pp" , "qq" , "rr" , "ss" , "tt"}     };
				
		int rows = array.length;       //number of rows
		int cols = array[0].length;    //number of cols
		System.out.println(rows + "   " + cols);
		
		
		for(int i=0 ; i<array.length ; i++) {
			
			for(int j=0 ; j<array[i].length ; j++) {
				System.out.print(array[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		System.out.println(array[2][3]);
		System.out.println(array[3][4]);
		
		
		}
		

	}


