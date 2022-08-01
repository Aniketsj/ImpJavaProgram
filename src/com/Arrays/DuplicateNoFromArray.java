package com.Arrays;

import java.util.Arrays;

public class DuplicateNoFromArray {

	public static void main(String[] args) {

		int a[] = {4,5,6,4,5 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			for (int k = i + 1; k < a.length; k++) {
				if (a[i] == a[k]) {
					a[k] = '$';
					
				}
			}
			if(a[i]!='$') {
				System.out.println(a[i]);
			}
		}
	}

}
