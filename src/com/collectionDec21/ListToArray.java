package com.collectionDec21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("test");
		li.add("first");
		li.add("second");
		li.add("third");

		System.out.println(li);

		String str[] = li.toArray(new String[li.size()]);
		String str1[] = li.toArray(new String[li.size()]);
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str1));
	}

}