package com.String;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random r = new Random();
		
		// mobile no 
		for(int i=1;i<=10;i++) {
			int num = r.nextInt(10);
			System.out.print(num);	
		}
		

	}

}
