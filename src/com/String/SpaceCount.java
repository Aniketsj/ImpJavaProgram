package com.String;

public class SpaceCount {

	public static void main(String[] args) {

		String s = "aniket jadhav automation java";
		int count= 0;
		for(int i = 0;i<s.length()-1;i++) {
			if(s.charAt(i)!=' ') {
				count ++;
			}
		}
		System.out.println(count);
	}

}
