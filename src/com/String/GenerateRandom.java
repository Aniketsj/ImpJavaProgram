package com.String;

import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
		Random r  = new Random();
		int t = 0;
		
		for(int i=1;i<=10;i++) {
			t = r.nextInt();
		}
		System.out.println(t);
			
		
		
		
		
	}

}
