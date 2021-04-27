package com.practice;

public class RevStringWithoutSplit {

	public static void main(String[] args) {

		String str = "aniket jadhav automation";
		char[] ch = str.toCharArray();
		
		int count = 0;
		int next =0;
		String s1 = "";
		String s2 = "";
		for(int i =0;i<str.length();i++) {
			if(ch[i]==' ') {
				count++;
				if(count>=1) {
					s1 = str.substring(next, i);
					s1 = revS(s1);
					s2 = s2 + s1+" ";
					next = i+1;
				}
			}
		}
		
		String s3 = str.substring(next,str.length());
		s3 = revS(s3);
		String rev = s2 + s3;
		System.out.println(rev);
	}

	public static String revS(String str) {
		String s = "";
		for(int i=str.length()-1;i>=0;i--) {
			s = s + str.charAt(i);
		}
		return s;
	}
}
