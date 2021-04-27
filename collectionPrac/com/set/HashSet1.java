package com.set;

import java.util.HashSet;
import java.util.Set;



public class HashSet1 {

	public static void main(String[] args) {

		Set<String> ss =new HashSet<>();
		ss.add("aniket");
		ss.add("aniket");
		ss.add("b");
		ss.add(null);
		ss.add(null);
		for(String s1 :ss) {
			System.out.println(s1);
		}

	}

}
