package com.String;

public class ReverseStringWithSplit {

	public static void main(String[] args) {

		String str = "aniket jadhav automation";
		String[] s = str.split(" ");
		String s2 = "";
		String s1 = "";
		for (int i = 0; i < s.length; i++) {
			s1 = s[i];
			s2 = s2 + revStr(s1) + " ";
		}
		System.out.println(s2);

	}

	public static String revStr(String str) {
		String r = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			r = r + str.charAt(i);
		}
		return r;

	}

}
