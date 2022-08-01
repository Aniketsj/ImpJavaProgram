package com.practice;

public class NumericCountFromString {

	public static void main(String[] args) {

		String str = "aniket jadhav 1991 june 07";
		String number = "";
		String alpha = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				count++;
				number = number + str.charAt(i);
			} else {
				alpha = alpha + str.charAt(i);
			}
		}
		System.out.println("count of numeric =" + count);
		System.out.println("Number is =" + number);
		System.out.println("Alphabates is =" + alpha);
		
	}

}
