package com.basicProgram;

public class Fibonacci {

	public static void main(String[] args) {

		
		//0 1 1 2 3 5 8 13 21 34 55
		int no1=0, no2=1,count=10,no3;
		
		System.out.print(no1+" "+no2);
		for(int i=2;i<=count;++i){
			no3=no1+no2;
			System.out.print(" "+no3);
			no1=no2;
			no2	=no3;
			
		}
	}

}
