package com.basicProgram;

public class GetNumericFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="Individual 5 Bottles";
		String s = a.substring(a.indexOf('5'));
		System.out.println("test = "+a.substring(a.indexOf(' '), a.indexOf(' ')+2));
		s = s.toLowerCase();
		System.out.println(s);
		
		//
		String aa = a.substring(a.indexOf(' ')+1,a.lastIndexOf(' '));
		System.out.println(aa);
		

	}

}
