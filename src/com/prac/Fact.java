package com.prac;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 1 * 1 1* 2 2* 3 6 * 4 24 * 5
		
		int fact =1;
		
		for(int i=1;i<=5;i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

}
