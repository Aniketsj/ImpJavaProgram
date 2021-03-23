package com.AbstractClass;

public class AbstractVoidMain {

	public static void main(String[] args) {
		PaymentMethod pm;
		pm = new CreditCart();
		pm.payment();
		pm.change();
		PaymentMethod.staticMethod();
		int st = pm.as;
		System.out.println(st);
		pm = new DebitCard();
		pm.payment();

	}

}
