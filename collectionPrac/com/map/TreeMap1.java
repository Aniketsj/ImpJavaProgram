package com.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "niket");
		tm.put(2, "aniket");
		tm.put(11, "test");
		tm.put(7, "ts");
		
		System.out.println(tm.descendingKeySet());
		System.out.println(tm.descendingMap());

		
		for(Map.Entry entry : tm.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
	}

}
