package com.practice;

public class Prime241 {

	public static void main(String[] args) {

		int k ;
		for ( k = 1; k <= 100; k++) {
			int temp = 0;
			for (int i = 2; i < k; i++) {
				if (k % i == 0) {
					temp = temp + 1;
				}
			}

			if (temp > 0) {
				System.out.println(k +" is not prime");
			} else {
				System.out.println(k +" is prime");
			}
		}
	}

}
