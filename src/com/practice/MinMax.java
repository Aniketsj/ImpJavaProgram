package com.practice;

public class MinMax {

	public static void main(String[] args) {

		int[] no = {32,2,5,7,9,3,6};
		
		int min = no[0];
		for(int i=1;i<no.length;i++) {
			if(min<no[i]) {
				min=no[i];
			}
		}
		System.out.println("minimum value is: "+min);
	}

}
