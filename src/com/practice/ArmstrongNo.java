package com.practice;

public class ArmstrongNo {

	public static void main(String[] args) {

		int no = 153;
		int temp = no;
		int rem;
		int sum = 0;
		while (no > 0) {
			rem = no % 10;
			no = no / 10;
			sum = sum + (rem * rem * rem);
		}
		System.out.println(temp + " " + sum);
		if (temp == sum) {
			System.out.println("no is armstrong");
		}
	}

}
