package com.AbstractClass;

public abstract class Bank {
	public Bank() {
		System.out.println("constructor");
	}
	
	
	 int b = 20;
	public abstract void getRateOfInterest();
	public static void staticMethod() {
		System.out.println("static method");
	}
	
	public final void finalMethod() {
		int a = 10;
		System.out.println("fianl method");
		System.out.println(a);
		
		
	}
	
	public void nonAbstractMethod() {
		System.out.println("non abstract");
	}
}
