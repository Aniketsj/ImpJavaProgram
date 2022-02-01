package com.collectionDec21;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Aniket");
		al.add("Jadhav");
		al.add("Test");
		al.add("Automation");
		al.add("Architech");

		Collections.addAll(al, "Manual", "Demo");

		System.out.println("al list: " + al);

		String[] str = { "a", "b" };
		Collections.addAll(al, str);
		System.out.println("after string array al list: " + al);

		System.out.println("before sort : " + al);

		Collections.sort(al);
		System.out.println("after sort : " + al);
		System.out.println("reverse order");
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("aftre revese: =" + al);

	}

}
