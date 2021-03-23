package com.prac;

public class Febo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=1, no2=2;
		int no3;
		System.out.print(no1+" "+no2);
		for(int i=2;i<=5;i++) {
			no3 = no1+no2;
			System.out.print(" "+no3);
			no1=no2;
			no2=no3;
		}

	}

}
