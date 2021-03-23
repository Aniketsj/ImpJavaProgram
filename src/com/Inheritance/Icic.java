package com.Inheritance;

public class Icic implements Bank {

	public static void main(String[] args) {
		Bank b = new Hdfc();
		System.out.println(b.rateOfI());
		b.methid();

	}

	@Override
	public int rateOfI() {
		// TODO Auto-generated method stub
		return 10;
	}

}
