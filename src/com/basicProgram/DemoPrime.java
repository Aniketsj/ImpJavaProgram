package com.basicProgram;

public class DemoPrime {
	
	public static boolean checkIsPrime(int no){
		for(int i=2;i<no;i++){
			if(no%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		boolean b= checkIsPrime(7);
		System.out.println(b);
	}

}
