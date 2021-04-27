package com.practice;

public class RevStringOrderWithSplit {

	public static void main(String[] args) {
		String str = "aniket jadhav automation test";

		String[] s = str.split(" ");
		String s1 = "";
		String s2 = "";
		for(int i=s.length-1;i>=0;i--) {
			s1 = s[i];
			s2 = s2 + s1+" ";
		}
		System.out.println(s2);

	}

}
