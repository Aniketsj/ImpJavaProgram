package com.basicProgram;

public class SwapNum {

	public static void main(String[] args) {
		int no1 = 10, no2 =20;
		
		no1 = no1 + no2;
		no2 = no1 - no2;
		no1 = no1 - no2;
		
		System.out.println("After swap no is "+no1+" "+no2);
	}

}
