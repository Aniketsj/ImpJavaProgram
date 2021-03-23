package com.prac;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Aniket";
		char  b = ' ';
		String rev = "";
		for(int i=a.length()-1;i>=0;i--) {
			 rev = rev + a.charAt(i);
		
		}
		System.out.println(rev);
	}

}
