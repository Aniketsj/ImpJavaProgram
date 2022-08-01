package com.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEntrySet {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "aniket");
		hm.put(2, "jadhav");
		hm.put(4, "test");
		hm.put(3, "automation");

		for (Map.Entry<Integer, String> en : hm.entrySet()) {
			int a = en.getKey();
			String v = en.getValue();
			System.out.println(a + " " + v);
		}

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		java.util.Set<Integer> s = hm.keySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			String v = hm.get(i);
			System.out.println("value  =" + v);
		}
		
	
		hm.replace(4, "t");
		System.out.println("after---------------------");
		for (Map.Entry<Integer, String> en : hm.entrySet()) {
			int a = en.getKey();
			String v = en.getValue();
			System.out.println(a + " " + v);
		}
	}

}
