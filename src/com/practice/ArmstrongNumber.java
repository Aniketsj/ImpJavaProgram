package com.practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int no = 153, sum = 0, rem;
		int temp = no;
		while (no > 0) {
			rem = no % 10;
		
			no = no / 10;
		
			sum = sum + (rem * rem * rem);
		
		
		}
		System.out.println(sum);
		System.out.println(no);
		if(sum==temp) {
			System.out.println("No is Armstrong");
		}else {
			System.out.println("No is not Armstrong");
		}
	}

}
