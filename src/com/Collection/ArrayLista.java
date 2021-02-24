package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLista {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Aniket");
		al.add("Jadhav");
		al.add("Automation");
		al.add("Engineer");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("************for each*********************************");
		for (String a : al) {
			System.out.println(a);
		}
		System.out.println("****************Get and set");
		// get and set
		System.out.println(al.get(3));
		System.out.println(al.set(3, "test"));
		System.out.println(al.get(3));
	}

}
