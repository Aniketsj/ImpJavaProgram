package com.If.program;

public class IfNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int price = 101;
		int age = 17;
		String menu = null;
		if (price > 100) {
			if (age >= 18) {
				menu = "18";
				System.out.println("Ur eligible");
			} else {
				menu = "17";
				System.out.println("Not eligible");
			}
		} else {
			System.out.println("less than 100");
		}
		System.out.println(menu);
	}
}
