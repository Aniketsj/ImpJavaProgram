package com.diff.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListV2 {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();
		li.add("Z");
		li.add("A");
		li.add("B");
		li.add("A");
		li.add("D");
		
		for (String s1 : li) {
			System.out.println("List order : "+s1);
		}
		System.out.println("hashset*****************************");
		Set<String> st=new HashSet<>();
		st.addAll(li);
		for (String s2 :st) {
			System.out.println("List order : "+s2);
		}
		
	}

}
