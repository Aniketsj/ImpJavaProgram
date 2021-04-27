package com.String;

import java.util.Arrays;

public class InterviewQueArraySort {

	public static void main(String[] args) {
		String str = "6+2+5";
		int count = 0;
		String s = "";
		char[] ch = str.toCharArray();

		Arrays.sort(ch);

		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == '+') {
				count++;

			}
		}
		for (int i = count; i < str.length(); i++) {
			s = s + ch[i] + "+";
		}

		if (s.endsWith("+")) {

			s = s.substring(0, s.lastIndexOf('+'));

		}
		System.out.println(s);
	}

}
