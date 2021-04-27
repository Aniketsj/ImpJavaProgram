package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(4);
		li.add(2);
		li.add(5);
		
		Integer[]arr = li.toArray(new Integer[li.size()]);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		List<String> l1 = new ArrayList<>();
		l1.add("aniket");
		l1.add("jadhav");
		String ss[] = l1.toArray(new String[l1.size()]);
	}

}
