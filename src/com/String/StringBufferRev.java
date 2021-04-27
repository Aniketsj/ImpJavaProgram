package com.String;

public class StringBufferRev {

	public static void main(String[] args) {
		
		String str = "nitin";
		
		StringBuilder sb = new StringBuilder(str);
		StringBuilder s1 =sb.reverse();
		System.out.println(s1);
		
		if(str.equals(s1.toString())) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		

	}

}
