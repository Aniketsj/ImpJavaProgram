package com.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMp {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();	
		hm.put(1, "Aniket");
		hm.put(11, "Aniket");
		hm.put(2, "Aniket");
		hm.put(22, "Aniket");
		
		Iterator<Integer> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			
			int i = itr.next();
			String value  = hm.get(i);
			System.out.println("value is:="+i+" "+value);
		}
		
		System.out.println("*****************entry set");
		
		for (Map.Entry<Integer, String> mp:hm.entrySet()) {
			int key = mp.getKey();
			String value = mp.getValue();
			System.out.println(key+ " "+value);
			
		}
		

	}

}
