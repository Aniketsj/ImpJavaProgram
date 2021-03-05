package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListWithAllIterator {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		list.add("Aniket");
		list.add("Jadhav");
		list.add("Automation");
		list.add("Pune");
		
		System.out.println("***********************************through for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("*********************through for each");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("*******************through iterator interface");
		Iterator<String>itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("list iterator****************");
		ListIterator<String> str = list.listIterator(list.size());
		System.out.println(str.hasPrevious());
		while(str.hasPrevious()) {
			String pre = str.previous();
			System.out.println(pre);
		}
 
	}

}
