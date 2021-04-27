package com.String;

public class ReverseOrderOfString {

	public static void main(String[] args) {
		String str = "aniket jadhav";

		String[] s1 = str.split(" ");
		
		String ss1 = "";
		for (int i = s1.length-1; i >= 0; i--) {
			ss1 = ss1 + s1[i]+" ";
		}
		System.out.println(ss1.trim());
	}

}
