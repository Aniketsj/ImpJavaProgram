package com.basicProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// prime 7
		int i;
		for ( i = 2; i <= 5; i++) {
			int temp = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					temp = temp + 1;
				}
			}
			if (temp > 0) {
				System.out.println(i+" is not prime");
			} else {
				System.out.println(i+ " is prime");
			}
		}
	}

}
