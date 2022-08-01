package com.Abtraction;

public class DemoM extends DemoP{

	public static void main(String[] args) {
		DemoP d=new DemoM();
		d.run();
		d.nonabstract();
		d.demostatic();
		DemoM.demostatic();
		System.out.println(d.a);
		d.fin();

	}

	@Override
	public void run() {
		System.out.println("run DemoM");
		
	}

}
