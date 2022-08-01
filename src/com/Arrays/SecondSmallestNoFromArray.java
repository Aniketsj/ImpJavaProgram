package com.Arrays;

import java.util.Arrays;

public class SecondSmallestNoFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 7, 6, 8, 3, 12, 45, 67, 0 };

		int m = a[0];
		for (int i = 1; i < a.length; i++) {
			System.out.println(a.length - 1);
			if (i< a.length - 1) {

			if (m > a[i]) {

				m = a[i];

			}
		}
		}

		System.out.println("Second smallest no is =" + m);

	}
}
