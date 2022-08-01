package com.String;

import java.util.ArrayList;

public class NamesContainsString {

	public static void main(String[] args) {

		String[] str = { "aniket jadhav", "Damini jadhav", "Deepak kadam", "Divya Kadam" };
		String s = "jadhav";
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			if (str[i].contains(s)) {
				arr.add(str[i]);
			}
		}

		for (String st : arr) {
			System.out.println(st);
		}
	}

}
