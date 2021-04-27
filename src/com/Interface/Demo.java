package com.Interface;

public class Demo {

	public static void main(String[] args) {
		Bank b;
		b = new Hdfc();
		b.display();
		System.out.println(b.a);
		Bank.staticMethod();
		int bb = b.getRateOfInt();
		System.out.println(bb);
		b = new Sbi();
		int cc = b.getRateOfInt();
		System.out.println(cc);

	}

}
