package com.String;

public class CharArray {

	public static void main(String[] args) {

		String str = "Aniket Jadhav";
		char[] ch = str.toCharArray();
		for(char c : ch){
			System.out.println(c);
		}
		
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
	}

}
