package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListV1 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		System.out.println("is al is empty()= " + al.isEmpty());
		al.add("Jadhav");
		al.add("Aniket");
		al.add("test");
		al.add("java");
		al.add("Oracle");
		
		Collections.addAll(al, "Arcitech","SDET");
		
		
		System.out.println("--------for loop");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}

		System.out.println("----------------------------foreach----------------------------------");
		for (String a : al) {
			System.out.println(a);
		}
		
		System.out.println("sort------------------------");
		Collections.sort(al);
		
		System.out.println("after sorting -------------------------------");
		for (String a : al) {
			System.out.println(a);
		}
		
		Collections.reverseOrder();
		System.out.println("reverse order-------------------------");
		for (String a : al) {
			System.out.println(a);
		}
		
		
		
		System.out.println("sorting");
		Collections.sort(al);
		for(String aa:al){
			System.out.println("after sort = "+aa);
		}
		
		
		

	}

}
