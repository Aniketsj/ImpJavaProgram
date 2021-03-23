package com.basicProgram;

public class ArmstrongProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 370, rem, sum = 0;
		int temp = no;

		while (no > 0) {

			rem = no % 10;
			no = no / 10;
			sum = sum + (rem * rem * rem);

		}

		if (temp == sum) {
			System.out.println("arm");
		} else {
			System.out.println("not arm");
		}

	}

}
