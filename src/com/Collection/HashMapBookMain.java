package com.Collection;

import java.util.Map;

public class HashMapBookMain {

	public static void main(String[] args) {

		Map<Integer, HashMapBook> mp = (Map<Integer, HashMapBook>) new HashMap();
		HashMapBook h = new HashMapBook(1, "aniket", "jadhav");
		HashMapBook h1 = new HashMapBook(11, "t", "y");

		mp.put(1, h);
		mp.put(2, h1);

		for (Map.Entry<Integer, HashMapBook> e : mp.entrySet()) {
			Integer key = e.getKey();
			HashMapBook hb = e.getValue();
			System.out.println(hb.id + " " + hb.author + " " + hb.name);
		}

	}

}
