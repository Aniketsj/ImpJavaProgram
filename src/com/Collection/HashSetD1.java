package com.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> sh =new LinkedHashSet<>();
		sh.add("A");
		sh.add("");
		sh.add(null);
		sh.add(null);
		sh.add("a");
		sh.add("a");
		
		for (String s : sh) {
			System.out.println(s);
		}
		
		HashSet<Object> hs=new HashSet<>();
		hs.add("a");
		hs.add(1);
		for (Object object : hs) {
			System.out.println(object);
		}

	}

}
