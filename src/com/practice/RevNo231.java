package com.practice;

public class RevNo231 {

	public static void main(String[] args) {

		int no = 12345;
		int rem, rev = 0;

		while (no != 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.print(rev);

		int no1 = 12345;
		String rvv  = "";
		String r = String.valueOf(no1);
		for (int i = r.length()-1; i >=0; i--) {
			rvv = rvv + r.charAt(i);
		}
		System.out.println("rever string: "+rvv);
	}

}
