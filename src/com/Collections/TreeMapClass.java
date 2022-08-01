package com.Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "aniket");
		tm.put(2, "Aniket");
		tm.put(3, "aniket");
		tm.put(3, "test");

		for (Map.Entry a : tm.entrySet()) {
			System.out.println(a.getKey() + " " + a.getValue());

		}
	}

}
