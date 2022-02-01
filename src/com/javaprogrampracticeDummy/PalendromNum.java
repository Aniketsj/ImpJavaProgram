package com.javaprogrampracticeDummy;

public class PalendromNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 121;
		int temp = no;
		int rev = 0;
		int rem;
		while (no > 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		
		}
		System.out.println(rev);
		if (temp == rev) {
			System.out.println("P");
		} else {
			System.out.println("N P");
		}
	}

}
