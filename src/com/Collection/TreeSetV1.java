package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetV1 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();
		ts.add("A");
		ts.add("D");
		ts.add("E");
		ts.add("B");
		
		for (String tslist : ts) {
			System.out.println(tslist);
		}
	
		System.out.println("Set : "+ts.size());
		System.out.println("first = "+ts.first());
		//System.out.println("descending = "+ts.descendingSet());
		Iterator itr = ts.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
