package com.practice;

public class RevWord {

	public static void main(String[] args) {

		String str = "aniket jadhav automation";
		char[] ch = str.toCharArray();
		int next = 0;
		String s1 = "";
		int count = 0;
		String s2 = "";
		String s3 = "";
		for (int i = 0; i < str.length(); i++) {

			if (ch[i] == ' ') {
				count++;
				if (count >= 1) {
					s1 = str.substring(next, i);
					s1 = revS(s1);
					next = i + 1;
					s2 = s2 + s1 + " ";

				}
			}
		}

		s3 = str.substring(next, str.length());
		s3 = revS(s3);
		s3 = s2 + s3;
		System.out.println(s3);

	}

	public static String revS(String st) {
		String rev = "";

		for (int i = st.length() - 1; i >= 0; i--) {
			rev = rev + st.charAt(i);
		}

		return rev;
	}

}
