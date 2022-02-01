package com.collectionDec21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Aniket");
		hm.put(22, "Test");
		hm.put(13, "Architech");
		hm.put(24, "Automation");
		hm.put(17, "SDET");

		System.out.println("key set -------------------------------------------------");
		Set<Integer> s = hm.keySet();
		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			String val = hm.get(key);
			System.out.println("key = " + key + " value= " + val);
		}
		for (Integer i : hm.keySet()) {
			System.out.println(" -------------" + i);
			System.out.println(hm.get(i));
		}

		System.out.println("Entry set -------------------------------------------------");

		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("----------------------------method---------------------------------------");
		hm.put(11, "test");
		hm.putIfAbsent(11, "t");
		for (Map.Entry<Integer, String> mm : hm.entrySet()) {
			System.out.println(mm.getKey() + " " + mm.getValue());
		}

		System.out.println("copy map-----------------");
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(111, "Aniket");
		hm1.put(222, "Test");
		hm1.put(133, "Architech");
		hm1.put(244, "Automation");
		hm1.put(177, "SDET");

		hm1.putAll(hm);

		for (Map.Entry<Integer, String> it : hm1.entrySet()) {
			System.out.println(it.getKey() + " " + it.getValue());
		}

	}

}
