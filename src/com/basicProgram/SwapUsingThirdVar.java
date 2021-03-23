package com.basicProgram;

public class SwapUsingThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 10, no2 = 20, temp;
		System.out.println("Before swap no is "+no1+" "+no2);
		temp = no1;
		no1= no2;
		no2 = temp;
		
		System.out.println("After swap no is "+no1+" "+no2);
	}

}
