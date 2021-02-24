package com.String;

public class LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Aniket jadhav";
		System.out.println(str.indexOf("a",9));
		System.out.println(str.lastIndexOf("a"));

		
		System.out.println((str.replace("A", "V")));
		System.out.println(str.replace("a", "$"));
		
		System.out.println(str.replaceAll(" ", ""));
	}

}
