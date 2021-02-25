package com.basicProgram;

public class PrimeNumberOrNot {

	public static boolean checkPrimeNumber(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		
		for(int i=2;i<=10;i++){
		boolean value = checkPrimeNumber(i);
		System.out.println(i +"is a "+value);
		}

	}
}
