package com.collectionDec21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Four");
		al.add("Five");

		System.out.println("al------------" + al);
		System.out.println("for each---------------------------------");
		for (String number : al) {
			System.out.println(number);
		}
		System.out.println("for loop---------------------------------");
		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));
		}
		System.out.println("Iterator---------------------------------");

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Reverse order--------------------------");

		ListIterator<String> list1 = al.listIterator(al.size());
		while (list1.hasPrevious()) {
			System.out.println(list1.previous());
		}

		System.out.println("For each method--------------------------");

		al.forEach(s -> System.out.println(s));

		System.out.println("Collection sort------------------------------");
		Collections.sort(al);
		Iterator itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Set----------------------");
		System.out.println(al);
		al.set(1, "Ten");
		System.out.println(al);

		ArrayList<String> al2=new ArrayList<String>();
		al2.add("A");
		al2.add("Z");
		al2.add("R");
		al2.add("T");
		al2.add("S");
		
		al.addAll(al2);
		System.out.println(al);
		al.retainAll(al2);
		System.out.println(al);

	}

}
