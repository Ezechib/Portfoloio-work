package com.qa.factorial;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i= 5;
		int a= i-1;
		
		while (a >= 1) {
			i = i * a;
			a--;
		}
System.out.println(i);
	}

}
