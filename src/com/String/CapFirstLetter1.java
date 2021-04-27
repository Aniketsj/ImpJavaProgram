package com.String;

public class CapFirstLetter1 {

	public static void main(String[] args) {
		
		String str = "aniket jadhav";
		String[] s = str.split(" ");
		for (String string : s) {
			String f = string.substring(0,1).toUpperCase();
			String rem = string.substring(1,string.length()).toLowerCase();
			String com = f+rem;
			System.out.println(com);
		}

	}

}
