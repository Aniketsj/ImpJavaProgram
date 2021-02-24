package com.Collections;

import java.util.LinkedList;

public class LinkedListV1 {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		ll.add("ANiket");
		ll.add("Jadhav");
		ll.add("Tst");
		ll.addFirst("First");
		ll.addLast("Last");
		
		System.out.println("first = "+ll.getFirst());
		System.out.println("LAst = "+ll.getLast());
		System.out.println("Peek = "+ll.peek());
		System.out.println("poll first  = "+ll.pollFirst());
		System.out.println("poll last = "+ll.pollLast());
		System.out.println("size= "+ll.size());
		
		
		for(String a:ll){
			System.out.println(a);
		}
	}

}
