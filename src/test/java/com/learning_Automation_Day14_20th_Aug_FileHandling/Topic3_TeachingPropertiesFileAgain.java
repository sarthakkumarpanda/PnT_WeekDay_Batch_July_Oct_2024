package com.learning_Automation_Day14_20th_Aug_FileHandling;

import java.util.Properties;

public class Topic3_TeachingPropertiesFileAgain {
	
	//Step 1. Create the name.properties file
	//Step 2. Inside the properties file store your data in the form of key=value
	//Step 3. You have to create the Object of Properties Class
	//Step 3.1 if you are using main method then create the Object inside the main method
	//Step 3.2 if you are not using main method then create the Object inside the Constructor
	//Step 4. You have to create the Object of FileInputStream Class and pass the path of the .properties file in the constructor
	//Step 5. You load the file
	//Step 6: In your automation code, use the reference of Properties class and utilize the key in the code
	
	public Properties prop;
	
   public Topic3_TeachingPropertiesFileAgain() {
	    prop = new Properties();
	    
	
   }
}
