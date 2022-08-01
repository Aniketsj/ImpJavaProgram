package com.practice;

public class MinNumberFromArray {

	public static void main(String[] args) {

		int[] a = { 7, 8, 9, 5, 0,4, 3, 2, 1 };

		int m=a[0];
		for(int i=1;i<a.length;i++) {
			if(m>a[i]) {
				m=a[i];
			}
		}
		System.out.println(m);
	}

}
