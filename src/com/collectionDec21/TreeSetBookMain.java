package com.collectionDec21;

import java.util.TreeSet;

import com.Collection.Set;

public class TreeSetBookMain {

	public static void main(String[] args) {

		TreeSetBook t = new TreeSetBook(1, "aniket"), t1 = new TreeSetBook(2, "test"), t2 = new TreeSetBook(34, "test"),
				t3 = new TreeSetBook(54, "demo");
		TreeSet<TreeSetBook> s = new TreeSet<TreeSetBook>();
		s.add(t);
		s.add(t1);
		s.add(t2);
		s.add(t3);

		for (TreeSetBook bb : s) {
			System.out.println(bb.id+" "+bb.name);
		}
	}

}
