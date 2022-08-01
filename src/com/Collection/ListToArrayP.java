package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListToArrayP {

	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();
		li.add("Aniket");
		li.add("test");
		li.add("automation");

		String[] arr = li.toArray(new String[li.size()]);
		for (String a : arr) {
			System.out.println(a);
		}

		Collections.sort(li);
		System.out.println("sort-0--------------------------");
		for (String a : li) {
			System.out.println(a);
		}

		System.out.println("ListIterator----------------------------");
		ListIterator<String> l = li.listIterator(li.size());
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
	}

}
