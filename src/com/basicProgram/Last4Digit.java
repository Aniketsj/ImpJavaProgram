package com.basicProgram;

public class Last4Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "41111XXXX1111";
		String ss = str.substring(str.lastIndexOf("X")+1);
		System.out.println(ss);
		
		System.out.println(str.endsWith(ss));

	}

}
