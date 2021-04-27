package com.String;

public class RevOrderString {

	public static void main(String[] args) {

		String str = "aniket jadhav SDET";
		char[] ch = str.toCharArray();
		int end = ch.length;
		int i = ch.length - 1;
		String s1 = "";
		String s2 = "";
		String s3 = "";
		String rev = "";
		for (i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == ' ') {
				s1 = str.substring(i, end);
				end = i;
				i = i - 1;
				s2 = s2 + s1 +" ";
			}
		}
		s3 = str.substring(0,end);
		rev = s2 + s3;
		System.out.println(rev.trim());
	}

}
