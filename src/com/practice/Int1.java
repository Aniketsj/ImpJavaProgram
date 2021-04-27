package com.practice;

import java.util.Arrays;

public class Int1 {

	public static void main(String[] args) {
		String str = "2+4+1+8+5";
		//1+2+4+5+8
		
		char[] ch = str.toCharArray();
		System.out.println(ch);
		Arrays.sort(ch);
		System.out.println(ch);
		int count =0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='+') {
				count++;
			}
		}
		System.out.println(count);
		String ss = "";
		for(int i=count;i<ch.length;i++) {
			ss = ss + ch[i]+"+";
		}
		System.out.println(ss.length());
		ss = ss.substring(0,ss.length()-1);
		
		System.out.println(ss);
		
		

	}

}
