package com.String;

public class ReverString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Aniket";
		
		char c[] = a.toCharArray();
		System.out.println(c.length);
		for(int i = c.length-1;i>=0;i--){
		
			System.out.println(c[i]);
		}

	}

}
