package com.practice;

import java.util.Random;

public class St {

	public static void main(String[] args) {
		String str = "aniket jadhav autonation";
		int count =0;
		String s1 = "";
		String s2 = "";
		String s3 = "";
		int next = 0;
		char[] ch =str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(ch[i]==' ') {
				count++;
				if(count>=1) {
					s1 = str.substring(next,i);
					s1 = re(s1);
					next = i+1;
					s2 = s2 + s1+" ";
				}
				
			}
		}
		s3 = str.substring(next,str.length());
		s3 = re(s3);
		String r1 = s2 + s3;
		System.out.println(r1);
	}
	
	public static String re(String rev) {
		String r = "";
		for(int i=rev.length()-1;i>=0;i--) {
			r = r + rev.charAt(i);
		}
		return r;
	}

}
