package com.superk;

public class Bike {

	int a = 10;
	int b = 20;

	public void run() {
		System.out.println("Bike P is running");
	}

	Bike() {
		System.out.println("Bike constructor");
	}

	Bike(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
