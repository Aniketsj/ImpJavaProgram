package com.basicProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		//prime 7
		
		int no =9,temp=0;
		for(int i=2;i<=no-1;i++){
			if(no%i==0){
				temp = temp + 1;
			}
		}
		if(temp>0){
			System.out.println("not prime");
		}else{
			System.out.println("prime");
		}
	}

}
