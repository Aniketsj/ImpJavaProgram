package com.Arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 11, 22, 12, 43, 24, 78, -1, 1, 2, 6, 9, 0 };
		Arrays.sort(arr);
		System.out.println("after arrays.sort-------------------");
		for (int a : arr) {
			System.out.println(a);
		}
	}

}
