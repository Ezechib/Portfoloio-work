package com.qa.fibonacciSequence;

public class Runner {

	public static void main(String[] args) {
		System.out.println(sequence(50));
System.out.println(fibonacci(50));
	}
	public static int sequence (int pos) {
		int j = 0;
		int i = 1;
		for (int x=1; i<=pos; i++) {
			int temp = j;
			j = x + j;
			x = temp;
		}
		return j;
	}
	// using recursion
	public static int fibonacci(int num) {
		if (num==0) {
			return 0;
			
	} else if (num==1) {
		return 1;
	}
		return fibonacci (num-1) + fibonacci (num-2);
	}

}


