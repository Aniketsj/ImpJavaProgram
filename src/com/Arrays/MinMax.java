package com.Arrays;

public class MinMax {

	public static void main(String[] args) {

		int arr[] = { 4, 3, 1, 5, 7, 8, 9 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[0] > arr[i]) {
				arr[0]=arr[i];
			}

		}
		System.out.println("min value is = "+arr[0]);
	}

}
