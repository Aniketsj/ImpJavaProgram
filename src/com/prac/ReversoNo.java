package com.prac;

public class ReversoNo {

	public static void main(String[] args) {
		int no = 12345, rev = 0, rem;
		while (no > 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;

		}
		System.out.println("reverse no is " + rev);
		int a = 12345890;
		StringBuffer sb = new StringBuffer(String.valueOf(a));
		StringBuffer rev1 = sb.reverse();
		System.out.println(rev1);
	}

}
