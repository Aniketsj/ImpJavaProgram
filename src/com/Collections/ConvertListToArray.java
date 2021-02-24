package com.Collections;

import java.awt.image.ReplicateScaleFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		li.add("A");
		li.add("B");
		li.add("R");
		li.add("Q");
		
		System.out.println("Before sort");
		
		Iterator str = li.iterator();
		while(str.hasNext()){
			System.out.println(str.next());
		}
		System.out.println("After sort");
		
		Collections.sort(li);
		for(String sr:li){
			System.out.println(sr);
		}
		
		
		Collections.sort(li,Collections.reverseOrder());
		System.out.println("after descending order");
		
		for(String rr:li){
			System.out.println(rr);
		}
		
	}

}
