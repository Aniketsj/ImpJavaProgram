package com.collectionDec21;

import java.util.HashMap;
import java.util.Map;

public class HashMapBookMain {

	public static void main(String[] args) {
		HashmapBook bk = new HashmapBook(1, "test1", "nametest", 11),
				bk1 = new HashmapBook(2, "test2", "nametest2", 22);

		HashMap<Integer, HashmapBook> hmb = new HashMap<Integer, HashmapBook>();
		hmb.put(1, bk);
		hmb.put(2, bk1);

		// traverse

		for (Map.Entry<Integer, HashmapBook> bkk : hmb.entrySet()) {
			int k = bkk.getKey();
			HashmapBook hb = bkk.getValue();
			System.out.println("key " + k);
			System.out.println(hb.id + " " + hb.name + " " + hb.author + " " + hb.qty);
		}
	}

}
