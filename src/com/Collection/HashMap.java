package com.Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, null);
		map.put(2, "test");
		map.put(3, "aniket");
		map.put(23, "automation");

		System.out.println("*************while loop");
		Set m = map.entrySet();
		Iterator it = m.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		// for
		System.out.println("*************for loop");
		for (Map.Entry mp : map.entrySet()) {
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

		System.out.println("----------------------keyset");
		Set ms = map.keySet();
		Iterator i1 = ms.iterator();
		while (i1.hasNext()) {
			Integer key = (Integer) i1.next();
			System.out.println("key  =" + key);
			System.out.println("value = " + map.get(key));
		}
		System.out.println("***************for each");
		for (Integer ke : map.keySet()) {
			System.out.println(ke);
			System.out.println(map.get(ke));
		}
		
		
		
	}

}
