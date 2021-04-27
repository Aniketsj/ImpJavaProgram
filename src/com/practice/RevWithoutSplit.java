package com.practice;

public class RevWithoutSplit {

	public static void main(String[] args) {

		String str = "automation testing using selenium";
		char[] ch = str.toCharArray();
		int count = 0;
		String s1 = "";
		String s2 = "";
		String s3 = "";
		int next = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				count++;
				if (count >= 1) {
					s1 = str.substring(next, i);
					s1 = rev(s1);
					next = i + 1;
					s2 = s2 + s1 + " ";

				}
			}
		}
		s3 = str.substring(next, str.length());
		s3 = rev(s3);
		String rr = s2 + s3;
		System.out.println(rr);
	}

	public static String rev(String str) {
		String r = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			r = r + str.charAt(i);
		}
		return r;
	}

}
