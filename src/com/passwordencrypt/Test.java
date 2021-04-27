package com.passwordencrypt;

import java.util.Base64;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aniket12345";

		String en = Base64.getEncoder().encodeToString(str.getBytes());
		System.out.println(en.toString());
		
		byte[] de = Base64.getDecoder().decode(en);
		System.out.println(new String(de));
		System.out.println(de.toString());
		System.out.println(String.valueOf(de));
	}

}
