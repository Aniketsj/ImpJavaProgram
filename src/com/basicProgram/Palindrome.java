package com.basicProgram;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 121, rem, sum = 0;
		int temp = no;

		while (no > 0) {
			rem = no % 10;
			no = no / 10;
			sum = sum * 10 + rem;
			

		}
		if (temp == sum) {
			System.out.println("P");
		} else {
			System.out.println("not p");
		}

	}
}
