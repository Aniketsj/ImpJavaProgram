package com.practice;

public class RevOrderOfString {

	public static void main(String[] args) {
		String str = "Automation testing using selenium";
		char[] ch = str.toCharArray();
		int count = 0;
		String s1 = "";
		String s2 = "";
		String s3 = "";
		int preCount = str.length() - 1;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (ch[i] == ' ') {
				s1 = str.substring(i + 1, preCount);
				preCount = i;
				s2 = s2 + s1;
			}
		}
	}

}
