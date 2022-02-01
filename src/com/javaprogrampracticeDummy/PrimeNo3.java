package com.javaprogrampracticeDummy;

public class PrimeNo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 5;
		int temp = 0;
		for (int ii = 1; ii <= no; ii++) {
			temp = 0;
			for (int i = 2; i < ii; i++) {
				
				if (ii % i == 0) {
					temp++;
				}
			}
			if (temp > 0) {
				System.out.println(ii + " is not prime.");
			} else {
				System.out.println(ii + " is prime.");
			}

		}
	}

}
