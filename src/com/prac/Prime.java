package com.prac;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no;
		for( no=1;no<=10;no++) {
			int temp=0;
		for(int i= 2;i<no;i++) {
			if(no%i==0) {
				temp = temp + 1;
			}
		}
		if(temp>0) {
			System.out.println(no +" no  is no prime");
		}else {
			System.out.println(no+" no is prime");
		}
		}
		

	}

}
