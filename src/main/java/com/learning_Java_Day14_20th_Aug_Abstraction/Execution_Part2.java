package com.learning_Java_Day14_20th_Aug_Abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution_Part2 implements Introduction, Conclusion{

	public static void main(String[] args) {
		Execution_Part2 exec2 = new Execution_Part2();
		exec2.cash();
		exec2.bonds();
		exec2.startup();
		exec2.intermediary();
		exec2.exit();
		
		//can I create the Object of the interface ?? NO
		
		//Interface will refer to the implementing Class Object
		
		//Interface reference = new ImplementingClass();
		WebDriver driver = new ChromeDriver();

	}

	@Override
	public void cash() {
		
		
	}

	@Override
	public void bonds() {
		
		
	}

	@Override
	public void startup() {
		
		
	}

	@Override
	public void intermediary() {
	
		
	}

	@Override
	public void exit() {
		
		
	}

}
