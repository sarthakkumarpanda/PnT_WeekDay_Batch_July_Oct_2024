package com.learning_Automation_Day12_13th_Aug_Revision_Xpaths_cssSelectors;

public class Topic2_Xpath_Advanced_Revision {
	//parent, child, descendant, ancestor, following-sibling, preceding-sibling, following, preceding
	
	//p[@id = 'signin_info']/child::a[1]
	//span[@id = 'username']/following::a[1]
	//span[@id = 'username']/following-sibling::p/child::a[1]
	//input[@id = 'OAS_subsection']/following::a[@class = 'signin']
	//input[@id = 'OAS_subsection']/following-sibling::div[@class = 'logobar']/descendant::a[7]
	//input[@id = 'OAS_subsection']/following-sibling::div[@class = 'logobar']/descendant::p/child::a[1]
	//input[@id = 'OAS_subsection']/following-sibling::div[@class = 'logobar']/descendant::p/child::a[@class = 'signin']
	//div[@id = 'red_container_main']/preceding::a[@class = 'signin']
	//div[@id = 'red_container_main']/preceding-sibling::div[3]/preceding::p/child::a[1]

}
