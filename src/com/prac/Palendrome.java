package com.prac;

public class Palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 370, rem;
		int sum = 0;
		int temp = no;
		
		while(no>0) {
			rem = no % 10;
			sum = sum + (rem * rem * rem);
			no = no / 10;
		}
		if(temp == sum) {
			System.out.println("p");
		}else{
			System.out.println("no p");
		}

	}

}
