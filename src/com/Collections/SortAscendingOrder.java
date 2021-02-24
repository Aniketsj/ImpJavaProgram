package com.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class SortAscendingOrder {

	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<>();
		al.add("ANiket");
		al.add("test");
		al.add("Java");
		al.add("oracle");
		al.add("Boot");
		
//		System.out.println("array list----------------------------");
//		for(String a: al){
//			System.out.println(a);
//		}
//		Collections.sort(al);
//		System.out.println("after sort------------------");
//		for(String a: al){
//			System.out.println(a);
//		}
//		
//		Collections.sort(al,Collections.reverseOrder());
//		System.out.println("reverse order-----------------------");
//		for(String a: al){
//			System.out.println(a);
//		}
		
		ListIterator<String> lsti = al.listIterator();
		System.out.println(lsti.hasPrevious());
		while(lsti.hasNext()){
			System.out.println("test  "+lsti.next());
		}
		
		System.out.println("has previous");
		System.out.println(al.size());
		System.out.println(lsti.hasPrevious());
		while(lsti.hasPrevious()){
			System.out.println("test  "+lsti.previous());
		}
		
	}

}
