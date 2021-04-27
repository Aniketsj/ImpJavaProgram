package com.superKey;

public class AA extends A {
	int a = 20;
	public AA() {
		super();
		System.out.println("aa constuctor");
	}
	public void bark() {
		System.out.println("bark");
		System.out.println(super.a);
		System.out.println(a);
	}
	public void eat() {
		super.d();
		bark();
	}
	
	

	public static void main(String[] args) {
		AA a1 = new AA();
		
		a1.eat();

	}

}
