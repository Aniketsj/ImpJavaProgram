package com.Abstraction;

public class Demo {

	public static void main(String[] args) {
		Bank b;
		b =new Sbi();
		
		b.getRateOfInterest();
		b.finalMethod();
		Bank.staticMethod();
		System.out.println(b.b);
		
		
		
		
	}

}
