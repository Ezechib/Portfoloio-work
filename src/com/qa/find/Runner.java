package com.qa.find;


/**
 * Runner class to test the find method in the main class.
 * To check any word you would like input the values you wish to use in the sysout line
 * for e.g ("Course",3,'u')
 * 
 *@author Ali
 */



public class Runner {

	public static void main(String[] args) {
		
		
		Find result = new Find();
		System.out.println(result.find("Hello", 2, 'e'));

	}

}
