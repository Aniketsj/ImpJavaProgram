package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		
		int[] a= {1,3,5,2,7,9};
		System.out.println(a.length);
		List<Integer> li = new ArrayList<>();
		for(Integer i:a) {
			li.add(i);
		}
		System.out.println(li);
		System.out.println(li.get(1));
		li.set(1,22);
		System.out.println(li);
	}

}
