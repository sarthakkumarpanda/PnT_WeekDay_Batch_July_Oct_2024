package com.learning_Automation_Day12_13th_Aug_Revision_Xpaths_cssSelectors;

public class Topic3_cssSelectors {
	
	//Syntax
	
	/*
      
      html[attribute = value]
      a[class=signin]
      
      if a WebElement has class
      html.vlaue
      a.signin
      
      if a WebElement has compound class
      html.compoundValue1.value2.value3.valuen
      a.shopicon.relative
      
      if a WebElement has an id
      html#value
      input#input-email
      
      //traversing using cssSelector inside the DOM
      //cssSelector only from top to bottom - only from parent to child, only from ancestor to descendant
      
      //if a parent has multiple children and children are of similar types then how to make sure it is 1 of 1
      p#signin_info > a:nth-child(1)
      p#signin_info > br
      p#signin_info > br:nth-child(2)
      p#signin_info > a:nth-child(3)
      
      p#signin_info > br:nth-of-type(1)
      p#signin_info > a:nth-of-type(1)
      p#signin_info > a:nth-of-type(2)
      
      cssSelector traversing between parent to child and sibling to sibling
      
      p#signin_info > a:nth-of-type(1) + br + a
      p#signin_info  a:nth-of-type(1) + br + a
      
      if traversing between parent to child can use angular bracket > or leave a space
      if traversing between siblings use the plus symbol +
       
       
       
   
      
      
      
      
      
      
      
      
      
      
	 */

}
