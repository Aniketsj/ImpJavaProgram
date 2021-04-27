package com.String;

import java.util.Random;

public class RandomStringUsingStringBuilder {

	public static void main(String[] args) {

		String str= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int len = 9;
		StringBuilder sb= new StringBuilder();
		Random r =new Random();	
		
		for(int i=0;i<len;i++) {
			int index = r.nextInt(str.length());
			char c= str.charAt(index);
			sb.append(c);
		}
		String s = sb.toString();
		System.out.println(s);
	}

}
