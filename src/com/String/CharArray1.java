package com.String;

public class CharArray1 {

	public static void main(String[] args) {

		String str ="Aniket Jadhav";
		char[] ch = str.toCharArray();
//		for (char c : ch) {
//			System.out.println(c);
//		}
		System.out.println(str.length());
		System.out.println(ch.length);
		for(int i=0;i<str.length();i++) {
			System.out.println(ch[i]);
		}
	}

}
