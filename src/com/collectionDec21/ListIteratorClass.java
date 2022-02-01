package com.collectionDec21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass {

	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();
		li.add("Test");
		li.add("Automation");
		li.add("Tech");
		li.add("Architech");

		
		
		ListIterator<String> l = li.listIterator(li.size());
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
		
		Collections.sort(li);
		System.out.println(li);
		
	}

}
