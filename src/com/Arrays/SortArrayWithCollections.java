package com.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayWithCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = { 11, 22, 12, 43, 24, 78, -1, 1, 2, 6, 9, 0 };
		Arrays.sort(a);

		System.out.println(Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(a));
	
		for (int i = a.length-1; i >= 0; i--) {
			int rev = 0;
			 rev = rev + a[i];
			System.out.println("rev= "+rev);
		}
		
	}

}
