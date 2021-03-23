package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList18 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		System.out.println(al.isEmpty());
		al.add("Aniket");
		al.add("Jadhav");
		al.add("Automation");
		al.add("Java");
		al.add("SDET");
		System.out.println(al.isEmpty());
		System.out.println(al.get(1));
		ArrayList al1 =new ArrayList<>();
		al1.add("ANIKET");
		al1.add("Aniket");
		
		System.out.println("forech**************************************");
		
		for (String list : al) {
			System.out.println(list);
		}
		System.out.println("iterator**************************************");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			String value =(String) itr.next();
			System.out.println(value);
		}
		
		System.out.println("for loop*********************************");
		for(int i = 0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("********************sort");
		System.out.println("before sort = "+al);
		Collections.sort(al);
		for (String string : al) {
			System.out.println(string);
			
		}
		
		System.out.println("*****************list iterator");
		ListIterator<String> li = al.listIterator(al.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		System.out.println("**************retain all");

		System.out.println("al list = "+al);
		System.out.println("al1 list = "+al1);
		al.retainAll(al1);
		System.out.println("al list = "+al);
		System.out.println("al1 list = "+al1);
		for (String rev : al) {
			System.out.println(rev);
		}
	}

}
