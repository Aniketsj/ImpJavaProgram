package com.superk;

public class BikeMain extends Bike {

	int a = 12;
	int c = 56;

	BikeMain() {
		System.out.println("Bikemain constructor");
	}

	BikeMain(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}

	public void run() {
		System.out.println("bike main running");
		super.run();
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		BikeMain bb = new BikeMain();
		bb.run();
		System.out.println(bb.a);

	}

}
