package com.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {

		Map<String, Integer> map=new HashMap<>();
		map.put("Aniket", 1);
		map.put("Jadhav", 4);
		map.put("Jadhav", 5);
		map.put("S",null);
		
		
		Set<String> keys = map.keySet();// aniket, Jadhav
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = (String) itr.next();// aniket
			Integer value = map.get(key);
			System.out.println(key+ " "+value);
		}
//		System.out.println("for");
//		for (String K1 : keys) {
//			System.out.println("inside for each"+keys.size()+" K1 "+K1);
//			int value = map.get(K1);
//			System.out.println(K1+" "+value);
//			
//		}
		
		for(Map.Entry en:map.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}
		
}
