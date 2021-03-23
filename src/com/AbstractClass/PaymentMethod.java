package com.AbstractClass;

public abstract class PaymentMethod {
	public PaymentMethod() {
		System.out.println("this is default constructor");
	}
	
	public abstract void payment();
	int a;
	
	final public void change() {
		System.out.println("this is new method");
	}
	
	public static void staticMethod() {
		System.out.println("this is static method");
	}
	static int as = 19;

}
