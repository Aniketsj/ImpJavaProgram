package com.String;

public class StringContainDigit {

	public static void main(String[] args) {
		String str = "I have 2 cro3re 1.22";
		String digit = "";
		int count = 0;
		for(int i = 0;i<str.length();i++) {
		if(str.charAt(i)!=' ') {
			boolean isDigit = Character.isDigit(str.charAt(i));
			System.out.println(isDigit);
			if(isDigit) {
				 digit = digit + str.charAt(i);
				 count++;
			}
			}
		}
		System.out.println(digit);
		System.out.println("Count is: "+count);
			

	}

}
