package com.String;

public class Reverse {

	public static void main(String[] args) {
		int no=12345;
		String s=String.valueOf(no);
		StringBuffer sb=new StringBuffer(s);
		
		System.out.println(sb.reverse());
		
		int rem;
		int rev = 0;
		
		while(no!=0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		
		System.out.println(rev);
	}	

}
