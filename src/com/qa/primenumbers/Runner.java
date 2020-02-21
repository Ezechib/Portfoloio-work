package com.qa.primenumbers;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int primeNumbers(int max) {
		int primeCount = 0;
		for (int i = 2; i < max; i++) {
			boolean prime = true;
			for (int j = 2; j <= (int)Math.sqrt(i); j++) {
				if (i % j ==0) {
					prime = false;
					break;
				}
			}
			if (prime==true) {
				primeCount++;
			}
		}
		return primeCount;
	}

}
