package com.interfaceTest;

interface Bank {
	
	public void display();
	default void defaultMethod() {
		System.out.println("defaultMethod");
	}

}
