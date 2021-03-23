package com.superk;

public class Sbi extends Bank {
	
	int a = 10;
	int b;
	int c;

	 public Sbi() {
		super();
		System.out.println("sbi con");
		
	}
	 public Sbi(int a, int b, int c) {
		 super(a,b);
		 this.a=a;
		 
	 }
	
	public void display() {
		System.out.println(a);
		System.out.println(super.id);
		super.d();
	}
	
	public static void main(String[] args) {
		Sbi s =new Sbi(1,1,2);
		s.display();

	}

}
