package com.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPro {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Aniket");
		map.put(4, "Jadhav");
		map.put(2, "Test");

		System.out.println("map size" + map.size());
		System.out.println("keyset************************");
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			String value = map.get(key);
			System.out.println(key + " " + value);

		}

		System.out.println("entry set************************");
		Set s = map.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("for each ***************************** ");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
