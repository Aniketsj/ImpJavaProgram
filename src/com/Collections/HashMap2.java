package com.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "Aniket");
		hm.put(2, "Automation");
		hm.put(44, "Test");
		hm.put(32, "Selenium");

		System.out.println("for each loop...................");
		for (Map.Entry entry : hm.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());

		}

		System.out.println("entry set........................");
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			int key = (int) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println(entry.getKey() + " " + entry.getValue());
			System.out.println(key + " " + value);
		}

		System.out.println("key set..........................");
		Set st = hm.keySet();
		Iterator it = st.iterator();
		while (it.hasNext()) {

			System.out.println(hm.get(it.next()));

		}
		System.out.println("keyset foreach.......................");
		for (Integer key : hm.keySet()) {
			System.out.println(key+ " " +hm.get(key));
		}

	}

}
