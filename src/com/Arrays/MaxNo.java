package com.Arrays;

public class MaxNo {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 5, 6, 7, 8, 9, 0 };

		int a = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (a < arr[i]) {
				a = arr[i];

			}

		}
		System.out.println(a);

	}

}