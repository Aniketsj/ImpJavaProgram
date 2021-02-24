package com.diff.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListV1 {

	public static void main(String[] args) {

		/*list
		1 maintain insertion order, allow duplicate elements,
		
		set
		not maintain, only one null value
		*/
		List<String> li = new ArrayList<>();
		li.add("A");
		li.add("W");
		li.add(null);
		li.add("E");
		li.add("V");
		li.add(null);
		li.add("A");
		for (String s : li) {
			System.out.println(s);
		}
		System.out.println("Set***************************************");
		Set<String> st = new HashSet<>();
		st.addAll(li);
		for (String s1 : st) {
			System.out.println(s1);
		}
		
		
		
		
	}

}
