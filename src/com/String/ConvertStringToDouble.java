package com.String;

public class ConvertStringToDouble {

	public static void main(String[] args) {
		
		String str = "$100.22";
		str = str.replace("$","").replace(",", "");
		double d=Double.parseDouble(str);
		
		System.out.println(d);
	}

}
