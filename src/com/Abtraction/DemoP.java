package com.Abtraction;

public abstract class DemoP {
	DemoP() {
		System.out.println("DemoP constructor");
	}

	abstract public void run();
	int a=10;

	public void nonabstract() {
		System.out.println("non abstract");
	}

	public static void demostatic() {
		System.out.println("demoP static ");
	}
	
	final public void fin() {
		System.out.println("test final");
	}

}
