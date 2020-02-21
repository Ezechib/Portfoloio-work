package com.qa.FizzBuzzPopSnap;

public class Runner {

	public static String fizzBuzz (int num) {
		String str = "";
		
		if (num % 3 == 0) {
			str += "Fizz";
		}
		if (num % 5 == 0) {
			str += "Buzz";
	}
		if (num % 7 == 0) {
			str += "Pop";
		}
		if (str.equals("")) {
			
			return String.valueOf(num);
			} else
				return str;
}
}
	
