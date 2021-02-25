package com.basicProgram;

public class PrimeNo {

	public static void main(String[] args) {

		int l = 0;
		for (l = 2; l <= 100; l++) {
			int temp = 0;
			for (int i = 2; i < l; i++) {
				if (l % i == 0) {
					temp = temp + 1;
				}

			}
			if (temp > 0) {
				System.out.println(l + " is not prime number");
			} else {
				System.out.println(l + " is prime number");
			}
		}

	}

}
