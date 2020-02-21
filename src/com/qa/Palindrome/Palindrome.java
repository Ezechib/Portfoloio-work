package com.qa.Palindrome;

public class Palindrome{

public boolean BorrowOrRob (String sentence){
	// ignore case 
	String sen=sentence.replace(" ", "").toLowerCase();
	String reversalstring= "";
	for (int i=sen.length()-1; i>=0;i--) {
		reversalstring= reversalstring + sen.charAt(i);
		}
	return sen.equals(reversalstring);
	
}

}

