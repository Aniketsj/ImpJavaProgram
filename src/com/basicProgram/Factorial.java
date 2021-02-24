package com.basicProgram;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5 1*1 1 1*2 2 2*3 6 6*4 24 24*5 120

		int fact = 1, i, no = 5;
		for (i = 1; i <= no; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
