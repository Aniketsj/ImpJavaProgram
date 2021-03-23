package com.Inheritance;

public class MultipleI implements Demo1,Demo2 {

	public static void main(String[] args) {
		
		MultipleI m =new MultipleI();
		m.show();
	}

	@Override
	public void show() {
		System.out.println("s");
		
	}

}
