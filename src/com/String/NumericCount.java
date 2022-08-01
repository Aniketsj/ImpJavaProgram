package com.String;

public class NumericCount {

	public static void main(String[] args) {
		String str = "anik2et07";
		String s = "";
		int count = 0;
		String ss = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				count++;
				s = s + str.charAt(i);
			} else {
				ss = ss + str.charAt(i);
			}
		}
		System.out.println(count + "  = " + s+" "+ss);
	}
	
	
	

}