package com.practice;

public class PrimeNo1 {
	public static boolean isPrime(int no) {
		boolean isPrm;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int no = 6;
		boolean result = isPrime(no);
		System.out.println(result);
	}

}

/*
 * for (int i = 2; i < num; i++) { if (num % i == 0) {
 * 
 * return false; } } return true;
 * 
 * }
 */
