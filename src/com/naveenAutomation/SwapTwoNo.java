package com.naveenAutomation;

public class SwapTwoNo {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("before swap a = " + a + " b = " + b);

		// a = 20 b = 10

		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swap a = " + a + " b = " + b);

		int a1 = 10, b1 = 20;
		a1 = a1 * b1;
		b1 = a1 / b1;
		a1 = a1 / b1;

		System.out.println("after swap a1 = " + a1 + " b1 = " + b1);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swap a = " + a + " b = " + b);

	}

}
