package com.basicProgram;

public class CallByValue {

	int a = 100;

	void change(CallByValue a) {
		a.a = a.a +10;
		
	}

	public static void main(String args[]) {
		CallByValue b = new CallByValue();
		System.out.println(b.a);
		b.change(b);
		System.out.println(b.a);
	}
}
