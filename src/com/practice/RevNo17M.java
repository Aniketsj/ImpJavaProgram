package com.practice;

public class RevNo17M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 12345, rem, rev = 0;
		while(no>0) {
			rem = no % 10;
			rev = rev * 10 +rem;
			no = no / 10;
		}
		
		System.out.println("reverse no is = "+rev);
		int a = 12345;
		StringBuffer sb = new StringBuffer(String.valueOf(a));
		StringBuffer rv = sb.reverse();
		System.out.println(rv);

	}

}
