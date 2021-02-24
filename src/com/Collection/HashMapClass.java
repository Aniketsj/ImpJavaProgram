package com.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map1 = new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		
		Iterator<Integer> s1 = map1.keySet().iterator();
		while(s1.hasNext()){
			Integer key = s1.next();
			String value =map1.get(key);
			System.out.println(key +" = "+value);
			
		}
		
		//using entryset
		Iterator<Entry<Integer,String>> it1 = map1.entrySet().iterator();
		while(it1.hasNext()){
			Entry<Integer,String> entry = it1.next();
			System.out.println(entry.getKey()+"  = "+entry.getValue());
		}
	}

}
