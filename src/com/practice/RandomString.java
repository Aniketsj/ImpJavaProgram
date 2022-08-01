package com.practice;

import java.util.Random;

public class RandomString {

	public static void main(String[] args) {

		
		Random r=new Random();
		int len=8;
		String s="abcdefghijklmnopqrstuvwxyz";
		String ss="";
		
		for(int i=1;i<len;i++) {
			int a=r.nextInt(s.length());
			char c=s.charAt(a);
			ss= ss+c;
			
		}
		System.out.println(ss);
	}

}
