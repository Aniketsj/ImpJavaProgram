package com.superKey;

public class B extends A{
	@Override
	public void display() {
		System.out.println("B display");
	}
	
	public static void main(String[]args) {
		A a =new B();
		a.display();
		A a2 = new A();
		a2.display();
	}
}
