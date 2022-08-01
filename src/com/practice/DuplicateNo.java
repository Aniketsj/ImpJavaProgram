package com.practice;

public class DuplicateNo {

	public static void main(String[] args) {
		int[] no = { 1, 2, 5, 7, 9, 6, 4, 3, 5, 7, 8, 8 };
		int dup = 0;
		for (int i = 0; i < no.length; i++) {
			for (int j = i + 1; j < no.length; j++) {
				if (no[i] == no[j]) {
//					dup = no[i];
					System.out.println("duplicate no is: " + no[i]);

				}

			}
		}

	}

}
