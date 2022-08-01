package com.practice;

public class ReverseEachWordFromString {

	public static void main(String[] args) {

		String str = "aniket jadhav automation";
		String[] s = str.split(" ");
		String revS = "";
		for (String ss : s) {
			revS = revS + rev(ss)+" ";
		}
		System.out.println(revS);

	}

	public static String rev(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

}
