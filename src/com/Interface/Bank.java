package com.Interface;

public interface Bank {
	
	public int getRateOfInt();
	default public void display() {
		System.out.println("default method");
	}
	int a =10;
	public static void staticMethod() {
		System.out.println("static methood");
	}
	
	

}
