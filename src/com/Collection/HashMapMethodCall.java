package com.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapMethodCall {

	public static HashMap<String, Integer> hm() {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Aniket",1);
		hm.put("Jadhav", 2);
		return hm;
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> hmm = HashMapMethodCall.hm();
		for (Map.Entry<String, Integer> string : hmm.entrySet()	) {
			System.out.println(string.getKey()+" "+string.getValue());
			
		}
	}

}
