package com.practice;

public class TestTwoNum {

	static int maximum(int a, int b) {
		int max = (a > b) * a + (b > a) * b;

		return max;
	}

	public static void main(String[] args) {

		int a = maximum(7, 4);
		System.out.println(a);

	}

}
