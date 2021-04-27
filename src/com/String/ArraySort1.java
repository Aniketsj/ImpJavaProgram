package com.String;

import java.util.Arrays;

public class ArraySort1 {

	public static void main(String[] args) {

		String str = "4+6+3+1";
		int count = 0;
		String s = "";
		char[] ch = str.toCharArray();

		Arrays.sort(ch);
		System.out.println(ch);

		// +++1346
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == '+') {
				count++;
			}
		}
		System.out.println(count);
		for (int i = count; i < str.length(); i++) {
			s = s + ch[i] + "+";

		}

		s = s.substring(0, s.lastIndexOf("+"));
		System.out.println(s);
	}

}
