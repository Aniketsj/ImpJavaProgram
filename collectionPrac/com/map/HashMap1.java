package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "aniket");
		map.put(2, "jadhav");
		map.put(3, "test");
		map.put(4, "automation");

		System.out.println("iterating map");

		Set itr = map.entrySet();
		Iterator it = itr.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int key = (int) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println(key + "   " + value);
		}

		System.out.println("iterating useing for");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		System.out.println("key set");
		Set<Integer> s2 = map.keySet();
		Iterator ii = s2.iterator();
		while (ii.hasNext()) {
			
			System.out.println(map.get(ii.next()));
			
		}

	}

}
