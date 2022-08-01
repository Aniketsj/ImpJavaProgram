package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaxNu {

	public static void main(String[] args) {
		int[] a = { 7, 8, 77, 9 };
		List<Integer> ll = new ArrayList<Integer>();
		for (int aa : a) {
			ll.add(aa);
		}

		Integer i = Collections.max(ll);
		System.out.println("i= " + i);
	}

}
