package com.practice;

public class RevO {

	public static void main(String[] args) {

		String str = "aniket jadhav automation";
		char[] ch = str.toCharArray();
		int pre = str.length() - 1;
		String s1 = "";
		
		
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == ' ') {
				s1 = str.substring(i+1,pre);
				pre= i;
		
			}
		}
		
		
		System.out.println(s1);
	}

}
