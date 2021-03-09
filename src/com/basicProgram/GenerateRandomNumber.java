package com.basicProgram;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int a = 0;
		for(int i=1;i<=10;i++){
		 a = random.nextInt(500);
		 System.out.println(a);
		}
		
		System.out.println("------------------------------");
		char aaa = 'a';
		int ab = aaa;
		System.out.println(ab);
		
		int ch = 'a';
		System.out.println(ch);
		
		for(int i=0;i<=255;i++){
			System.out.println("Ascii value of "+(char)i+" = "+i);
		}
		
		char a1= 'a';
		int a2 = a1;
		System.out.println(a2);

	}

}
