package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddCartWithCollection {

	public static void main(String[] args) {

		String[] products = { "brokoli", "cucumber", "tomato" };

		List<String> prod = Arrays.asList(products);

		ArrayList<String> al = new ArrayList<String>();
		al.add("test");
		al.add("cucumber");
		al.add("automation");
		int count = 0;

		for (int i = 0; i < al.size(); i++) {
			String nm = al.get(i);
			if (prod.contains(nm)) {
				count++;
				System.out.println(nm);
			}
		}
		System.out.println(count);
	}

}
