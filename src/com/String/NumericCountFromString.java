package com.String;

public class NumericCountFromString {

	public static void main(String[] args) {

		String str = "aniket 1 jadhav 23";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				count++;
			}
		}
		System.out.println(count);

	}

}
