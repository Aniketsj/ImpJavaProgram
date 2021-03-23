package com.prac;

import com.basicProgram.IsPrime;

public class Prm1 {

	public static boolean isPrime(int no) {
		for (int j = 1; j <= no; j++) {
			for (int i = 2; i < no; i++) {
				if (j % i == 0) {
					return false;
				}
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isPrime(7);
		System.out.println(result);
	}

}
