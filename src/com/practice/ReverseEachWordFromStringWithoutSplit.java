package com.practice;

public class ReverseEachWordFromStringWithoutSplit {

	public static void main(String[] args) {
		String str = "aniket jadhav automation";
		char[] ch = str.toCharArray();
		int count = 0;
		int next = 0;
		String r1 = "";
		String r2 = "";
		String r3 = "";
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == ' ') {
				count++;
				if (count >= 1) {
					r1 = str.substring(next, i);

					r1 = rev(r1);
					next = i + 1;
					r2 = r2 + r1 + " ";

				}
			}
		}
		r3 = str.substring(next, str.length());
		r3 = rev(r3);
		String sw = r2 + r3;
		System.out.println(sw.trim());
	}

	public static String rev(String r) {
		String str = " ";
		for (int i = r.length() - 1; i >= 0; i--) {
			str = str + r.charAt(i);
		}
		return str;
	}

}
