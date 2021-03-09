package com.practice;

public class Fibonacci {

	public static void main(String[] args) {

		int no1 = 0, no2 = 1, count = 10, sum;
		System.out.print(no1 + " " + no2);
		for (int i = 2; i <= count; i++) {
			sum = no1 + no2;
			System.out.print(" "+sum);
			no1 = no2;
			no2 = sum;
		}
	}

}
