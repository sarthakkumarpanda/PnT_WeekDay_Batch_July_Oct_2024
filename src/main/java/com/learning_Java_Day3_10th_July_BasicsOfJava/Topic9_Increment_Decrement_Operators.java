package com.learning_Java_Day3_10th_July_BasicsOfJava;

public class Topic9_Increment_Decrement_Operators {
	
	// ++ means +1
	// -- means -1
	
	//pre-increment/decrement
	//post-increment/decrement

	public static void main(String[] args) {
		
		int i = 1; //latest value of i is 1
		i++; //latest value of i is 2
		
		int j = i++; //latest value of j is 2
		// i will become 3
		
		j = ++i; // 1 + 3 = 4
		//i will become 4
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("*********************************");
		
		question0();
		question2();
		question1();
	}
	
	
	public static void question0() {
		
		int i=2;  // i is 2
		int j = ++i; // j is 3 and i is 3
		
		
		j = i++ + i++;
		
//  j  = 3      +  4  = 7
//  i  =    4,  5 = 5
	System.out.println(i);
		System.out.println(j);
		
	}
	
	
	
	
	public static void question2() {
		int i = 2; // i is 2
		int j = i++; // j is 2, but i will be 3
		j = ++i + i++;
//     j = 4    + 4 = 8
//     i = 4, 5
		System.out.println(i);
		System.out.println(j);
	}
	
	
	
	
	
	
	
	
	
	
	public static void question1() {
		 int i = 1; //i is 1
		 
			int j = i++ + ++i - --i  - i--;
	//       j = 1   + 3   -  2   - 2 = 0
	//       i = 2,    3,     2,    1 = 1
		 
		 System.out.println("value of j at row 72 : " + j); //0
		 System.out.println("value of i at row 72 : " + i); //1
		 
		 int k = --i - --i   +    i--   -   --i;
	//       k = 0   - (-1)  +   (-1)   -  (-3) //3 is k
		 //  i = 0,   -1,        -2,     -3    // -3 is i
		 
		 System.out.println(i); //-3
		 System.out.println(k); //3
		 System.out.println(j); //0
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void post_pre_inc_dec() {
		int i=1;
		i++; //this is an example of post increment
	    ++i;  //this is pre increment
	    i-- ; //post decrement
	    --i; //pre decrement
	}

}
