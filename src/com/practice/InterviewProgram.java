package com.practice;

import java.util.Arrays;

public class InterviewProgram {

	public static void main(String[] args) {
		String str = "4+6+3+1";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);

		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '+') {
				count++;
			}
		}
		String rev = "";
		for (int i = count; i < ch.length; i++) {
			rev = rev + ch[i] + "+";
		}
		System.out.println(rev);
		System.out.println(rev.length());
		rev = rev.substring(0, rev.length()-1);
		System.out.println(rev);
	}

}
