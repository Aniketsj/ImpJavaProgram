package com.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer>ss =new TreeSet<>();
		ss.add(1);
		ss.add(11);
		ss.add(2);
		ss.add(7);
		ss.add(2);
		
		System.out.println(ss);
		System.out.println(ss.descendingSet());
		Iterator<Integer> itr = ss.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(ss);
		System.out.println(ss.pollFirst());
		System.out.println(ss.pollLast());
		System.out.println(ss);
	}

}
