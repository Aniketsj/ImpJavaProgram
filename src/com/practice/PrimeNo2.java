package com.practice;

public class PrimeNo2 {

	public static void main(String[] args) {

		int no = 8;
		int temp = 0;
		int k =1;
		for( k=1;k<=100;k++) {
			 temp= 0;
		for (int i = 2; i < k; i++) {
			if (k % i == 0) {
				temp++;
			}
		}
		
		if (temp > 0) {
			System.out.println(k+" no is not prime");
		} else {
			System.out.println(k+" no is prime");
		}
		}
	}

}
