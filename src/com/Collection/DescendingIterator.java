package com.Collection;

import java.util.ArrayList;

public class DescendingIterator {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("Aniket");
		al.add("Jadhav");
		al.add("test");
		
		for(String s:al) {
			System.out.println(s);
		}
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("new");
		al1.add("Aniket");
		al1.add("demo");
		System.out.println("after added all");
		al.addAll(al1);
		for(String s:al) {
			System.out.println(s);
		}
		
		al1.retainAll(al);
		System.out.println("after retain");
		for(String s:al1) {
			System.out.println(s);
		}
		
	
		
	}

}
