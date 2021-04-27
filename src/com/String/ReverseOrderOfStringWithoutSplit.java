package com.String;

public class ReverseOrderOfStringWithoutSplit {

	public static void main(String[] args) {

		String str = "anik jadh auto test sdet";
		int pre = 0;
		char[] ch = str.toCharArray();
		int start = str.length();
//		int i = str.length() - 1;
		int i = ch.length - 1;
		System.out.println(i);
		String ss2 = "";
		for (i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == ' ') {
				String ss = str.substring(i, start);
				ss2 = ss2 + ss+" ";
				start = i;
				i = i - 1;
			}
		}
		String s1 = str.substring(0, start);
		String rv = ss2 + s1;
		System.out.println(rv.trim());
	}
}
