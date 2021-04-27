package com.String;

public class CountNoOfInteger {

	public static void main(String[] args) {
		int no = 12345;
		
		String str= String.valueOf(no);
		System.out.println(str.length());
		
		int no1 = 12345;
		int count = 0;
		while(no1>0) {
			no1 = no1 / 10;
			count++;
		}
		
		System.out.println(count);

	}

}
