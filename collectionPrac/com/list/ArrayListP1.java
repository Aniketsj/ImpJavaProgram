package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListP1 {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(4);
		li.add(2);
		li.add(5);
		System.out.println(li);
		Collections.sort(li,Collections.reverseOrder());
		System.out.println(li);
		
		System.out.println(Collections.min(li));
		System.out.println(Collections.max(li));
//		
//		System.out.println(li);
//		System.out.println(l1);
//		li.addAll(l1);
//		System.out.println(li);
//		
//		//remove
//		System.out.println(li);
//		li.remove(1);
//		System.out.println(li);
//		System.out.println("list iterator");
//		
//		ListIterator<Integer> it   = li.listIterator(li.size());
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//		}
				
		
//		ListIterator<Integer> ii = li.listIterator();
//		while(ii.hasNext()) {
//			System.out.println(ii.next());
//		}
//		System.out.println("has previous");
//		
//		while(ii.hasPrevious()) {
//			System.out.println(ii.previous());
//		}
		
//		for (int i = 0; i < li.size(); i++) {
//			int value = li.get(i);
//			System.out.println(value);
//
//		}
//		System.out.println(li);
//		Collections.sort(li);
//		System.out.println(li);
//		for (Integer i : li) {
//			System.out.println(i);
//		}
//
//		System.out.println("iterating");
//		Iterator<Integer> itr = li.iterator();
//		while(itr.hasNext()) {
//			int value = itr.next();
//			System.out.println(value);
//		}

	}

}
