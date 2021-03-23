package com.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hm1 {
	
	public static void main(String args[]) {
		Map<String, Integer> h = new HashMap<>();
		h.put("A",1);
		h.put("Z", 2);
		h.put(null, 4);
		h.put("S", 22);
		h.put(null, 12);
		
		for(Map.Entry mp : h.entrySet()) {
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
		
	} 

}
