package com.prac;

public class PrimeNoFromRange {

	public static void main(String[] args) {
		int i;

		for (i = 1; i <= 10; i++) {
			int temp = 0;
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					temp++;
				}
			}
			if (temp > 0) {
				System.out.println(i + " is a not prime number");
			} else {
				System.out.println(i + " is a prime number");
			}
		}
	}

}
