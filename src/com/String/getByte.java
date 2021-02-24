package com.String;

public class getByte {

	public static void main(String[] args) {

		char str = 'A';
		int a = str;
		System.out.println(a);
		
		String str1 = "Aniket";
		byte c[] = str1.getBytes();
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
		
	}

}
