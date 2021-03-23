package com.Collection;

import java.util.HashMap;

public class HM {

	public static void main(String[] args) {
		int i=1;
		HashMap<String,Integer> hm =  new HashMap<>();
		hm.put(null, 1);
		hm.put(i+"", 2);
		hm.put("i", 4);
		hm.put(null, 5);
		System.out.println(hm.get(null));
		System.out.println(hm.get("i"));


	}

}
