package com.collectionDec21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayToList {

	public static void main(String[] args) {

		String str[] = { "aniket", "jadhav", "automation", "TechArchitech" };

		List<String> li = new ArrayList<String>();
		for (String element : str) {
			li.add(element);
		}

		System.out.println(li);

		li.forEach(s -> System.out.println("test--------" + s));

		Iterator itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(li.get(1));

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

		Collections.sort(li);
		System.out.println(li);

	}

}
