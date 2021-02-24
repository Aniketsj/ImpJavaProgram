package com.AbstractClass;

public class Honda extends Abstract1{

	public static void main(String[] args) {
		Abstract1 a = new Honda();
		a.run();
	}

	@Override
	void run() {
		System.out.println("this is run method");
	}

}
