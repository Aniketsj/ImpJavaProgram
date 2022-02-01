package com.prac;

public class Prm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp = 0;
		int k = 1;
		for (k = 1; k <= 100; k++) {
			temp = 0;
			for (int i = 2; i < k; i++) {
				if (k % i == 0) {
					temp = temp + 1;
				}
			}

			if (temp > 0) {
				System.out.println(k + " is not prime");
			} else {
				System.out.println(k + " is prime");
			}
		}
	}

}
