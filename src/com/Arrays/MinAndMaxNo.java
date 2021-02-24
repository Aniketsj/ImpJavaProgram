package com.Arrays;

public class MinAndMaxNo {
	public static void min(int[]a){
		int m = a[0];
		for(int i=1;i<a.length;i++){
			if(m>a[i]){
				m = a[i];
			}
		}
		System.out.println("Min no is "+m);
	}

	public static void main(String[] args) {

		int[] a={7,6,8,3,2};
		min(a);
		
	}

}
