package com.practice;

public class Arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 153;
		int rem, sum = 0;

		while (no > 0) {
			rem = no % 10;
			System.out.println("rem = "+rem);
			no = no / 10;
			System.out.println("no = "+no);
			sum = sum + (rem * rem * rem);
			System.out.println("sum  = "+sum);
			System.out.println("**********************************************");
		}

		System.out.println(sum);

	}

}
