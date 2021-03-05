package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {

		TreeSet<String> tset=new TreeSet<String>();
		tset.add("test");
		tset.add("Aniket");
		tset.add("Jadhav");
		tset.add("B");
		tset.add("Z");
		tset.add("B");
		
		for (String string : tset) {
			System.out.println(string);
		}
		
		System.out.println("decending order************************");
		Iterator<String>dc = tset.descendingIterator();
		while(dc.hasNext()) {
			System.out.println(dc.next());
		}
		
		
		System.out.println("********************"+tset);
		
		System.out.println(tset);
		System.out.println(tset.headSet("Jadhav"));
		System.out.println(tset.headSet("Jadhav",true));
		System.out.println(tset.subSet("Aniket",false,"Jadhav",true ));
		System.out.println(tset.tailSet("Jadhav"));
	}

}
