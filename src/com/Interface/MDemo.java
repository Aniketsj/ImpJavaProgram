package com.Interface;

public class MDemo implements MInterface, MInterface1 {

	public static void main(String[] args) {
		MDemo m = new MDemo();
		m.show();

	}

	@Override
	public void show() {
		System.out.println("show");
		
	}

}
