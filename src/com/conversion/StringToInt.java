package com.conversion;

public class StringToInt {
	
	public static void main(String[] args) {
		String a= "200";
		int aa = Integer.parseInt(a);
		System.out.println(aa);
		
		int a1 = Integer.valueOf(a);
		System.out.println(a1);
		
		String a2 = "aniket";
		int a3 = Integer.parseInt(a2);
		System.out.println(a3);
	}

}
