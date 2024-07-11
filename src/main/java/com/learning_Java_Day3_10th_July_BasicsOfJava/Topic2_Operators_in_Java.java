package com.learning_Java_Day3_10th_July_BasicsOfJava;

public class Topic2_Operators_in_Java {
	
	//Arithmetic Operators
	//Assignment Operators
	//Comparison Operators
	//Logical Operators
	//Bitwise Operators

	public static void main(String[] args) {
		
	System.out.println(2 <=3);
	System.out.println(2 != 3);
	System.out.println(2 > 3);
	
	int x = 5;
	System.out.println(x>4  && x>3); //true && true will be true
	System.out.println(x>4  && x<3); //true && false will be false
	System.out.println(x<4  && x<3); //false && false will be false
	
	
	System.out.println(!(x<4  && x<3));
	
	System.out.println(x>4  ||  x>3); //true || true 
	System.out.println(x>4  ||  x<3); //true || false
	System.out.println(x<4  ||  x<3); //false || false
	
	int ageTommy = 23; //assigning the value of age to 23
	int ageBobby = 23;
	System.out.println(ageTommy == ageBobby);
	
	
    }
	
	public static void arithmeticOperators() {
		//Addition            +
		//Subtraction         -
		//Multiplication      *
		//Division            /
		//Modulus             %
		//Increment           ++
		//Decrement           --
	}
	
	public static void assignmentOperators() {
		//                   = 
		//                  +=            //if you write      x += 3   then it means    x = x+3
		//                  -=
		//                  *= 
		//                  /=
		//                  %= 
		//                  &=
		//                  |=
		//                  ^=
		//                  >>=
		//                  <<=
	}
	
	public static void comparisonOperators() {
		//             ==      equalto
		//             !=      not equal
		//             >       greater than
		//             <       less than
		//             >=      greater than or equal to
		//             <=      less than or equal to
	}
	
	public static void logicalOperators() {
		//                &&   logical and
		//                ||   logical OR
		//                !    logical Not - reversing the final result
	}

}
