package com.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 2, 7, 5 };

		int no = 0 ;
		for (int s = 0; s < arr.length; s++) {
			
			for (int i = s + 1; i < arr.length; i++) {
				if (arr[s] == arr[i]) {
					System.out.println("Duplicate no is " + arr[s]);
					no = arr[i];
				}
						
			}
			
		}
		
		
	}

}
