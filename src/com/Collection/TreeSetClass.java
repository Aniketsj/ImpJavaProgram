package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("test");
		ts.add("aniket");
		ts.add("Java");

		for (String s : ts) {
			System.out.println(s);
		}
		
		Iterator it=ts.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
