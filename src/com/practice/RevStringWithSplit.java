package com.practice;

public class RevStringWithSplit {

	public static void main(String[] args) {
		String str = "aniket jadhav automation";

		String[] s = str.split(" ");
		String s1 = "";
		String s2 = "";
		System.out.println(s.length);
		for(int i =0;i<s.length;i++) {
			s1 = s[i];
			 s1 = revS(s1);
			 s2 = s2 + s1+" ";
		
		}
		 System.out.println(s2.trim());
	}
	
	public static String revS(String str) {
		String r = "";
		for(int i=str.length()-1;i>=0;i--) {
			r = r + str.charAt(i);
		}
		return r ;
	}

}
