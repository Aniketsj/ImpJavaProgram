package com.Abtraction;

public abstract class Bank {

	Bank(){
		System.out.println("this is Bank constructor");
	}
	public abstract void rateOfInterest();
	public void getBankName() {
		System.out.println("this is non abstract method");
	}
	int i=9;
	final int w=1;
	public final void fMethod(){
		
		System.out.println("final"+i);
	}

}
