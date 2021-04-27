package com.practice;

public class ReverseStringWordWithSplit {

	public static void main(String[] args) {

		String str = "aniket jadhav automation";
		String s1 = "";
		String s2 = "";
		String[] s = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			String ss = s[i];
			 s1 = revS(ss);
			 s2 = s2 + s1+" ";
		}
		System.out.println(s2.trim());

	}
	
	public static String revS(String str) {
		String re ="";
		for(int i=str.length()-1;i>=0;i--) {
			re = re + str.charAt(i);
		}
			
		return re;
	}

}
