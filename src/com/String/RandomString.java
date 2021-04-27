package com.String;

import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		Random r = new Random();
		int len = 8;

		String ss = "";
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < len; i++) {
			int index = r.nextInt(str.length());
			char c = str.charAt(index);
			String s = Character.toString(c);
			ss = ss + s;
		}
		System.out.println(ss);
	}

}
