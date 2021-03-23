package com.basicProgram;

public class SwapNo {

	public static void main(String[] args) {

		int no1 = 10, no2 = 20;
		//no1 = 20, no2 = 10
		System.out.println("Before swap no is "+no1+" "+no2);
		no1 = no1 * no2;
		no2 = no1 / no2;
		no1 = no1 / no2;
		
		System.out.println("After swap no is "+no1+" "+no2);
	}

}
