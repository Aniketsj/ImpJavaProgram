package com.practice;

public class RevW {

	public static void main(String[] args) {

		String str = "aniket sambhaji jadhav";
		int next = 0;
		int count = 0;
		String s1 = "";
		String s2 = "";
		String s3 = "";

		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				count++;
				if (count >= 1) {
					s1 = str.substring(next, i);
					s1 = revW(s1);
					next = i + 1;
					s2 = s2 + s1 + " ";

				}
			}
		}
		s3 = str.substring(next, str.length());
		s3 = revW(s3);

		String r = s2 + s3;
		System.out.println(r);
	}

	public static String revW(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

}
