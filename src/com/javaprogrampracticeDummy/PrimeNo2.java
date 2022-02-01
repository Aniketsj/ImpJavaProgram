package com.javaprogrampracticeDummy;

public class PrimeNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result = checkPrime(7);
		System.out.println(result);
	}
	
	public static boolean checkPrime(int no) {
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				return false;
			}
		}
		return true;

	}

}
