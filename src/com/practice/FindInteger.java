package com.practice;

public class FindInteger {

	public static void main(String[] args) {

		String str = "will eat 2 burgers 23 fries & 1.25 cokes l8r";
		boolean isPreDigit = false;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				boolean isDigit = Character.isDigit(str.charAt(i));
				if (!isDigit) {
					isPreDigit = false;
				} else if (!isPreDigit) {
					if (isDigit) {
						count++;
						isPreDigit = true;
					}
				}
			}
		}
		System.out.println(count);

	}

}
