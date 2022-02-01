package com.collectionDec21;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Aniket");
		ts.add("Automation");
		ts.add("Architech");
		ts.add("Test");
		// size
		System.out.println(ts.size());

		// iterator
		Iterator itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// descending iterator
		Iterator it = ts.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Integer-----------------------");
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(1);
		t.add(22);
		t.add(45);
		t.add(2);
		t.add(3);
		t.add(4);
		
		System.out.println(t);
		
//		System.out.println("high: "+t.pollFirst());
//		System.out.println("Low "+t.pollLast());
		
		System.out.println(t.descendingSet());
		
		System.out.println(t.headSet(22,false));
		System.out.println(t.tailSet(22,false));
		System.out.println(t.subSet(2,true,22,false));
	}

}
