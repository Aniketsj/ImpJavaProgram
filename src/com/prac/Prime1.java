package com.prac;

public class Prime1 {

	public static void main(String[] args) {

		int no = 7;
		int temp = 0;
		// check prime or not
		for (int i = 2; i < no; i++) {
			int count = 0;
			if (no % i == 0) {
				temp = count + 1;
				
			} 
		}
		if (temp > 0) {
			System.out.println("no is not prime");
		} else {
			System.out.println("no is prime");
		}

	}
}
