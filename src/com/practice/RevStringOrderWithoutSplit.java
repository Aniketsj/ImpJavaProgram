package com.practice;

public class RevStringOrderWithoutSplit {

	public static void main(String[] args) {
		String str = "aniket jadhav automation";
		char[] ch = str.toCharArray();
		int count = 0;
		int pre = str.length();
		
		String s1 = "";
		String s2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (ch[i] == ' ') {
				count++;
				if (count >= 1) {
		
					s1 = str.substring(i+1, pre);
					pre = i;
					s2 = s2 + s1 + " ";
				}
			}
		}

		String s3 = str.substring(0, pre);
		String rvo = s2 + s3;
		System.out.println(rvo);

	}

}
