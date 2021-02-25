package com.basicProgram;

public class IsPrime {
	
	public static boolean checkPrime(int num){
		if(num<=1){
			System.out.println("num < 1");
			return false;	
			
		}
		
		for(int i=2;i<num;i++){
			System.out.println(i);
			if(num%i==0){
				System.out.println("num i="+i);
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean num=checkPrime(5);
		System.out.println(num);
	}

}
