package com.Arrays;

public class SortArrayWithoutMethodSort {

	public static void main(String[] args) {

		int[] arr = new int[] {9,1,8,2,7,3,6,4,5 };
		System.out.println("Array elements after sorting:");
		// sorting logic
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			// prints the sorted element of the array
			System.out.println(arr[i]);
		}
	}

}
