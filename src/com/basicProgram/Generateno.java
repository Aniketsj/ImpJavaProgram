package com.basicProgram;

import java.util.Random;

public class Generateno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r =new Random();
		for(int i =1;i<=10;i++) {
		int a = r.nextInt(10);
		System.out.print(a);
		}

	}

}
