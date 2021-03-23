package com.InterfaceData;

public class Demo {

	public static void main(String[] args) {
		Bank1 b2 = new SBI();
		b2.payment();
		Bank1 b3 = new HDFC1();
		b3.payment();
		Bank1.staticMethod();
		int aa = Bank1.a;
		System.out.println(aa);
		
	}

}
