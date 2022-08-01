package com.practice;

public class Prime {

	public static void main(String[] args) {

		
		int no=8;
		int temp=0;
		
		for(int i=2;i<no;i++) {
			int count=0;
			if(no%i==0) {
				temp= count+1;
			}
		}
		
		System.out.println(temp);
		
	
	}
}