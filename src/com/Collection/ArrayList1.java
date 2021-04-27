package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String args[]){
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(11);
		arr.add(4);
		arr.add(22);
		arr.add(5);
		
		System.out.println(arr);
		
		System.out.println(arr.get(1));
		System.out.println(arr.set(1, 111111));
		System.out.println(arr.get(1));
		System.out.println("***********************************************************for each");
		for(int a:arr){
			System.out.println(a);
		}
		System.out.println("***********************************iterator");
		
		Iterator<Integer> itr = arr.iterator();
		
		while(itr.hasNext()){
			int printIterator = itr.next();
			System.out.println(printIterator);
		}
		
		System.out.println("***********************************************************for");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}
}
