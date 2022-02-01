package com.javaprogrampracticeDummy;

public class PrimeNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 7;
		int temp = 0;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				temp++;
			}

		}
		if (temp > 0) {
			System.out.println("no is not prime");
		} else {
			System.out.println("no is prime");
		}

	}

}
