package com.learning_Java_Day16_27th_Aug_ExceptionHandling;

public class Topic4_How_to_handle_Exception {
	
	//there are 5 keywords in java which help you to handle exception that too manually
	//1. try
	//2. catch
	//3. finally
	//4. throw
	//5. throws

	public static void main(String[] args) {
		runTimeExceptionExample();	

	}
	
	public static void runTimeExceptionExample() {
		int a=10, b=0;
		int c = a/b;
		System.out.println(c);
	}
	
	public static void explanation() {
		//Step 1: Programmer did a logical mistake in a method
		//Step 2: If compiler is not able to interfere and give a warning that means it is not a CompileTime Exception
		//Step 3: The method holds the logical error. This method will create an Object
		//Step 4: This object will have 3 things  -    i. Name of the Exception
		//                                            ii. Description of the Exception
		//                                           iii. Stacktrace[which line and methods names that have the exception]
		
		//Step 5: Fine the object got created, but the question still remains is that method handing the exception ???
		//Step 6: It will pass this Object to JVM
		//Step 7: JVM will check if it can handle the exception object or not.
		//Step 8: If not then it will pass it to the Default Exception Handler
		//Step 9: Before passing this Object to Default Exception Handler, jvm will abruptly terminate the program
		//Step 10: Default Exception Handler will print the exception details in the output console
	}

}
