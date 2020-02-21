package com.qa.armstrong;

public class Runner {
	
	public static boolean armstrong(long x) {
		long total = 0;
		String number = Long.toString(x);
		char numberAry[] = number.toCharArray();
		for (char c : numberAry) {
			total += Math.pow(Character.getNumericValue(c), numberAry.length);
		}
		System.out.println(total);
		System.out.println(x);
		return (total == x);
	}
}
