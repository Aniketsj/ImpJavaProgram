package com.Polymorphism;

public class TestRunTimePolymorphism {

	public static void main(String[] args) {

		Bank b;
		b = new Bank();
		System.out.println(b.getRateOfInterest());
		b = new Sbi();
		System.out.println(b.getRateOfInterest());
		b = new Hdfc();
		System.out.println(b.getRateOfInterest());

	}

}
