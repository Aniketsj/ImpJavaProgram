package com.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortReverseOrder {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Jadhav");
		al.add("Aniket");
		al.add("test");
		al.add("java");
		al.add("Oracle");

		for (String a : al) {
			System.out.println(a);
		}

		Collections.sort(al);
		System.out.println("--------------");
		for (String a : al) {
			System.out.println(a);
		}

		Collections.sort(al, Collections.reverseOrder());
		System.out.println("--------------");
		for (String a : al) {
			System.out.println(a);
		}
	}

}
