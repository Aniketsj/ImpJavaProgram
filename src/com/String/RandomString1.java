package com.String;

import java.util.Random;

public class RandomString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random r = new Random();
		int len = 9;
		String s;
		String s1 = "";
		int a = 0;
		for (int i = 1; i <= len; i++) {
			 a = r.nextInt(str.length());
			char c = str.charAt(a);
			s = Character.toString(c);
			s1 = s1 +s;
		}
		System.out.println(s1);
	}

}
