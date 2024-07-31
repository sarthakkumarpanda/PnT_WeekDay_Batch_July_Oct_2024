package com.learning_Automation_Day8_30th_July_Xpaths;

public class Topic4_Xpath_Relative_Syntax {

	public static void main(String[] args) {

	}

	public static void syntax1() {
		// html[@attribute = 'value']
	}

	public static void syntax2() {

		// html[@attribute1 = 'value1' and @attribute2 = 'value2']
		// input[@name = 'newsletter' and @value= '1']
	}

	public static void syntax3() {

		// html[@attribute1 = 'value1' or @attribute2 = 'value2']
        // input[@name = 'newsletter' or @value= '1']
	}
	
	public static void syntax4() {
		//html[text() = 'valueofthetext']       //this syntax is mostly used for links
		//a[text() = 'Money']
	}
	
	public static void syntax5() {
		//html[contains(text(), 'valueofthetext')] //also used for links
		//a[contains(text(), 'Money')]
	}
	
	public static void syntax6() {
		//html[contains(@attribute, 'value')] //this is for anything
		//input[contains(@id, 'login1')]
	}
	
	public static void syntax7() {
		//html[starts-with(@attribute, 'value')]
		
	}
	
	public static void syntax8() {
		//html[ends-with(@attribute, 'value')]
	}

}
