package com.Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {

		HashSet<String> set=new HashSet<>();
		set.add("Aniket");
		set.add("zest");
		set.add("test");
		set.add("qq");
		set.add(null);
		set.add(null);
		set.add("Aniket");
		
		for (String string : set) {
			System.out.println(string);
		}
		
		System.out.println("**********treeSet");
		
		TreeSet<String> tset=new TreeSet<String>(set);
		for (String string : tset) {
			System.out.println(string);
		}
		
	}

}
