package com.dailyPractice;

public class FindDuplicateNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 1, 4, 6, 7, 4, 3 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i] + " is same " + a[j]);
				}
			}
		}

	}

}
