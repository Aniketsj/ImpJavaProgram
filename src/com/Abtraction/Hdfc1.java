package com.Abtraction;

public class Hdfc1 extends Bank1 {

	public static void main(String[] args) {
		Bank1 b = new Hdfc1();
		b.run();
		b.display();
		System.out.println(b.a);
	}

	@Override
	void run() {
		System.out.println("runing method");
		
	}

}
