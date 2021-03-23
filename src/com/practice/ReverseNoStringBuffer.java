package com.practice;

public class ReverseNoStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 12345;
		StringBuffer sb = new StringBuffer(String.valueOf(no));
		
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
	}

}
